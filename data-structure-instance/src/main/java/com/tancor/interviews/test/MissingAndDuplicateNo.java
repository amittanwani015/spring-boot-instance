package com.tancor.interviews.test;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Problem Statement :
 * 
 * Given an unsorted array of size n. Array elements are in the range from 1 to n. 
 * One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers. * 
 * 
 * @author amitt
 *
 */
public class MissingAndDuplicateNo {

	public static void main(String[] args) {

		int findSumOfDuplicateAndMissingNumber = findSumOfDuplicateAndMissingNumber(new int[] {4, 3, 1 ,6, 2, 1});
		System.out.println(String.format("SUM OF MISSING + DUPLCIATE NUMBER :  %s",  findSumOfDuplicateAndMissingNumber));

		findSumOfDuplicateAndMissingNumber=findSumOfDuplicateAndMissingNumberUsingSwapSort(new int[] {6, 3, 5 ,6, 2, 1});
		System.out.println(String.format("SUM OF MISSING + DUPLCIATE NUMBER :  %s",  findSumOfDuplicateAndMissingNumber));

	}

	/**
	 *  
	 *  Complexity of the this solution would be O(n),
	 *  as each element would take a single iteration to be a the right place.
	 *  
	 *  even if we have arrays as {6,1,2,3,4,5},
	 *  In the first iteration itself all the element will reach it's right place,
	 *  thus no more swaps would happen further.
	 *  
	 *  Time Complexity would be O(N) + O(N) = O(N)
	 * 
	 * @param arr
	 * @return
	 */
	private static int findSumOfDuplicateAndMissingNumberUsingSwapSort(int[] arr) {

		System.out.println(" ##########  SOLUTION WITH SWAP SORT ############");

		/**
		 *  swapping to put items at their respective places.
		 */
		for (int i = 0; i < arr.length; i++) {
			while(arr[i]!=i+1) {
				int temp=arr[i];
				if(arr[temp-1]==arr[i]) {		/** if arr[i] is already available at arr[(arr[i]-1)], then it's a duplicate, thus ignore it */
					break;
				}
				arr[i]=arr[temp-1];
				arr[temp-1]=temp;						
			}		
			logArray(arr, i);
		}

		/**
		 * 
		 * finding missing element
		 * 
		 */
		int missingNumber=-1;
		int duplicateNumber=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1) {
				duplicateNumber=arr[i];
				missingNumber=i+1;
			}			
		}	

		System.out.println(String.format("DUPLICATE NUMBER : %s", duplicateNumber));
		System.out.println(String.format("MISSING NO : %s ", missingNumber));

		return missingNumber+duplicateNumber;
	}

	private static void logArray(int[] arr, int iteration) {
		System.out.println(String.format("ITERATION FOR i = %s", iteration));
		for (int k : arr) {
			System.out.print(k+"\t");
		}
		System.out.println();		
	}

	private static int findSumOfDuplicateAndMissingNumber(int[] arr) {

		System.out.println(" ##########  SOLUTION WITH SEQUENCE SUM ############");

		int sumOfNumbers=0;
		int duplicateNumber=0;
		Set<Integer> numbers=new HashSet<>();

		for (int number : arr) {
			if(!numbers.add(number)) {
				duplicateNumber=number;					
			}
			sumOfNumbers+=number;
		}

		System.out.println(String.format("SUM OF INPUT NUMBERS :  %s", sumOfNumbers));
		System.out.println(String.format("DUPLICATE NUMBER :  %s", duplicateNumber));

		int sequenceSum=arr.length*(arr.length+1)/2;
		int missingNumber=sequenceSum-sumOfNumbers+duplicateNumber;
		System.out.println(String.format("MISSING NUMBER "
				+ "(SUM OF N SEQUENCE - SUM OF INPUT NUMBERS + DUPLICATE NUMBER ) : %s", missingNumber) );

		return missingNumber+duplicateNumber;

	}
}
