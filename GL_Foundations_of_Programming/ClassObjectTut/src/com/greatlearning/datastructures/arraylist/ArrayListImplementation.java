package com.greatlearning.datastructures.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {
     /*
     * Resizable array based Concrete implementation of List  Interface 
     * Dynamically sized -> size doubles when reaches threshold
     * Not Synchronized -> not thread safe -> built for single threadeed programming environment 
     * -> Have to be programatically controlled in Multi-Threaded Progrsmming Environment
     * Random Access allowed
     * Allows fast CRUD operations
     * +++++useful in applications with large insertion and deletion operations
     * implements      Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
     * 
     * Constructor:
     *      ArrayList() -> Constructs an empty list with an initial capacity of ten.
     *      ArrayList (Collection<? extends E> c) -> Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
     *      ArrayList(int initialCapacity) -> Constructs an empty list with the specified initial capacity.
     * Methods:
        *  add(element)
        *  add(index, element)
        *  clear()
        *  clone()
        *  forEach(Consumer<? super E> action)
        *  remove()
        *  iterator()
        *  spliterator()
        *  listIterator<(int index)
        *  size()
        *  sort(Comparator<? super E> c)
     * Refer to Documentation for More Info
     */
    public static void main(String[] args) {
        ArrayList usersList = new ArrayList<String>();
        usersList.add("Shubham");
        usersList.add("Vibhum");
        usersList.add("Monica");
        usersList.add("Nanaji");
        
        usersList.forEach((t) -> System.out.println("The Name is: "+t));
        usersList.set(3, "Raju");
        Iterator<String> userItrerator = usersList.iterator();
        while(userItrerator.hasNext()){
            System.out.println("Print From Iterator while:"+userItrerator.next());
        }
        
        usersList.remove("Raju");
        System.out.println(usersList);
        usersList.set(2, "Guddu");
        System.out.println(usersList);
        usersList.add("Pappu");
        System.out.println(usersList);
        userItrerator = usersList.iterator();
        userItrerator.forEachRemaining((key) -> System.out.println("From Foreach Remaining: "+key));
        usersList.add("Birju");
        System.out.println(usersList);
        
        for(Object key: usersList ){
            System.out.println("From using For Each As Object: "+key.toString());
        }


    }
    
}
