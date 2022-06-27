package com.jouhar.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import lombok.Data;

@Data
@SpringBootApplication
public class WebappApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }


}