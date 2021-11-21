package com.bobocode.demo;

import com.bobocode.demo.client.NasaPicturesClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocDemoApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.bobocode.demo");
        var nasaClient = context.getBean(NasaPicturesClient.class);
           nasaClient.getAllPicturesUrl()
                   .forEach(System.out::println);

    }
}
