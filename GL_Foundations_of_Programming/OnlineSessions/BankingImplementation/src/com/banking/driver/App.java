package com.banking.driver;

import java.util.Scanner;

import com.banking.services.Login;

public class App {
    public static void main(String[] args) throws Exception {

        boolean exit = false;
        System.out.println("Welcome to Banking App!");
        while ( exit == false){

            //Displaying initial menu
            System.out.println("Please Select the following option:");
            
            System.out.println(" 1 - Login");

            System.out.println(" 2 - Exit");
            
            //taking user input with Scanner class
            Scanner sc = new Scanner(System.in);
            
            int userInput = sc.nextInt();
            if(userInput == 1){
                Login.login();
                
            }else if ( userInput == 2){
                break;
            }else{
                System.out.println("Please enter correct input");
                
            }
        }
        
    }
}
