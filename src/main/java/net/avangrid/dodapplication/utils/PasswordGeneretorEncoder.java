package net.avangrid.dodapplication.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGeneretorEncoder {
    public static void main(String[] args){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("password"));
        System.out.println(passwordEncoder.encode("123"));
        System.out.println(passwordEncoder.encode("key"));
    }
}
