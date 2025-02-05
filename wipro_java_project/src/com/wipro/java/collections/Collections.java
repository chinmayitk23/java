

	package com.wipro.java.collections;

	import java.util.*;

	public class Collections {
	    public static void main(String[] args) {
	        
	        // 1. Using Array (Basic Array)
	        System.out.println("Using Array:");
	        String[] array = {"Apple", "Banana", "Cherry", "Date"};
	        System.out.println("Original Array: " + Arrays.toString(array));

	        // Accessing an element
	        System.out.println("Element at index 2: " + array[2]);

	        // Updating an element
	        array[1] = "Blueberry";
	        System.out.println("After updating index 1: " + Arrays.toString(array));
	        System.out.println();


	        // 2. Using ArrayList
	        System.out.println("Using ArrayList:");
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("One");
	        arrayList.add("Two");
	        arrayList.add("Three");

	        System.out.println("Original ArrayList: " + arrayList);
	        
	        // Adding at a specific index
	        arrayList.add(1, "Inserted");
	        System.out.println("After adding at index 1: " + arrayList);

	        // Removing an element
	        arrayList.remove("Two");
	        System.out.println("After removing 'Two': " + arrayList);

	        // Iterating using for-each loop
	        System.out.print("Iterating over ArrayList: ");
	        for (String item : arrayList) {
	            System.out.print(item + " ");
	        }
	        System.out.println("\n");


	        // 3. Using LinkedList
	        System.out.println("Using LinkedList:");
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(100);
	        linkedList.add(200);
	        linkedList.add(300);

	        System.out.println("Original LinkedList: " + linkedList);
	        
	        // Adding at the first and last positions
	        linkedList.addFirst(50);
	        linkedList.addLast(400);
	        System.out.println("After addFirst and addLast: " + linkedList);

	        // Removing first element
	        linkedList.removeFirst();
	        System.out.println("After removeFirst: " + linkedList);

	        // Iterating using for-each loop
	        System.out.print("Iterating over LinkedList: ");
	        for (Integer num : linkedList) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\n");


	        // 4. Using List (Polymorphism with ArrayList)
	        System.out.println("Using List:");
	        List<Double> list = new ArrayList<>();
	        list.add(1.1);
	        list.add(2.2);
	        list.add(3.3);

	        System.out.println("Original List: " + list);

	        // Setting a new value at an index
	        list.set(1, 4.4);
	        System.out.println("After setting index 1 to 4.4: " + list);

	        // Iterating using for loop
	        System.out.print("Iterating over List: ");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i) + " ");
	        }
	        System.out.println("\n");


	        // 5. Using Map (HashMap)
	        System.out.println("Using Map:");
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Java");
	        map.put(2, "Python");
	        map.put(3, "C++");

	        System.out.println("Original Map: " + map);

	        // Removing an entry
	        map.remove(2);
	        System.out.println("After removing key 2: " + map);

	        // Iterating over the Map
	        System.out.println("Iterating over Map:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	    }
	}



