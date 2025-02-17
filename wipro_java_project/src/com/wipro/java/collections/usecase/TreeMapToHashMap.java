package com.wipro.java.collections.usecase;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap with some data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Alice");
        treeMap.put(1, "John");
        treeMap.put(2, "Bob");
        treeMap.put(5, "Emma");
        treeMap.put(4, "David");

        // Step 2: Print TreeMap (Sorted Order)
        System.out.println("TreeMap (Sorted): " + treeMap);

        // Step 3: Transfer data from TreeMap to HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Step 4: Print HashMap (Unordered)
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}

