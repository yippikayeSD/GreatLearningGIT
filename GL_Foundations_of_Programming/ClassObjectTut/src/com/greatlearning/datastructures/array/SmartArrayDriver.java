package com.greatlearning.datastructures.array;
public class SmartArrayDriver {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        smartArray.createArray(10);
        smartArray.fillArray();
        smartArray.traverse();
        smartArray.length();
        smartArray.insert(45);
        System.out.println(smartArray.length());
        smartArray.traverse();
        System.out.println(smartArray.searchL(98));
    }
    
}
