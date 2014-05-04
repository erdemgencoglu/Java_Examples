package com.Calculator;

import java.util.Scanner;

public class Operations {
	
	 /**
	 * @
	 * @param x
	 * @param y
	 * @return
	 */
	public void MuchSum(int y){// 2 den fazla sayı girildiği zaman kullanılır
		double sum=0;
		Scanner input = new Scanner(System.in);
		double[] x = new double[y];
		for (int i = 0; i < y; i++) {
			System.out.println((i+1) + ". sayıyı giriniz : ");
			try {
				x[i]= input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR!!");
				System.exit(-1);
			}			
			sum=sum+x[i];
		}	
		System.out.println("Sonuç : " + sum);
	}
	
	public double Sum(double x,double y){//toplama işlemimiz
		double sum;
		sum=x+y;
		return sum;
	}
	
	public double Extraction(double x,double y){ //çıkarma işlemimiz
		double extraction;
		extraction=x-y;
		return extraction;
	}
	
	public void MuchMultiplication(int y){// 2 den fazla sayıyı çarpmak için kullanılır
		double multiplication=1;
		Scanner input = new Scanner(System.in);
		double[] x = new double[y];
		for (int i = 0; i < y; i++) {
			System.out.println((i+1) + ". sayıyı giriniz : ");
			try {
				x[i]= input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR!!");
				System.exit(-1);
			}
			multiplication=multiplication*x[i];
		}
		System.out.println("Sonuç : " + multiplication);
	}
	
	public double Multiplication(double x,double y){//çarpma işlemimiz
		double multiplication;
		multiplication=x*y;
		return multiplication;		
	}
	public double Partition(double x,double y){// bölme işlemimiz
		double partition;		
		partition=x/y;
		return partition;		
	}
	public double Percent(double x,double y){// gönderilen sayı ve yüzde değerine göre sonucu bulan method
		double result;
		result = (x/100)*y;
		return result;
	}
	public double power(double x,double y){//üs almak için kullanılır
		double result = 1;
		for (double i = 0; i < y ; i++) {
			result =result*x;
		}
		return result;
	}
	public double factorial(double x){// faktoriyel hesabı yapar
		if (x<=1)// 1!=1
		{
		return 1 ;
		}
		else
		{
			x=x*factorial(x-1);//biönceki sayının faktoriyeli kullanılarak x üzerine eklenir.
			return(x);
		}
	}
	
}
