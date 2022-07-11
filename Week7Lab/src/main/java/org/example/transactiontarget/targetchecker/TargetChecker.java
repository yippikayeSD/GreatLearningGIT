package org.example.transactiontarget.targetchecker;

public class TargetChecker {


//    Can use long since problem statement says thousands of transactions
    int transactionTotal = 0;
    int transactionTarget;
    int [] transactionArray;
    public TargetChecker(int[] transactionArray, int transactionTarget) {
        this.transactionArray=transactionArray;
        this.transactionTarget=transactionTarget;
        transactionChecker(transactionArray, transactionTarget);
    }


    private void transactionChecker(int[] transactionArray, int transactionTarget) {
        for(int i = 0; i< transactionArray.length; i++){
            transactionTotal += transactionArray[i];
            if(transactionTotal >= transactionTarget){
                System.out.printf("Target achieved in %d transaction!\n",i+1);
                break;
            }
        }
        if(transactionTotal < transactionTarget){
            System.out.println("Target not achieved");
        }
    }
}
