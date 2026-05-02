package com.example.zomato.exceptions;

public class RestaurantNotFound extends RuntimeException{

    public RestaurantNotFound(String message){
        super(message);
    }
}
