package com.crio.rentread.exception;

public class EmailExistException extends RuntimeException{
    public EmailExistException(String msg){
        super(msg);
    }
}
