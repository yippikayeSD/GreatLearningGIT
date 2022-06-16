package com.greatlearning.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsImplementation {
    

    /*
     * Delayed Exception handling
     * using throws/throw keyword
     * this is used to give the callee method the choice to not handle the excpetion
     *  nad propagate it to the caller code
     * 
     * Inthis case IOException is thrown to JVM
     */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        FileReader fileReader= null;

        try{
            fileReader =  new FileReader("src\\algorithm.txt");
            reader = new BufferedReader(fileReader);

            for(int count = 0; count<10; count ++){
                System.out.println(reader.readLine());
            }
            ExceptionDemo exceptionObject = new ExceptionDemo();
            // exceptionObject.display();
            exceptionObject.displayThrow();
        }catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Exception Handled in ThrowsImplementation Class");
            System.err.println("Exception: "+e.getMessage());
        }catch(RuntimeException e){
            System.out.println("catching custom exception in caller class");
            System.err.println("Custom Message :"+ e.getMessage());
        }
        
    }
}

class ExceptionDemo{
    void display() throws ArithmeticException{
        System.out.println(0/0);
    }
    void displayThrow(){
        /*
         * 
         runtime exceptions are not checked at complie time 
         it is not considered good practice to throw any runtime exception.
         it is best to handle them in callee code.
         throw is used to handle an exception explicitly

        */
        throw new RuntimeException("Runtime Exception with Custom Messagae");
    }
}
