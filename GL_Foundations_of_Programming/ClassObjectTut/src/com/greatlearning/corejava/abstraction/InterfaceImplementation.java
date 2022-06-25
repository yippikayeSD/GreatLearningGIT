package com.greatlearning.corejava.abstraction;

public class InterfaceImplementation implements InterfaceModel{

    
    
    
    
    @Override
    public void display() {
        //can be called without object creation
        InterfaceModel.onInit();
        //can access data members of inteerface as constants
        System.out.println("Name: "+name);
        //final fields cannot be modified
        // System.out.println("Age: "+(age++));
        System.out.println("Age: "+(age));
        System.out.println("Average int: "+calculateAverageScore());
        System.out.println("Average float: "+calculateFloatingAverageScore());

        
    }

    @Override
    public float calculateFloatingAverageScore() {
        //cannot have private member in a public method
        // private float average = age*score/(age*334);
        float average = age*score/(age*334.75f);
        return average;
    }

    public static void main(String[] args) {
        new InterfaceImplementation().display();
    }
    
}
