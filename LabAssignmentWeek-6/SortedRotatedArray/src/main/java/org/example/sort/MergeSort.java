package org.example.sort;

public class MergeSort {
    public int[] sort(int[] inputData, int left, int right) {



        if(left<right){
//          find mid-point
            int mid = (left+right)/2;
            sort(inputData, left, mid);
            sort(inputData, mid+1, right);


            merge(inputData, left, mid, right);
        }






        return inputData;
    }

    public void merge(int[] inputData, int left,int right, int mid){
        //find size of temporary arrays
        int n1 = mid-left+1;
        int n2 = right-mid;
        //creating temporary arrays
        int [] leftArray = new int[n1];
        int [] rightArray = new int[n2];

//        Copy data on temp arrays
        for(int i =0 ; i<n1; i++){
            leftArray[i] = inputData[left+i];

        }
        for(int j = 0 ; j<n2;j++){
            rightArray[j] = inputData[mid+1+j];
        }

//        Merge the temp arrays
        int i=0, j=0;

    }
}
