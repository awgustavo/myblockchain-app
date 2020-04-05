package com.awsys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan( basePackages = {
        "com.awsys.app.routes",
        "com.awsys.app.business",
        "com.awsys.app.model",
        "com.awsys.app.dao"
    })
public class App {
    public static void main( String[] args ) {
        System.out.println( "Running SpringBoot API..." );
        SpringApplication.run(App.class, args);
    }
}
