package com.greatlearning.datastructures.search;

public class BinarySearch {
    
    int search(int[] dataSet, int keyElement, int size ){
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

}
