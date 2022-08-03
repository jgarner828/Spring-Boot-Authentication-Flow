package com.garnerju.BasicWebsite.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PassEncoder {


    public String encodeUserPassword(String input) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(input);
    }
}

