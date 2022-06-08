package com.greatlearning.corejava;
public class Health {
    protected int age;
    protected float weight, bmi;
   
    protected void getHealth(){
        System.out.println("The age is: "+age+" years.");
        System.out.println("The weight is: "+weight+" KG");
        System.out.println("The bmi is: "+bmi);
    }
    void setHealth(int age, float weight){
        this.age = age;
        this.weight = weight;
        bmi = calculateBMI(age,weight);
    }

    private float calculateBMI(int age, float weight){
        return (age*weight/20.5f);
    }
}
