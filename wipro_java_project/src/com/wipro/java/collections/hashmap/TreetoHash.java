package com.wipro.java.collections.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

class TreetoHash {
  public static void main(String[] args){

    // create a TreeMap of String type
    TreeMap<String, String> treemap = new TreeMap<>();

    // add mappings to the TreeMap
    treemap.put("A", "Apple");
    treemap.put("B", "Ball");
    treemap.put("C", "Cat");
    System.out.println("TreeMap: " + treemap);

    // create a HashMap
    HashMap<String, String> hashmap = new HashMap<>();

    // add mapping to HashMap
    hashmap.put("Y", "Yak");
    hashmap.put("Z", "Zebra");
    System.out.println("Initial HashMap: " + hashmap);

    // add all mappings from TreeMap to HashMap
    hashmap.putAll(treemap);
    System.out.println("Updated HashMap: " + hashmap);
  }
}
