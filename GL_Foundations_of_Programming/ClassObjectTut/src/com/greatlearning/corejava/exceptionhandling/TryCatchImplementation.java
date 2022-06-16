package com.greatlearning.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryCatchImplementation {
/*
if we are accesing a data set that may be 
coming as an argument and copied and performed with some operations, 
We need to handle exceptions for that by surronding it in try block
network calls
REST endoint calls
JDBC calls
etc etc
 */    
public static void main(String[] args) {
    //declaring null references outside try block so it can be closed by cleanup code in finally

    FileReader newFileReader = null;
    BufferedReader bufferedFileReader = null;
    try {
        List<Integer> list = new ArrayList <>(10);
        System.out.println("Entering "+"the try statement");
        list.add(10);
        Integer a = list.get(0);
        System.out.println("First element: "+a);
        //creatingobject in try block since we want to try this code for various exceptions
        newFileReader = new FileReader("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Foundations_of_Programming\\ClassObjectTut\\src\\algorithm.txt");
        bufferedFileReader = new BufferedReader(newFileReader);
    }
    /*
     * Need for multiple catch blocks arises when we have code that has a probability 
     * to throw multiple Exceptions
     * There can be only one exception caught
     * The code succeeding the line where exception was caught will not execute
     * The control will jump to the matching catch block and then finally(if exists)
     * The Catch blocks should be specified in a pyramid based structure
     * the heirachically smaller or the more precise exceptions should be defined first
     * If IOException is defined before FIleNOtFoundException, since it extends IOExcepton
     * The Catch(IOException) will always catch FileNotFoundException 
     *  Catch(FileNotFoundException) will never be executed
     */
    
    catch (IndexOutOfBoundsException e) {
        System.err.println("Caught IndexOutOfBoundException: " + e.getMessage());
    } catch (FileNotFoundException e) {
        
        System.err.println("Caught FileNotFoundException: " + e.getMessage());
        // e.printStackTrace();
    
    }catch(ArithmeticException  | NullPointerException e  ){
            /*
             * Multiple exceptions can also be defined like this if we want the same code to be executed 
             *  for multiple exceptions
             */
    }
     finally{
        /*
         * optional
         * can be put immideately after the try block
         * it is executed always, if defined
         * used for code cleanup after the exception is caught
         * closing open network connections, JDBC connections, 
         * REST calls, Scanner, FileReader, BufferedReader etc.
         * closing resources is a critical aspect of memory efficient code
         * enterprise aplications : code will not pass through
         *  continuous integration pipelines if we do not close resources
         * 
         * 
         */
        //checking if FileReader Object is initialized in try block or not
        
        //Also Called Defensive Programming, when we check for the state of objects before using them.
        //if buffered reader and file reader handelers are tried to close and they haven't been initiallized, 
        //this will result in null pointer exception


        if(bufferedFileReader != null){
            //Since closing a connection is an unsafe code and may result in Excepion
            /* when we are using bufferedFileReader.close(), java will not know if 
             the path is correct or not to close it.
             We are not sure if the path is modified or so. 
             The IOException defined is only for accessing the file. 
             That cannot be used for clean up purpose. */
            try {
                bufferedFileReader.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }
        if(newFileReader != null){
            try {
                newFileReader.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }

         System.out.println("Will be definitely executed");
    }
}
}
