package org.example;

import org.example.denominationcalculator.DenominationChecker;
import org.example.transactiontarget.targetchecker.TargetChecker;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("----Welcome to PayMoney App---");
            System.out.println("Please press 1 for transaction validation...");
            System.out.println("Please press 2 for xxxx...");
            System.out.println("Please press 3  to exit...");
            Scanner inputScanner = new Scanner(System.in);
            int userChoice = inputScanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Please enter size of transaction array!");
                    int arraySize = inputScanner.nextInt();
                    int[] transactionArray = new int[arraySize];
                    for(int i = 0; i<arraySize; i++){
                        System.out.printf("Please enter the values of %d transaction: ",i+1);
                        transactionArray[i]=inputScanner.nextInt();
                    }
                    System.out.println("Please enter value of target transaction! ");
                    int transactionTarget = inputScanner.nextInt();
                    TargetChecker checkTarget = new TargetChecker(transactionArray,transactionTarget);
                    break;
                case 2:
                    System.out.println("---transfering to DenominationChecker App---");
                    DenominationChecker denomination = new DenominationChecker();
                    denomination.calculate();
                    break;
                case 3:
                    exit = true;
                    break;
            }


        }
    }
}
