package com.wipro.java.collections.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class FibonacciTreeMap {
    public static Map<Integer, Long> generateFibonacci(int n) {
        Map<Integer, Long> fibonacciMap = new TreeMap<>();
        long a = 0, b = 1, next;
        
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = a + b;
                a = b;
                b = next;
            }
            fibonacciMap.put(i, next);
        }
        return fibonacciMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        Map<Integer, Long> fibonacciSeries = generateFibonacci(n);
        
        System.out.println("Fibonacci Series:");
        for (Map.Entry<Integer, Long> entry : fibonacciSeries.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
