package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aiqbal on 9/19/2017.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Controller
public class FeignClientApplication {

    //@Autowired
    //private GreetingClient greetingClient;

    public static void main(String[] args) {

        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting() {
        //System.out.println("========== " + greetingClient.greeting());
        return "greeting-view";
    }
}
