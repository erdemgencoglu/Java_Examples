package com.meten;

import java.util.Random;

public class Operations {
	
	public boolean isMultiple(int x,int y){
		if(x%y==0){
			return true;			
		}else{
			return false;
		}	
	}
	public double Hypotenuse(double x,double y){
		
		double Hypo;
		Hypo=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));// (a^2+b^2) = H^2 formülünden gelir
		return Hypo;		
	}

	public void squareOfAsterisks(int x) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int ReversingDigits(int x){
		int newx = x; //sayı değerini daha sonra kullanacağımızdan başka bir değere eşitliyoruz.
        int gecicix = 0;

        while (newx != 0) {
            int basamakayirici = newx % 10;//sayının 10'a bölümünden kalanını bularak basamaklarına ayırıyoruz
            gecicix = gecicix * 10 + basamakayirici;//ardında gecici değeri 10 ile çarpıp sondaki 0 yerine basamağımızı yazıyoruz.
            newx = newx / 10;
        }
        return gecicix;
	}
	
	public enum Tossingvalue{HEAD, TAIL};
	
	public Tossingvalue flip(){
		Random rnd = new Random();
		int value = rnd.nextInt(2);
		if(value==0){
			return Tossingvalue.HEAD;//yazı
		}else {
			return Tossingvalue.TAIL;//tura
		}
	}
}
