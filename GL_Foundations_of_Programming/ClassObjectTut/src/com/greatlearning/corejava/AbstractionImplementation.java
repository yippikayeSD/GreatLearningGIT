package com.greatlearning.corejava;


abstract class AbstractionPartial{
    abstract void display();
    void printTrue(){
        System.out.println("True from abstract class");
    }
}
abstract class AbstractionComplete{
    abstract void display();
    abstract void printTrue();
}

class DisplayAbstractionPartial extends AbstractionPartial{
    void display(){
        System.out.println("Partial Abstraction from display class");
    }
    
}

class DisplayAbstractionComplete extends AbstractionComplete{
    void display(){
        System.out.println("Display from Display Class");
    }
    void printTrue(){
        System.out.println("True from Display Class");
    }
}
public class AbstractionImplementation {

    
    public static void main(String[] args) {
        AbstractionComplete objComplete = new DisplayAbstractionComplete();
        objComplete.display();
        objComplete.printTrue();
        AbstractionPartial objPartial = new DisplayAbstractionPartial();
        objPartial.display();
        objPartial.printTrue();
    }
}