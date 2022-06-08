package com.greatlearning.datastructures.array;
import java.io.*;
import java.util.Scanner;

public class SmartArray {
    private int [] smartArray;
    private int size;
    private int capacity;
    
    void createArray(int length){
        size = length;
        capacity = length;
        smartArray = new int [length];
        System.out.println("Smart Array of size "+size+" and capacity "+capacity+" with hashMap "+smartArray+" is succesfully created");
    
    }
    void fillArray(){
        //use Scanner class to populate array by user input values
       try (Scanner arrayScanner  = new Scanner(System.in)) {
            System.out.println("Please enter array elements of length "+size);
            for (int i =0; i<size; i++){
                System.out.println("Please enter "+(i+1)+" element");
                smartArray[i] = arrayScanner.nextInt();
            }
            System.out.println("The SmartArray filler has completed execution");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    int length(){
        //returns length oif array
        int length =0;
        if (size <= capacity){
            for (int i =0; i<capacity; i++){
                if ( smartArray[i] >=0 ){
                    length++;
                }
                
            }
            return length;
        }else{
            System.out.println("Something went wrong");
            return 0;
        }
    }
    void traverse(){
        //display all the values present in the array from  0 to  size
        System.out.print("[");
        int f=0;
        for (int i : smartArray) {
            if(f==capacity-1){
                System.out.print(i);
                
            }else{
                
                System.out.print(i+", ");
            }
            
            f++;
        }
        System.out.println("]");
        
    }
    int searchL(int key){
        //search an element using linear search algo
        for (int i : smartArray) {
            if(i==key){
                return 1;
            }
            
        }
        return 0;
        
    }
    int searchB(int key){
        //search an element using binary search algo
        return 0;
    }
    int searchJ(int key){
        //search an element using Jump search algo

        return 0;
    }
    void sortB(){
        //sort the array using bubble sort algorithm
    }
    void sortS(){
        //sort the array using selection sort algorithm
    }
    void sortI(){
        //sort the array using insertion sort algorithm
    }
    void insert(int element){
        //insert lement at the end of array if size<capacity
        if(size<capacity){
            smartArray[size +1] = element;
            System.out.println("The Element "+element+" has been pushed to the array!");
        }else{
            int [] swapArray = new int [capacity*2];
            capacity *= 2;
            int count = 0;
            for (int i : smartArray) {
                // if(count>(capacity/2)){
                //     swapArray[((capacity-count)-1)] = -1;

                // }
               swapArray[count++] = i;
                
            }  
            smartArray = new int [capacity];
            smartArray = swapArray.clone();
            for(int i=size; i<capacity; i++)
                smartArray[i]=-1;
            smartArray[size++] = element;
            System.out.println("The Element "+smartArray[size-1]+" has been pushed to the array!");            
        }
    }
    void insert(int element, int index){
        //insert element at index position inthe array if size<capacity
    }
    void delete(int element){
        //delets an element passed by the user
    }
    void deleteAt(int index){
        //delets an element on index passed by the user
    }


}