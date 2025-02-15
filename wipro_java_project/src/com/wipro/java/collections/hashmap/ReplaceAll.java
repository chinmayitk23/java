package com.wipro.java.collections.hashmap;


import java.util.HashMap;

class ReplaceAll {
    public static void main(String[] args) {
        // create an HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to the HashMap
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println("HashMap: " + languages);

        // Change all value to uppercase
        languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("Updated HashMap: " + languages);
    }
}
