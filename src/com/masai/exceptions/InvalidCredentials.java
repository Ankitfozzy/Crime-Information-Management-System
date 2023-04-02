package com.masai.exceptions;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials() {}
    public InvalidCredentials(String message) {
        super(message);
    }
}
