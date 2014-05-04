package com.odev;

public class e_serisi {
	
	public double eserisi(double x){
		double i;
		double toplam,pay,payda;
		toplam=1;
		pay=1;
		payda=1;
		for(i=1;i<10;i++)
		{
		pay=power(x, i);
		payda=faktoriyel(i);
		toplam+=(pay/payda);
		}
		return toplam;
		
	}
	
	public static double faktoriyel(double x){
		if (x<=1)
		{
		return 1 ;
		}
		else
		{
			x=x*faktoriyel(x-1);
			return(x);
		}
	}
	public static double power(double x,double y){
		double result = 1;
		for (int i = 0; i < y ; i++) {
			result =result*x;
		}
		return result;
	}


}
