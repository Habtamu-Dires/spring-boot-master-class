package com.example.demo.jsonplaceholder;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/* Open feign is a used to create a rest client */
/* jsonplaceholder privdes fake API */
/* so here we are using FeignClient to consume the fake API by jsonplaceholder */
/* this is example you can use any api to consume inside spring-boot using openFeign */
/* one usage example, if you want to connect microserveres - where one microservice expose api and 
 *  the other consume it. openFiegn is a tool.
 */

@FeignClient(
    value = "jsonplaceholer",
    url = "https://jsonplaceholder.typicode.com/"
    )
public interface JSONPlaceHolderClient {
    
    @GetMapping("posts")
    List<Post> getPostes();

    @GetMapping("posts/{postId}")
    Post getPost(@PathVariable("postId") Integer postId);
}
