package org.example.controller;

import org.example.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    @Autowired
    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if ("testUser".equals(username) && "testPassword".equals(password)) {
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }
}

