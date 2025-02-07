package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnNumbers {

	public StreamOnNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		List<Integer> sortedNumbers = numbers.stream().
				sorted().
				collect(Collectors.toList());
		System.out.println("Sorted List: "+ sortedNumbers);
		List<Integer> numbers1 = Arrays.asList(10, 20, 5, 25, 30);
		int min = numbers1.stream().min(Integer::compare).get();
		int max = numbers1.stream().max(Integer::compare).get();
		System.out.println("List 2: "+ numbers1);
		System.out.println("Min " + min + " Max " + max);
		 
	}

}