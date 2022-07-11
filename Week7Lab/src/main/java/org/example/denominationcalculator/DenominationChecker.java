package org.example.denominationcalculator;

import java.util.*;

public class DenominationChecker {

    public void calculate() {

        System.out.println("---Welcome to the denomination checker app!---");
        System.out.println("Please enter Number of currency Denominations");
        Scanner inputScanner = new Scanner(System.in);

        Integer[] denominations = new Integer[inputScanner.nextInt()];
        for (int i = 0; i < denominations.length; i++) {
            System.out.printf("Please enter denomination %d: ", i);
            denominations[i] = inputScanner.nextInt();


        }
        int left = 0;
        int right = denominations.length-1;
        sortArray(denominations, left, right);
        Arrays.sort(denominations);
        try {
            /*for (int i = 0; i < denominations.length; i++) {

                System.out.println(denominations[i]);
            }*/
            System.out.println("Please enter the amount of Payment!");
            int payment = inputScanner.nextInt();
            int[] paymentDenomination = new int[denominations.length];
            for (int i = denominations.length - 1; i >= 0; i--) {
                if (payment >= denominations[i]) {

                    paymentDenomination[i] = payment / denominations[i];

                    payment = payment - (denominations[i] * paymentDenomination[i]);
                }
            }
            if (payment > 0) {
                System.out.println("exact amount cannot be given with available denominations.");
            } else {
                System.out.println("You payment approach in order to give minimum no of notes will be:");
                for (int i = denominations.length - 1; i >= 0; i--) {
                    if (paymentDenomination[i] != 0) {
                        System.out.println(denominations[i] + ": " + +paymentDenomination[i]);

                    }
                }
            }
//            [10,3,2] target = 13/-
//            2/- X6 = 12 | 1/- balance
//            10/- X1, 3/- X1 = 13/-


/*      [1,3,5,7,10] target=12 => 10/- 1 note 1/- 2 notes
            optimized solution will be 5/- X1 , 7/- X1
            create a 2-d array for all possible values and then find the minimum value : Dynamic Programming*/
        }catch(ArithmeticException e){
            e.printStackTrace();

        }
        /*List<Integer> al = new ArrayList<Integer>(Arrays.asList(denominations));
        Collections.addAll(al,denominations);
        Collections.sort(new ArrayList<Integer>(Arrays.asList(denominations)));*/


    }


    private void sortArray(Integer[] denominations, int left, int right) {

        if(left<right){
            int mid = (left + right) / 2;
            sortArray(denominations,left, mid);
            sortArray(denominations, mid+1, right);
            merge(denominations, left, mid, right);
        }


    }

    private void merge(Integer[] denominations, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;

        Integer[] leftArray = new Integer[n1];
        Integer[] rightArray = new Integer[n2];
//Copying in to left array
        for (int i =0; i<n1; i++){
            leftArray[i] = denominations[left+i];
        }
//        Copying into right array
        for (int j = 0; j<n2; j++){
            rightArray[j] = denominations[j+mid+1];
        }

        int pointerLeft=0;
        int pointerRight=0;

        int finalPointer =left;


        while(pointerLeft<n1 && pointerRight<n2){
            if(leftArray[pointerLeft]>=rightArray[pointerRight]) {
                denominations[finalPointer] = leftArray[pointerLeft];
                pointerLeft++;
            }else{
                denominations[finalPointer]=rightArray[pointerRight];
                pointerRight++;
            }
            finalPointer++;


        }
//Copying remaining elements to array
        while(pointerLeft<n1){
            denominations[finalPointer] = leftArray[pointerLeft];
            pointerLeft++;
            finalPointer++;
        }
        while(pointerRight<n2){
            denominations[finalPointer] = rightArray[pointerRight];
            pointerRight++;
            finalPointer++;
        }


    }
}
