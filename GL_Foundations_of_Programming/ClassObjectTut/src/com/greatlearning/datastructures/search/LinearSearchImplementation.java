package com.greatlearning.datastructures.search;




public class LinearSearchImplementation {
    int search(int[] dataSet, int keyElement, int size){
        boolean status =false;
        
        
        for ( int counter =0; counter <size; counter ++){
            if(dataSet[counter] == keyElement){
                status = true;
                return counter+1;
            }
        }    
        
        
        return -1;
        
    }
    

    

    
}
