package com.greatlearning.corejava;

public class Customer {
    private Health customerHealth = new Health();
    private int id;
    
    protected void getID(){
        System.out.println("The ID is: "+ id);

    }
    protected void getCustomerHealth(){
        customerHealth.getHealth();
        
    }
    protected void setHealth(int customerID, Health newCustomerHealth){
        customerHealth.setHealth(newCustomerHealth.age, newCustomerHealth.weight);
        System.out.println("The new health stats of customer with id:" +customerID+" is :");
        customerHealth.getHealth();
    }



    
}
