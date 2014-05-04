//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

package com.P_Euler;

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum3 = 0;// 3 e bölüneneri tutan değişken
		int sum5 = 0;//5 e bölünenleri tutan değişken
		
		for (int i = 0; i < 1000; i++) {
			if(i%3 == 0){// i değerinin 3 e bölümünden kalanı 0'sa 
				sum3=sum3+i;//i  değerini sum3 değişkenine aktarıyoruz.
			}
			else if(i%5 == 0){// i değerinin 5 e bölümünden kalanı 0'sa 
				sum5=sum5+i;//i  değerini sum5 değişkenine aktarıyoruz.
			}else{
				continue;
			}
		}
		System.out.println(sum3);// 3'e bölünen sayıları ekrana yazdırır.
		System.out.println(sum5);// 5'e bölünen sayıları ekrana yazdırır.
		System.out.println((sum3+sum5));

	}

}
