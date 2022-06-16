package com.banking.models;

public class Customer {
    private String accountNo;
    private String name;
    private int accountBalance;
    //Constuctor    
   public Customer(String name, String accountNo){
        this.name = name;
        this.accountNo = accountNo;
        accountBalance = 4500;

    }

    //Setter Methods
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Getter Methods
    public int getAccountBalance() {
        return accountBalance;
    }
    public String getName() {
        return name;
    }
    public String getAccountNo() {
        return accountNo;
    }

    
}
