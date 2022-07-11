package org.example.search;

public class BinarySearch {

    public int pivotedBinarySearch(int[] inputData, int key, int length){
        int pivot =  findPivot(inputData, 0,length-1);

        int index = -1;

        return index;
    }

    private int findPivot(int[] inputData, int low, int high) {
        if(high<low){
            return -1;
        }else if(high == low){
            return low;
        }
        int mid= low+high/2;
        if(mid<high && inputData[mid]>inputData[mid+1]){
            return mid;
        } else if (mid>low &&inputData[mid]<inputData[mid+1]) {
            return mid-1;

        } else if (inputData[low] >= inputData[mid]) {
            return findPivot(inputData, low, mid-1);
        }
        return findPivot(inputData, low, high);
    }
}
