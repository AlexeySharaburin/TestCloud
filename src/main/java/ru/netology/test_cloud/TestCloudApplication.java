package ru.netology.test_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCloudApplication.class, args);
        System.out.println("Welcome");
    }

}
