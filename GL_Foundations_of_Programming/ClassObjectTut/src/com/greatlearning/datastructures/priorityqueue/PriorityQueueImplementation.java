package com.greatlearning.datastructures.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueImplementation {
    /*
     * Queue
     * An interface which implements Collections Interface
     * A FIFO daa structure
     * Found in java.utils package
     * Some concerete implementations are LinkedList PriorityQueue, DelayQueue, LinkedBlockingQueue, PriorityBlockingQueue, SynchronousQueue etc
     * Also implemented by Dequeue<E>, BlockingQueue<E>, BlockingDequeue<E>, TransferQueue<E>
     *      
     * Methods
     *      add(e) -> throws exception
     *      offer(e) -> silent method, returns special value
     *      remove() -> throws exception, retrieves and removes the head element
     *      poll()  -> silent, retrieves and removes the head element, returns null if queque is empty
     *      element() -> throws exception, retrieves but doesn't remove the head method
     *      peek() -> silent, retrieves but doesn't remove the head method
     * 
     * Priority Queue
     * Implementation of heap data structure
     * either min heap or max heap
     * follows natural ordering
     * Nulls not allowed
     * Elements that cannot be compared are not allowed
     * java.util package
     * implements Serializable<E>, Iterable<E>, Collection<E>, Queue<E>
     * follows natural ordering by default
     * specific ordering is achieved by supplying Comparator while crfeating the Pqueue
     * 
     * Constructor:
     *      PriorityQueue() -> Creates a PQ with initial capacity 11 and orders elements acording to natural ordering
     *      PriorityQueue(int initialCapacity) -> Creates a PQ with initial capacity specified by user and orders elements acording to natural ordering
     *      PriorityQueue(int initialCapacity, Comparator<? super E> comparator) -> Creates a PQ with initial capacity specified by user 
     *          and orders elements acording to specified comparator
     *      PriorityQueue(Collection<? extends E> c) -> Creates a PQ xontaining elements in a specified collection
     *      PriorityQueue(PriorityQueue<? extends E> c) -> Creates a PQ xontaining elements in a specified PriorityQueueu
     *      PriorityQueue(SortedSet<? extends E> c) -> Creates a PQ xontaining elements in a specified SortedSet
     * 
     * Methods:
     *      add() -> inserts element into priority queue
     *      clear() -> Removes all elements from this PQ
     *      comparator() -> returns the comparator used to order elements in this PQ.
     *                   -> returns null if PQ is sorted according to natural ordering
     *      contains(Object o) -> returns true if element is contained in PQ
     *      iterator() -> returns an Iterator over the elements of the PQ
     *      peek() -> retreives but doesn't remove the head of the queue -> returns null if queue is empty
     *      poll() -> retireves and removes the head of queue -> returns null if empty
     *      remove(Object o)  -> removes a single instance of the object if it is present in the PQ
     *      size() -> return number of elements in this collection
     *      toArray() -> returns an array containing all of the elements in this queue
     *      toArray(T[] a) -> returns an array containing all of the elements in this queue; 
     *                        the runtime type of the returned array is that of the specified array
     * 
     *      

     */


     public static void main(String[] args) {
         PriorityQueue<String> queue = new PriorityQueue<>();
         System.out.println(queue);
         queue.add("M");
         queue.add("F");
         queue.add("U");
         queue.add("A");
         queue.add("x");
         queue.add("X");
         Iterator queueIterator = queue.iterator();
         while(queueIterator.hasNext()){
             
             System.out.println("Printing Queue through Iterator:" + queue.poll());
         }
         System.out.println(queue);
         System.out.println("Element: "+queue.element());
         System.out.println("Peek: "+queue.peek());
         System.out.println(queue.remove());
         System.out.println("Queue after remove :"+queue);
         System.out.println(queue.poll());
         System.out.println("Queue after poll :"+queue);

         PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
         integerQueue.add(1);
         integerQueue.add(7);
         integerQueue.add(6);
         integerQueue.add(8);
         integerQueue.add(3);
         System.out.println("Integer Priority Queue in order of addition"+integerQueue);
         Iterator integerIterator  = integerQueue.iterator();
         while(integerIterator.hasNext()){
             System.out.println(integerQueue.poll());
             System.out.println("Integer Priority Queue in natural order"+integerQueue);
             
         }

         

     }

     
}
