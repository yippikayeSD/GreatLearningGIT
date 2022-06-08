package com.greatlearning.datastructures.stackds;

import java.util.Stack;

public class StackImplementation {
    /*
     * Concrete Implementation  of List Interface
     * Implements Last In First Out (LIFO) Stack Data Structure
     * extends Vector<E>
     * Linear Access pattern
     * Operation: 
     *      Push -> add element to top
     *      Pop -> remove element from top
     * Constructor:
     *      Stack() -> creates an empty stack
     * Methods:
     *      empty() -> returns true is stack is empty
     *      peek() -> looks at the top of stack without removing an element from the stack
     *      push( E item) -> pushes an item onto the top of stack
     *      pop() -> Removes the object at the top of stack
     *      search(Object o) -> returns the 1-based position where the element is on the stack
     */

     public static void main(String[] args) {
         Stack<String> newStack = new Stack();
         
         System.out.println(newStack.isEmpty());
         System.out.println(newStack.empty());

        newStack.push("Shubham");
        newStack.push("Vibhum");
        newStack.push("Monica");
        newStack.push("Mummy");
        newStack.push("Papa");
        System.out.println(newStack);
        System.out.println("Item on top: "+newStack.peek());
        System.out.println("Item popped: "+newStack.pop());
        System.out.println("Item on top: "+newStack.peek());
        System.out.println("Search Result: "+newStack.search("papa"));
        System.out.println("Search Result: "+newStack.search("Vibhum"));





     }
    
}
