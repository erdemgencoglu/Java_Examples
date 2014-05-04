package com.meten;

import java.util.Scanner;

import com.meten.Operations.Tossingvalue;

public class OperationsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Operations o = new Operations();
		Scanner sc = new Scanner(System.in);
		int number1 = 0,number2 = 0,number3 = 0,number4 = 0;
		double value1 = 0,value2 = 0;
		int choice,choice1;
		do {
			choice = menu1();
			switch (choice) {
			case 1:
				System.out.println("Enter the first number :  ");
				try {
					number1=sc.nextInt();
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				System.out.println("Enter the second number :  ");
				try {
					number2=sc.nextInt();
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				if(o.isMultiple(number1, number2)){
					System.out.println("The first number is multiple of the second number");				
				}
				else{
					System.out.println("The first number is NOT multiple of the second number");
				}
				break;
			case 2:
				System.out.println("Enter the first edge of the triangle : ");
				try {
					value1=sc.nextDouble();
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				System.out.println("Enter the second edge of the triangle : ");
				try {
					value2=sc.nextDouble();	
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				System.out.println(o.Hypotenuse(value1, value2));
				break;
			case 3:
				System.out.println("Enter the length of side of the square : ");
				try {
					number3=sc.nextInt();
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				o.squareOfAsterisks(number3);
				break;
			case 4:
				System.out.println("Enter the number : ");
				try {
					number4 = sc.nextInt();
				} catch (Exception e) {
					System.err.println("ERROR");
					main(args);
				}
				System.out.println("Reversing Digits : " + o.ReversingDigits(number4));			
				break;
			case 5:
				int head=0,tail=0;	
				do {
				choice1=menu2();			
					if(choice1==1){
						if(o.flip() == Tossingvalue.HEAD){
							System.out.println("HEAD");
							head++;
						}
						else if(o.flip() == Tossingvalue.TAIL){
							System.out.println("TAIL");
							tail++;
						}
					}
					else if(choice1==2){
						System.out.println("HEAD value : " + head + " TAIL value : " + tail );
					}
				} while (choice1 != 3);	
				break;
			case 6:
				System.out.println("Good Bye");
				break;
				default:
					System.err.println("Invalid value");
				break;
			}
		} while (choice!=6 && choice < 6);
		

	}
	public static int menu1(){
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1-Multiple Question\n2-Hypotenuse Question\n3-Square Of Asterisks Question\n" +
				"4-Reversing Digits Question\n5-Coin Tossing\n6-Exit\n\n");
		System.out.print("Your choice : ");
		try {
			choice=sc.nextInt();
		} catch (Exception e) {
			System.err.println("ERROR");
			System.exit(-1);
		}
		return choice;		
	}
	public static int menu2(){
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1-Coin Tossing\n2-Head and Tail value\n3-Exit\n\n");
		System.out.print("Your choice : ");
		try {
			choice=sc.nextInt();
		} catch (Exception e) {
			System.err.println("ERROR");
			System.exit(-1);
		}
		return choice;		
	}
}
