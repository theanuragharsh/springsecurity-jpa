package com.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUserInfo() {
        return ResponseEntity.ok("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminInfo() {
        return ResponseEntity.ok("<h1>Welcome Admin</h1>");
    }
}
