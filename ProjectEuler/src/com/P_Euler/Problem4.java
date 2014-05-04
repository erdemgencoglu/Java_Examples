//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.


package com.P_Euler;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int product = 0;
	     int max = 0;
	     int k = 0,l = 0;
	     for (int i=100; i <= 999; i++)
	     {
	         for (int j=100;j <= 999; j++)
	         {
	             product = i*j;
	             if (isPalindrom(product) && product > max)
	             {
	                 max = product;
	                 k=i;
	                 l=j;
	                 
	             }
	         }
	     }	     
	     System.out.println("k : "+k);
	     System.out.println("l : "+l);
	     System.out.println("k x l : " + max);
	}

	 public static boolean isPalindrom(int sayi) {
	        int yenisayi = sayi; //sayı değerini daha sonra kullanacağımızdan başka bir değere eşitliyoruz.
	        int gecici = 0;

	        while (yenisayi != 0) {
	            int basamakayirici = yenisayi % 10;//sayının 10'a bölümünden kalanını bularak basamaklarına ayırıyoruz
	            gecici = gecici * 10 + basamakayirici;//ardında gecici değeri 10 ile çarpıp sondaki 0 yerine basamağımızı yazıyoruz.
	            yenisayi = yenisayi / 10;
	        }

	       
	        if (sayi == gecici) {
	            return true;
	        }
	        return false;
	    }
	 
}
