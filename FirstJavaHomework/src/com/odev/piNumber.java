package com.odev;

public class piNumber {
	
	public double pi1(){
		
		double pi=0;
		for (double i = 1; i < 800000; i+=4) {		// 800000 e kadar dönmesinin sebebi 4 er 4 er artırmamız.	
			pi=pi+((4/i)-4/(i+2));
		}
		return pi;			
	}
	
	public void pi2(){
		double pi=0;
		int count = 0;
		for (double i = 1; i < 1000000; i+=4) {
			if(pi>=3.14159){
				break;
			}
			pi=pi+((4/i)-4/(i+2));
			count++;
		}
		System.out.println(count);		
		
	}

}
