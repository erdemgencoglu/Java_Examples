//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

package com.P_Euler;

public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long  BigNumber = 600851475143L;
	    long LargestFactor = 0;	        

	        for(int i = 2; i < BigNumber; i++) {
	            if(isPrime(i)) { //asal olma kontrolü
	                if(BigNumber % i == 0) { // BigNumber değerini tam bölen kontrolü
	                	LargestFactor = i;   
	                	System.out.println("Factor Prime (600851475143) : " + LargestFactor);
	                }
	            }
	        }

	}
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
