package com.garnerju.BasicWebsite.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtil {

    public static void main(String[] args) {

        PasswordEncoder encoder = new BCryptPasswordEncoder();

        String password = "password";

        String encodedPassword = encoder.encode(password);

        System.out.println(encodedPassword);
    }
}
