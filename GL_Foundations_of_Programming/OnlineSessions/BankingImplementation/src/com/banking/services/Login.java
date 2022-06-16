package com.banking.services;

import java.util.Scanner;

import com.banking.models.Customer;

public class Login {
    static boolean isLoggedIn = false;
    static String name;
    static String accountNumber;
    public static void login(){
        Scanner loginScanner = new Scanner (System.in);
        Customer checkCustomer = new  Customer("shubham", "5205201") ;
        System.out.println("Please enter Name");
        name = loginScanner.nextLine();

        System.out.println("Please Enter Account Number");
        accountNumber = loginScanner.nextLine();

        if(name.equals(checkCustomer.getName()) && accountNumber.equals(checkCustomer.getAccountNo())){
                System.out.println("Login Successful");
                isLoggedIn = true;
                Banking.operations(checkCustomer.getName(), checkCustomer.getAccountNo());
                
                
            }else{
                
                System.out.println("Login Failure");
                
        }
    }

    
}
