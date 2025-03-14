package com.wipro.java;

import java.util.LinkedList;

class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    
    public HashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }
    
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }
    
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        
        buckets[index].add(new Entry<>(key, value));
    }
    
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }
    
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key.equals(key));
        }
    }
    
    private static class Entry<K, V> {
        K key;
        V value;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        System.out.println("apple: " + map.get("apple")); // Output: apple: 1
        
        map.remove("banana");
        System.out.println("banana: " + map.get("banana")); // Output: banana: null
    }
}