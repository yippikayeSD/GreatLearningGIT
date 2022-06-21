package com.greatlearning.datastructures.sorting;
public class BubbleSortImplementation {
    public int[] sort(int[] dataSet){
        int size = dataSet.length;
        int i=0;
        int j=0;

        if(size>1){
            for (i = 0; i < size; i++) {
                for(j=1; j<size-i; j++){
                    if(dataSet[j] < dataSet[j-1]){
                        dataSet[j] = dataSet[j] + dataSet[j-1];
                        dataSet[j-1]= dataSet[j] - dataSet[j-1];
                        dataSet[j] = dataSet[j] - dataSet[j-1];
                    }
                }
                
            }
            
        }
        return dataSet;

    }
    
}
