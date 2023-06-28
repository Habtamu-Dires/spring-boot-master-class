package com.example.demo.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

/*recod give's us -private final field, getter for each field,
 *                -public constructur, toString, Equals and Hashs
 *  -the purpose of record is to achive immutability 
 */

public record ApiException(String message, 
                            Throwable throwable,
                            HttpStatus httpStatus, 
                            ZonedDateTime zonedDateTime) {
    

}


