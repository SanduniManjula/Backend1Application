package org.example.config;

import org.example.utils.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public JwtUtil jwtUtil() {
        return new JwtUtil();
    }
}
