package com.greatlearning.datastructures.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;

import com.greatlearning.datastructures.sorting.BubbleSortImplementation;
import com.greatlearning.datastructures.sorting.InsertionSort;
import com.greatlearning.datastructures.sorting.SelectionSort;

public class SearchSortDriver {
    public static void main(String[] args) {

        LinearSearchImplementation linear = new LinearSearchImplementation();
        BinarySearch binary = new BinarySearch();
        BubbleSortImplementation bubble =new BubbleSortImplementation();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        System.out.println("-----Welcome to the Linear Search Program------");
        System.out.println("please enter number of elements to be inserted in the Data Set");
        boolean isSorted = false;
        try (BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in))) {
            int position = -1;
            int userInputLength =Integer.parseInt(bufferedReader.readLine());
            int[] userDataSet = new int[userInputLength];
            int count =0;
            int userKeyElement = -1;
            while (count<userInputLength){
                System.out.printf("Enter the %dth element",(count+1));
                userDataSet[count]= Integer.parseInt(bufferedReader.readLine());
                count++;
            }
            System.out.println("----------Data Set input Complete--------");
            System.out.println("----------Please select an option for choice of Algorithm--------");
            System.out.println("Enter 1 for Binary Search");
            System.out.println("Enter 2 for Linear Search");
            System.out.println("Enter 3 for Sorting using Bubble Sort");
            System.out.println("Enter 4 for Sorting using Selection Sort");
            System.out.println("Enter 5 for Sorting using Insertion Sort");
            int userAlgorithmChoice = Integer.parseInt(bufferedReader.readLine());
            if(userAlgorithmChoice == 1 || userAlgorithmChoice == 2){
                System.out.println("Enter element to be found");
                userKeyElement = Integer.parseInt(bufferedReader.readLine());

            }
            switch(userAlgorithmChoice){
                case 1:
                userDataSet = bubble.sort(userDataSet);
                position = binary.search(userDataSet,userKeyElement, userInputLength);
                break;
                case 2:
                position = linear.search(userDataSet,userKeyElement, userInputLength);
                break;
                case 3:
                isSorted = true;
                userDataSet = bubble.sort(userDataSet);
                System.out.println("-----The Sorted Data Set is -----");
                System.out.print("[");
                for(int i = 0; i<userDataSet.length; i++){
                    System.out.printf(" %d ",userDataSet[i]);
                }
                System.out.print("]");
                break;
                case 4:
                isSorted = true;
                userDataSet = selection.sort(userDataSet);
                System.out.println("-----The Sorted Data Set is -----");
                System.out.print("[");
                for(int i = 0; i<userDataSet.length; i++){
                    System.out.printf(" %d ",userDataSet[i]);
                }
                System.out.print("]");
                break;
                case 5:
                isSorted = true;
                userDataSet = insertion.sort(userDataSet);
                System.out.println("-----The Sorted Data Set is -----");
                System.out.print("[");
                for(int i = 0; i<userDataSet.length; i++){
                    System.out.printf(" %d ",userDataSet[i]);
                }
                System.out.print("]");
                break;
                default: 
                System.out.println("Wrong Choice");
                break;
            }
            if(!isSorted){

                if(position == -1){
                    System.out.printf("Element %d not found",userKeyElement);
                    
                }else{
                    System.out.printf("Element %d found at position %d",userKeyElement,position);
                }
            }
        } catch (IOException e) {
            System.err.printf("An Exception has occured %s. \n-------The program has handled exception-------.",e.getMessage());
        } 
    
    }
}
