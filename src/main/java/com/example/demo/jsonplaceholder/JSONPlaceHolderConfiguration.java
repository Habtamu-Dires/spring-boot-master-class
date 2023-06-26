package com.example.demo.jsonplaceholder;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {
    
    @Bean("jsonplaceholdser")
    CommandLineRunner runner(JSONPlaceHolderClient 
                                jsonPlaceHolderClient){
        return args -> {
            System.out.println(
                "https://jsonplaceholder.typicode.com/posts/");
            System.out.println(
                jsonPlaceHolderClient.getPostes().size());
            
            System.out.println();
            System.out.println(
                "https://jsonplaceholder.typicode.com/1");
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
