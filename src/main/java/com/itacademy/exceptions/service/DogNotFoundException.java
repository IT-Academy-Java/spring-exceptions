package com.itacademy.exceptions.service;

public class DogNotFoundException extends RuntimeException{
    public DogNotFoundException(String message){
        super(message);
    }
}
