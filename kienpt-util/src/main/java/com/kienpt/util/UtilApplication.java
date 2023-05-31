package com.kienpt.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kienpt")
public class UtilApplication {
    public static void main(String[] args) {
        //insert
        System.out.println("kaka");
    }
}
