package com.greatlearning.corejava;

class Account{
    String customerName;
    int accountNo;
    Account(String customerName, int accountNo){
        this.customerName = customerName;
        this.accountNo = accountNo;
        
    }
    void display(){
        System.out.println("The Name of Account Holder is: "+customerName);
        System.out.println("The Account number of"+customerName+" is: "+accountNo);

    }

}


class CurrentAccount extends Account{
    int currentBalance;
    CurrentAccount(String customerName, int accountNo, int currentBalance) {
        super(customerName, accountNo);
        this.currentBalance = currentBalance;

    }
    void display(){
        System.out.println("The Name of Account Holder is: "+super.customerName);
        System.out.println("The Account number of"+super.customerName+" is: "+super.accountNo);
        System.out.println("The Account Balance of"+super.customerName+" with Account Number "+super.accountNo+" is:"+currentBalance);
        
    }

}


class AccountDetails extends CurrentAccount{
    int depositAmount;
    int withdrawalAmount;
    AccountDetails(String customerName, int accountNo, int currentBalance, int depositAmount, int withdrawalAmount){
        super(customerName, accountNo, currentBalance);
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;

    }
    void display(){
        System.out.println("Name: "+super.customerName);
        System.out.println("Account Nmuber: "+ super.accountNo);
        System.out.println("Current Balance : "+super.currentBalance);
        System.out.println("Deposit Amount : "+ depositAmount);
        System.out.println("Withdrawal Amount : "+withdrawalAmount);
    }
}



public class MultilevelInheritenceImplementation {
    public static void main(String[] args) {
        AccountDetails newCustomer = new AccountDetails("Hrushikesh", 4748599, 4512, 2500, 7000);
        newCustomer.display();
    }
}
