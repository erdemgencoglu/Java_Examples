package com.odev;

import java.util.Scanner;

public class MyDateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean cont;
		MyDate dt1=new MyDate();
		MyDate dt2=new MyDate();
		Scanner input =new Scanner(System.in);
		try{
			System.out.print("Enter day(date1):");
			dt1.setDay(input.nextInt());
			System.out.print("Enter month(date1):");
			dt1.setMonth(input.nextInt());
			System.out.print("Enter year(date1):");
			dt1.setYear(input.nextInt());
			System.out.println(dt1.getDate());
			System.out.print("Enter day:");
			dt2.setDay(input.nextInt());
			System.out.print("Enter month:");
			dt2.setMonth(input.nextInt());
			System.out.print("Enter year:");
			dt2.setYear(input.nextInt());
			System.out.println(dt2.getDate());
		}catch(Exception e){
			System.out.println("Please check your writing..");
			MyDateTest.main(args);
		}

		cont=MyDate.isBigger(dt1,dt2);
		if(cont==true){
			System.out.println("date1 is bigger than from other..");
		}
		else{
			System.out.println("date1 is smaller than from other..");
		}


	}

}
