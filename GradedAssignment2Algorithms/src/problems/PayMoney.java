package problems;

import java.util.Scanner;

public class PayMoney {
    /* Created by SDixit-MSC on 15-07-2023 inside the package - problems
     *   @Author - SDixit-MSC
     */

    public PayMoney() {
        init();
    }

    private void init() {
        int noOfTargets = 0;
        int valueOfTargets = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------- Welcome to PayMoney -----------------");
        System.out.println("Please enter the size of transaction array");
        int arraySize = scanner.nextInt();
        int[] transactionArray = new int[arraySize];
        for (int i = 0; i < transactionArray.length; i++) {
            System.out.println(String.format("please enter %dth value", i + 1));
            transactionArray[i] = scanner.nextInt();
        }
        System.out.println("Please enter total no of targets that needs to be achieved");
        noOfTargets = scanner.nextInt();
        do {
            System.out.println("Please enter value of Target");
            valueOfTargets = scanner.nextInt();
            System.out.println(checkTargetAchieved(valueOfTargets, transactionArray));
            noOfTargets--;
        } while (noOfTargets > 0);

    }

    private String checkTargetAchieved(int valueOfTargets, int[] transactionArray) {
        for (int i = 0; i < transactionArray.length; i++) {
            valueOfTargets -= transactionArray[i];
            if (i < transactionArray.length && valueOfTargets <= 0) {
                return String.format("Target achieved after %d transactions", i + 1);
            }
        }
        return "Target was not achieved";
    }
}
