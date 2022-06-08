package com.greatlearning.corejava;
class Person{
    void speak(){
        System.out.println("I am a person");
    }
}
class Child extends Person{
    void speak(){
        System.out.println("I am a child");
        // super.speak();
    }
}
public class OverridingImplementation {
    public static void main(String[] args) {
        Person boy = new Child();
        boy.speak();
        
        Person man = new Person();
        man.speak();
        
    }
    
    
}
