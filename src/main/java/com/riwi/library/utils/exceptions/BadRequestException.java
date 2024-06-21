package com.riwi.library.utils.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}