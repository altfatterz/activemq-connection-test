package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Component
    static class Consumer {

        @JmsListener(destination = "${spring.activemq.queue}")
        public void receive(String text) {
            System.out.println(text);
        }
    }

}




