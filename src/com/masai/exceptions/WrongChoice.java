package com.masai.exceptions;

public class WrongChoice extends  RuntimeException{
    public WrongChoice() {}
    public WrongChoice(String message) {
        super(message);
    }
}
