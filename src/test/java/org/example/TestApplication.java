package org.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestApplication {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("1234").matches("1234"));
        System.out.println(encoder.encode("1234").matches("1234"));
        //$2a$10$8BvV/abmNYObzasebjJcwumLUutY82Yy.dnpf7qwvViwwp0PLNzvi

    }
}
