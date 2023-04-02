package com.masai.exceptions;

public class CrimeNotFound extends RuntimeException {
    public CrimeNotFound() {}
    public CrimeNotFound(String message) {
        super(message);
    }
}
