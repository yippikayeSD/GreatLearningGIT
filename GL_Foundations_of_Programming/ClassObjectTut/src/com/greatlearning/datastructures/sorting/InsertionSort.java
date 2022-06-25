package com.greatlearning.datastructures.sorting;

public class InsertionSort {
    public int[] sort(int[] dataSet){
       int size = dataSet.length;
       int i=0;
       int j=0;
       int partition = 1;
       for (i=1; i<size; i++) {
        for(j=i; j>0; j--){
            if(dataSet[j]<dataSet[j-1]){
                dataSet[j]+=dataSet[j-1];
                dataSet[j-1]=dataSet[j]-dataSet[j-1];
                dataSet[j]-= dataSet[j-1];
                
            }

        }
        
       }
        return dataSet;
    }
    
    
}
