package com.example.JWTsSpringBootSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.example.controller","com.example.service","com.example.security"})//this will scan the other packages too
public class JwTsSpringBootSecurityApplication {
    
    @RequestMapping("/hello")
    String hello() {
	return "Hello World!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(JwTsSpringBootSecurityApplication.class, args);
	}
}
