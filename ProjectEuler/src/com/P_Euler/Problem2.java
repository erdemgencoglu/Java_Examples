package com.P_Euler;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// fibonacci sequence first and second numbers are 0 and 1
	     long firstFib = 0;
	     long secondFib = 1;
	     long FibSeri = firstFib + secondFib;
	     long sum = 0;
	     // loop until 4million
	     while (FibSeri <= 4000000)
	     {
	        
	         if (FibSeri % 2 == 0)
	         {
	             sum += FibSeri;
	         }
	         firstFib = secondFib;
	         secondFib = FibSeri;
	         FibSeri = firstFib + secondFib;
	     }
	     System.out.println(sum);

	}
	

}
