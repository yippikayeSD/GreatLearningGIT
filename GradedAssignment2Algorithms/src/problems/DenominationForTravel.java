package problems;

import service.SortingService;

import java.util.Scanner;

public class DenominationForTravel {
    /* Created by SDixit-MSC on 15-07-2023 inside the package - problems
     *   @Author - SDixit-MSC
     */
    public DenominationForTravel(){
        init();
    }

    private void init() {
        int noOfTargets = 0;
        int paymentAmount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------- Welcome Denomination For Travel -----------------");
        System.out.println("Please enter the size of currency denomination array");
        int arraySize = scanner.nextInt();
        int[] denominationArray = new int[arraySize];
        System.out.println("Please enter the currency denomination values");
        for (int i =0; i < arraySize; i++){
            System.out.println(String.format("please enter %dth value", i + 1));
            denominationArray[i] = scanner.nextInt();
        }
        System.out.println("Please enter the amount you want to pay");
        paymentAmount = scanner.nextInt();
        denominationArray = SortingService.sortDescending(denominationArray);

        System.out.println("---------------Denomination Calculation Starts ----------------");
        System.out.println("Your payment approach in order to give min no of notes will be:");
        CheckDenomination(paymentAmount, arraySize, denominationArray);


    }

    private void CheckDenomination(int paymentAmount, int arraySize, int[] denominationArray) {
        int noOfNotes = 0;
        for (int i = 0; i < arraySize; i++) {
            noOfNotes = paymentAmount / denominationArray[i];
            if(noOfNotes > 0){
                System.out.println(denominationArray[i] +"||"+ paymentAmount / denominationArray[i]);
            }
            paymentAmount -= denominationArray[i]*(paymentAmount / denominationArray[i]);
        }
    }
}
