package org.example;

import org.example.rotate.RotateArray;
import org.example.search.BinarySearch;
import org.example.sort.MergeSort;

import java.util.Scanner;

/**
 *  Write a program to find the key element in sorted and rotated Array (from middle element its rotated)
 *
 *
 * 	 Arr[] = {3,4,2,1,9,8,7}  //original array
 *
 * 	 ArrSorted[] = {1,2,3,4,7,8,9}  //sorted array
 *
 * 	 {9,1,2,3,4,7,8} //1 rotation
 * 	 {8,9,1,2,3,4,7}
 * 	 {7,8,9,1,2,3,4} //rotated array
 *
 * 	 ArrRotated[] = {7,8,9,1,2,3,4} //rotated array
 *
 * 	 Key = 8  //1
 *
 *
 * 	take input array from the user
 * 	sort the array with mergesort
 * 	rotate the array
 * 	search to find the element.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BinarySearch binarySearch = new BinarySearch();
        MergeSort mergeSort = new MergeSort();
        RotateArray rotateArray = new RotateArray();
        System.out.println( "----Welcome to lab Assignment 2 - Week:6----" );
        System.out.println("Please enter size of array");
        Scanner inputScanner = new Scanner(System.in);
        int[] inputData = new int[inputScanner.nextInt()];

        for(int i = 0 ; i < inputData.length; i++){
            System.out.printf("Please enter %d element: ",i);
            inputData [i] = inputScanner.nextInt();

        }
        int left = 0;
        int right = inputData.length;
        mergeSort.sort(inputData, left, right);


//        Rotate the array
        int midElement = inputData[(left+right)/2];
        rotateArray.rotate(inputData,midElement);



    }
}
