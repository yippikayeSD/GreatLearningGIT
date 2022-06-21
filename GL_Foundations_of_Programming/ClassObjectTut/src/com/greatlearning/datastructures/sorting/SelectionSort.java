package com.greatlearning.datastructures.sorting;

public class SelectionSort {
    
    public int[] sort(int[] dataSet){
        int size = dataSet.length;
        int i=0;
        int j=0;
        int smallestIndex =0;
        int smallest = dataSet[0];
        if(size>1){
            for(i =0; i<size; i++){
                smallestIndex =i;
                smallest = dataSet[i];
                for(j=i+1; j<size; j++){
                    if(dataSet[j]<smallest){
                        smallest = dataSet[j];
                        smallestIndex =j;
                    }


                }
                if(smallest != dataSet[i]){

                    dataSet[i] = dataSet[smallestIndex]+ dataSet[i];
                    dataSet[smallestIndex] = dataSet[i]-dataSet[smallestIndex] ;
                    dataSet[i] = dataSet[i]- dataSet[smallestIndex];
                }

            }

        }


        return dataSet;
    }
}
