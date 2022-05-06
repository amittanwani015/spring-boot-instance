package com.tancor.interviews.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

/**
 * 
Problem Statement :

Belzabar is 18 years old. On this occasion, we formulated the Belzabar Number. A positive longeger is a Belzabar number if it can be represented either as (n  (n + 18)) OR (n  (n - 18)), where n is a prime number.

Write a function named 'is_belzabar_number' which accepts a number as input and determines if it is a Belzabar Number (or not). Input to the function will be a number and the output will be boolean.

For bonus polongs,
1. Write a function that calculates and prlongs the count of Belzabar numbers less than or equal to 1 million.
2. Write a function that calculates and prlongs the count of Belzabar numbers from bonus question #1 above that are prime.

 * 
 * @author amitt
 *
 */
public class Belzabar {

	public static void main(String[] args) {		
		
		
		String[]y= {"1","2","15","-7","300"};
		Arrays.sort(y);
		for (String string : y) {
			System.out.print(string+"\t");
		}
		
		/**
		 * To check whether a no is belzabar number or not 
		 */

		boolean belzabarNumber = isBelzabarNumber(1363);
		System.out.println(String.format("Number: 1363, Is Belzabar : %s", belzabarNumber));

		belzabarNumber = isBelzabarNumber(1424);
		System.out.println(String.format("Number: 1424, Is Belzabar : %s", belzabarNumber));

	
		/**
		 * Counting No of Belzabar Number which are less than or equals to 1 Million 		 * 
		 */
		Set<Long> belzabarNumbers = getBelzabarNumbers(1000000);
		System.out.println(String.format("Count of Belzabar Number, less than equals to 1000000 :  %s", 
				belzabarNumbers.size()));
		
		
		/***
		 *  Calculating the count of Belzabar Number which are Prime No, less than equals to 1000000 
		 */
		
		long primeNoCount = belzabarNumbers.stream().filter((x) -> isPrime(x)).count();
		System.out.println(String.format("Count of Belzabar Number, which are prime number : %s", primeNoCount));
		
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static Set<Long> getBelzabarNumbers(long number) {

		long primeNo=getNextPrimeNo(1);      
		Set<Long> belzabarNumbers=new HashSet<>();  	/** taking set to handle duplicate belzabar numbers calculated from equation 1 & 2 */ 

		while(true) {

			long equationOne=getEquationOne(primeNo);  /** 	formula : (n  (n + 18)  */
			long equationTwo=getEquationTwo(primeNo);   

			/**  loop exit condition,  if input no becomes greater numbers calculated from eq1 or eq2 **/
			if(equationOne>number && equationTwo>number) {   
				break;
			}

			if(equationOne<=number) {
				belzabarNumbers.add(equationOne);				
			}

			if(equationTwo<=number) {
				belzabarNumbers.add(equationTwo);			
			}

			primeNo=getNextPrimeNo(primeNo);		

		}

		return belzabarNumbers;
	}


	/**
	 * 
	 *  Steps follow to check whether a Number is IsBelzabarNumber or not
	 *  1. Iterating the prime no, starting from 2.
	 *  2. for each prime no, solving the equation provided n(n+18) and n(n-18).
	 *  3. exit condition when number is belzabar : if any of the equations result matches with input number,
	 	 	 then breaking the while loop, and returning true.
	 *  4. exit condition when number is not belzabar : 
	 			- if at sometime eq 1 result gets greater than input number, AND
	 			- if eq2 result also gets greater than input number and primeNo>17 
	 *  5. for primeNo<=17, Eq2 result are not following patterns thus iterating prime no < 17 for all cases.
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isBelzabarNumber(long number) {

		boolean isBelzabar=false;

		long primeNo=getNextPrimeNo(1);

		while(true) {

			long equationOne=getEquationOne(primeNo); 
			long equationTwo=getEquationTwo(primeNo); 

			if(number==equationOne || number==equationTwo) {
				isBelzabar=true;
				break;
			}		

			if(number<equationOne && 
					((primeNo>17 && number<equationTwo))) {
				break;
			}

			primeNo=getNextPrimeNo(primeNo);			

		}

		return isBelzabar;
	}

	/**
	 * 
	 * @param primeNo
	 * @return
	 */
	public static long getEquationOne(long primeNo) {
		return primeNo*(primeNo+18); /** formula : (n  (n + 18)  */
	}

	/**
	 * 
	 * @param primeNo
	 * @return
	 */
	public static long getEquationTwo(long primeNo) {
		return primeNo*(primeNo-18); /** formula : (n  (n - 18)  */
	}

	/**
	 * 
	 * Method return next prime no available from input start range.    
	 * 
	 * @param 
	 * @return
	 */
	private static long getNextPrimeNo(long startRange) {

		long nextPrimeNo;
		long nextNo=startRange+1;

		while(true) {
			if(isPrime(nextNo)) {
				nextPrimeNo=nextNo;
				break;
			}		
			nextNo++;
		}

		return nextPrimeNo;
	}


	/** 
	 * Function to check if a no is prime or not
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrime(long number) {
		return !LongStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	}	
}
