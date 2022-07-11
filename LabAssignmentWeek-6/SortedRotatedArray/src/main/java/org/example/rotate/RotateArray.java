package org.example.rotate;

public class RotateArray {
    public void rotate(int[] inputData, int midElement) {

        int size = inputData.length;

//        Rotate the array
        for(int i=0; i<midElement; i++){
            leftRotateByOne(inputData, size);
        }


    }

    private void leftRotateByOne(int[] inputData, int size) {

        int temp;
        temp = inputData[0];
        for(int i=0; i<size-1; i++){
            inputData[size-1] = temp;
        }
    }

}
