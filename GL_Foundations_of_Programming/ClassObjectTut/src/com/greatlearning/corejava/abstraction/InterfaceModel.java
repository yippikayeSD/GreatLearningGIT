package com.greatlearning.corejava.abstraction;

public interface InterfaceModel {

    // All variables in an interface are implicitly public final static.
    String name="Rajesh";
    int age=42;
    int score=420;
    public static void  onInit(){
        //can define static methods
        System.out.println("Interface is starting");
    }
    public default int calculateAverageScore(){
        // Default methods are methods that can have a body.
        // Provide additional functionality to a given type
            // without breaking down the implementing class
        /*
         * Before Java 8, if a new method was introduced in an
         * interface then all the implementing classes 
         * used to break. 
         * We would need to provide the implementation of that
         * method in all the implementing classes.

         *   However, sometimes methods have only single
         *   implementation and there is no need to provide 
         *   their implementation in each class.
         *   In that case, we can declare that method as 
         *   a default in the interface and provide its
         *   implementation in the interface itself.
         */
        int average=age*score/(age*334);
        return average;
    }

    //All methods declared in an interface need to be explicitly
    // defined by implementing class
    public void display();
    public float calculateFloatingAverageScore();

}
