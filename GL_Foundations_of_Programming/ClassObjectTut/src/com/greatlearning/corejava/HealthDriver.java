package com.greatlearning.corejava;

public class HealthDriver {
    public static void main(String[] args) {
        Health h1 = new Health();
        h1.setHealth(32,69.5f);
        // h1.getHealth();
        Customer newCustomer = new Customer();
        newCustomer.setHealth(44, h1);

        
        

    }
}
