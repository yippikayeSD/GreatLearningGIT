package com.greatlearning.datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListImplementation {

    /*
     * Doubley linked list implementation of List and Dequeue Interface 
     * Not Synchronized -> not thread safe -> built for single threadeed programming environment 
     * -> Have to be programatically controlled in Multi-Threaded Progrsmming Environment
     * Random Access not allowed
     * Allows fast CRUD operations
     * +++++useful in applications with large insertion and deletion operations
     * implements List<E>, Dequeue<E>, Cloneable, Sizable
     * Single LL 1->2->3->null
     * Double LL 1<=>2<=>3<=>4
     * Constructor:
     *  LinkedList() ->  Emplty LL
     *  LinkedList(Collection<? extends E> c) -> Constructs a List of elements specified collection 
     *  in the order that they are returned by the collection's iterator
     * Methods:
     *  add(element)
     *  add(index, element)
     *  clone()
     *  remove()
     *  descendingIterator()
     *  getFirst()
     *  getLast()
     *  listIterator<(int index)
     *  size()
     * Refer to Documentation for More Info
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("list :"+ list);
        System.out.println(list.peek());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list :"+ list);
        list.add(0,4);
        System.out.println("list :"+ list);
        list.add(78);
        System.out.println("list :"+ list);
        System.out.println(list.offer(8));
        System.out.println("Polled element:  "+list.poll());





        
    }
}
