package com.mobileshop.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodedPasswordUtil {
	
    public static String encode(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
