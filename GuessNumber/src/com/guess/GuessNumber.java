package com.guess;

import java.util.Scanner;

public class GuessNumber {

	/**
	 * @author _kurtulusahmet
	 * @param args
	 */
	public static void main(String[] args) {
		int baslangıc=50;
		int sayac = 0;// kaç denemede bulduğu sayacı
		int cevap = 0;
		int altlimit=0,üstlimit=100;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nLütfen aklınızdan bir sayı tutunuz\n\n");
		System.out.println("Evet:0\nKüçük:1\nBüyük:2\n\n");
		
		do{
			
			System.out.println("Tuttuğunuz sayı " + baslangıc + "mı?" );
			try{
				cevap=scan.nextInt();
			}catch(Exception e){
				System.err.println("Lütfen harf girmeyiniz");
				main(args);
			}	
			if(cevap==0||cevap==1||cevap==2){
				if(cevap==1){
					//0-100 aralığı daraltmak için 
					üstlimit=baslangıc;
					baslangıc=(altlimit+üstlimit)/2;
				}
				else if(cevap==2){
					//0-100 aralığı daraltmak için 
					altlimit=baslangıc;				
					baslangıc=(altlimit+üstlimit)/2;
				}
			}
			else{
				System.err.println("0,1 veya 2 dışında bi sayı giremezsiniz.");
				main(args);
			}
			
			sayac++;
		}while(cevap!=0);
		
		System.out.println("Sayı "+sayac+" denemede bulundu :D");
		

	}

}
