package com.banking.services;

import java.util.Scanner;

import com.banking.models.Customer;

public class Banking {





    static Scanner bankingScanner = new Scanner(System.in);
    public int generateOTP(){
        return 0;
    }

    public static void operations(String name, String accountNo){
        Banking newBank = new Banking();
        Customer oldCustomer = new Customer(name, accountNo);
        boolean exit = false; 
        if(Login.isLoggedIn){
            while(exit == false){
                System.out.println( "==========Welcome to Banking operation=============");
                System.out.println( "Please select the operation");
                System.out.println();
                System.out.println();
    
                System.out.println( "1: Check Balance");
                
                System.out.println( "2: Withdrawal");
                
                System.out.println( "3: Deposit");
                
                System.out.println( "4: Exit");
                int userInput = bankingScanner.nextInt();
                switch(userInput){
                    case 1:
                    System.out.println("Balance for "+oldCustomer.getName()+" is: "+oldCustomer.getAccountBalance());
                    
                    break;
                    case 2:
                    
                    
                    break;
                    case 3:
                    System.out.println("Deposit");
                    break;
                    case 4:
                    System.out.println("Exit");
                    exit = true;
                    break;
                    default:
                    System.out.println("Please Select Propoer Option");
                    break;
                }
            }

        }
    }
    
}
