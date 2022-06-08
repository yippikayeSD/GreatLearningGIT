package com.greatlearning.corejava;

public class PolymorphismImplementation {
    void createUser(String name){
        System.out.println("User Created with name :"+name );
    }
    void createUser(String name, int phoneNumber){
        System.out.println("User Created with name: "+name+" and Phone Number: "+phoneNumber);
        
    }
    void createUser(String name, Long phoneNumber){
        
        System.out.println("User Created with name: "+name+" and Long Phone Number: "+phoneNumber);
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        PolymorphismImplementation
        objPoly = new PolymorphismImplementation();
        objPoly.createUser("Shubham");
        objPoly.createUser("Shubham",458745);
        objPoly.createUser("Shubham",45874545466l);
        


    }
}
