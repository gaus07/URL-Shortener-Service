package com.example.spring_boot_url_shortener;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtility {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        // Passwords for both email got exchanged
        System.out.println(encoder.encode("secret"));
        System.out.println(encoder.encode("admin"));
    }
}
