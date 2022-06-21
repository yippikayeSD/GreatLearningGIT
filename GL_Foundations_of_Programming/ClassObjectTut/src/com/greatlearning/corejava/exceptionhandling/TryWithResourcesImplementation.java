package com.greatlearning.corejava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesImplementation {
    
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DXYT\\Desktop\\demo-file.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath,true)){
            String content="";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("----Welcome to File Writer------");
            System.out.println("Please enter content of file.");
            content = bufferedReader.readLine();
            //content.getBbytes() converts string input in byte array as
            // fileOutputStream.write() method accepts byte array as argument
            fileOutputStream.write(content.getBytes());
            System.out.println("File Written Succesfully");
            System.out.println("----Goodbye from File Writer------");

        }catch(FileNotFoundException e){
            System.err.println("The operation terminated with error: "+e.getMessage());

        }catch(IOException e){
            System.err.println("The I/O operation terminated with error: "+e.getMessage());
        }
    }
}