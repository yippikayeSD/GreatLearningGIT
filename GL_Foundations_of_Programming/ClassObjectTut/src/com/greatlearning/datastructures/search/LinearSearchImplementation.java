package com.greatlearning.datastructures.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LinearSearchImplementation {
    static  int linearSearch(int[] dataSet, int keyElement, int size){
        boolean status =false;
        
        
        for ( int counter =0; counter <size; counter ++){
            if(dataSet[counter] == keyElement){
                status = true;
                return counter+1;
            }
        }    
        
        
        return -1;
        
    }
    static int binarySearch(int[] dataSet, int keyElement, int size ){
        int left = 0;
        int right = size-1;
        int mid = (left + right)/2;
        boolean status = false;
        while(!status){
            
            if(dataSet[mid]==keyElement){
                status = true;
                return mid;
            }else if(dataSet[mid]>keyElement){
                right = mid-1;
                mid = (left + right)/2;
            }else{
                left = mid+1;
            }
            mid = (left + right)/2; 
            if(left>right){
                status = true;
                //time to exit the loop
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("-----Welcome to the Linear Search Program------");
        System.out.println("please enter number of elements to be inserted in the Data Set");

        try (BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in))) {
            int position = -1;
            int userInputLength =Integer.parseInt(bufferedReader.readLine());
            int[] userDataSet = new int[userInputLength];
            int count =0;
            while (count<userInputLength){
                System.out.printf("Enter the %dth element",(count+1));
                userDataSet[count]= Integer.parseInt(bufferedReader.readLine());
                count++;
            }
            System.out.println("----------Data Set input Complete--------");
            System.out.println("Enter element to be found");
            int userKeyElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("----------Please select an option for choice of Algorithm--------");
            System.out.println("Enter 1 for Binary Search ( only if elements entered in Ascending order.)");
            System.out.println("Enter 2 for Linear Search");
            int userAlgorithmChoice = Integer.parseInt(bufferedReader.readLine());
            switch(userAlgorithmChoice){
                case 1:
                position = binarySearch(userDataSet,userKeyElement, userInputLength);
                break;
                case 2:
                position = linearSearch(userDataSet,userKeyElement, userInputLength);
                break;
            }
            
            if(position == -1){
                System.out.printf("Element %d not found",userKeyElement);
    
            }else{
                System.out.printf("Element %d found at position %d",userKeyElement,position);
            }
        } catch (IOException e) {
            System.err.printf("An Exception has occured %s. \n-------The program has handled exception-------.",e.getMessage());
        } 
    
    }

    
}
