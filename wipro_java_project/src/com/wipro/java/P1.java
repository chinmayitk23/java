package com.wipro.java;

import java.util.Scanner;

public class P1 {
    public static int CountPairs(int N, int[] A) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int minHeight = Math.min(A[i], A[j]);
                boolean valid = true;

                // Check if all elements between i and j are smaller than minHeight
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= minHeight) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] A = new int[N];

        String[] temp = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(temp[i]);
        }

        System.out.println(CountPairs(N, A));
    }
}