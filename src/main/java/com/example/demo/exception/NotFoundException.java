package com.example.demo.exception;


//the @ResponseStatus allow us to change the status code.

public class NotFoundException extends RuntimeException{
    
    public NotFoundException(String message){
        super(message);
    }
}
