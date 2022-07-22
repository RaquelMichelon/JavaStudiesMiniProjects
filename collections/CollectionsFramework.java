package com.michelon.collections;

//alt + enter
import java.util.ArrayList;
import java.util.List;

public class CollectionsFramework {

    public static void main(String[] args) {

        //normal array
        Object a[] = new Object[5];
        //problems:
        //1. is fixed: not growable in nature / also can waste memory in case of not using it
        //2. homogeneous datatype
        //3. not using data structure concept - there are no ready-made methods
        //to get access any data, is necessary to build all programing logic for any operation
        //SO, IN RUNTIME, if you try to put more data you will get an exception


        //why we need a collection? To overcome these problems above
        //java collections provide some classes and interfaces
        //with collections we can store a group of elements into a single entity
        //e.g. List/ArrayList; Hashmap; Stack; and so on

        //COLLECTIONS
        //can hold both homogeneous plus heterogeneous
        //Implement Data Structure - which means ready-made methods are available

        //COLLECTION INTERFACE - ADD, REMOVE, SEARCH FOR AN EXISTING OBJECT; the main child interfaces are:
            // | LIST INTERFACE - insertion order should be preserved / duplicate allowed
                    // | Classes that implement list interface:
                            //ArrayList; LinkedList; Vector (extended from Stack) - legacy classes;
            // | SET INTERFACE
            // | QUEUE INTERFACE

        //COLLECTIONS -> predefined CLASS OF PACKAGE JAVA UTIL, WHICH CONTAINS METHODS TO USE WITH COLLECTIONS OBJECTS
        List<Integer> example = new ArrayList<Integer>();
        example.add(1);
        example.add(2);
        example.add(3);
        example.add(4);
        example = example.subList(1, 3); //index numbers inside the args
        System.out.println(example);

        //COLLECTION INTERFACE
            // | SET INTERFACE - insertion order not preserved / duplicates not allowed
                  // Classes: HashSet; LinkedHashSet


        //COLLECTION INTERFACE
            // | QUEUE INTERFACE - objects prior to processing / first in fist out concept (FIFO)/
                    // Classes: priorityQueue;

//        *********************************

        //apart from those three interfaces we have MAP INTERFACE - independent interface
//        Present in key value pair.
//        Key and value are object.
//        the keys cannot be duplicated.
//        the values can be duplicated.
//
//        Classes:
//        HashMap
//        LinkedHashMap




    }
}
