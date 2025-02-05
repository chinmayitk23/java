
package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation{
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
//Inserts or updates a key-value pair.
        // 1. Adding elements using put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Printing the map after insertion
        System.out.println("Original Map: " + map);
//Retrieves the value for the given key.
        // 2. Retrieving an element using get()
        int keyToGet = 2;
        System.out.println("Value for key " + keyToGet + ": " + map.get(keyToGet));
//Removes the key-value pair.
        // 3. Removing an element using remove()
        int keyToRemove = 3;
        map.remove(keyToRemove);
        System.out.println("After removing key " + keyToRemove + ": " + map);
//Returns a set of all key-value pairs for iteration(entrySet).

        // 4. Iterating through the Map
        System.out.println("\nIterating over the Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

