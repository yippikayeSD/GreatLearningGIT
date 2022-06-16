package com.greatlearning.datastructures.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    /*
     * implements Set<> Interface
     * no duplicates allowed
     * makes use of hashing concept
     *      needs to @override hashCoded() and equals() methods
     * Random ordered set 
     * Constant (very fast) time access
     * java.util
     * implements: Set<E>, Cloneable<E>, Serializable
     * extends: AbstractSet<E>
     * ++not synchronised by default
     * Constructot:
     *      HashSet() -> new empty set; default capacity of HashMap is 16 and load factor is 0.75
     *      HashSet(Collection<? exteds E> c) -> new HashSet containing elements of specified collection omitting duplicates
     *      HashSet(int initialCapacity) => constructs empty HashSet with backing HashMap contianning InitialCapacity and defualt load factor (0.75)
     *      HashSet(int Initial Capacity, float loadFactor) ->empty hashSet with initialCapacity and loadFactor
     *  Methods:
     *      add(E e)
     *      clear()
     *      clone()
     *      contains(Object o)
     *      isEmpty() -> returns true if set has no eleents
     *      iterator()
     *      remove(Object o) - > removes the specified object
     *      size()
     * Methodsinherited from AbstractSet
     *      equals()
     *      hashCode()
     *      removeAll()
     */
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet);
        hashSet.add("Shubham");
        hashSet.add("Vibhum");
        hashSet.add("Raju");
        hashSet.add("Birju");
        System.out.println(hashSet);
        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println("through Iterator: "+itr.next());
        }

    }
}
