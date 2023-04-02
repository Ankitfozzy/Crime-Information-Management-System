package com.masai.exceptions;

public class CriminalNotFound extends RuntimeException{
    public CriminalNotFound() {}
    public CriminalNotFound(String message) {
        super(message);
    }
}
