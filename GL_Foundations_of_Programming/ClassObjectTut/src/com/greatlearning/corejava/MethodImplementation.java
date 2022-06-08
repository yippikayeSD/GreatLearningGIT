package com.greatlearning.corejava;

public class MethodImplementation {
    void display(){
        System.out.println("Method display w/o arg");
    }
    boolean display(int num){
        System.out.println("Method display with arg int: "+num+" returning boolean");;
        return true;
    }
    public static void main(String[] args) {
        MethodImplementation obj = new MethodImplementation();
        obj.display();
        System.out.print(obj.display(45));
    }

    
}
