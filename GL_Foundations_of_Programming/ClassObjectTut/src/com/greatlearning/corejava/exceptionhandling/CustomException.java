package com.greatlearning.corejava.exceptionhandling;

public class CustomException extends Exception{
    
    CustomException(){

    }
    CustomException(String message){
        super(message);
    }
    
}
