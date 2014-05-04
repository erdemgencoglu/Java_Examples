package com.odev;

import java.util.Scanner;

public class MyDate {
	private int year;
	private int month;
	private int day;
	Scanner input = new Scanner(System.in);
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		while(year<0)
			{
				System.out.println("Invalid entry was made,Please entry again : ");
				year = input.nextInt();
				continue;
			}
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
			while(month>12 || month<0)
			{
				System.out.println("Invalid entry was made,Please entry again : ");
				month = input.nextInt();
				continue;
			}
			this.month = month;
		
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {		
			while(day>31 || day<0)
			{
				System.out.println("Invalid entry was made,Please entry again : ");
				day = input.nextInt();
				continue;
			}
			this.day = day;
		
	}
	public String getDate(){
		String day=Integer.toString(getDay());
		String year=Integer.toString(getYear());		 
		
		if(getMonth()==1){
			String x="January";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==2){
			String x="February";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==3){
			String x="March";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==4){
			String x="April";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==5){
			String x="May";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==6){
			String x="June";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==7){
			String x="July";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==8){
			String x="August";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==9){
			String x="September";
			return (day+" "+x+" "+year);
		}else if(getMonth()==10){
			String x="October";
			return (day+" "+x+" "+year);
		}else if(getMonth()==11){
			String x="November";
			return (day+" "+x+" "+year);
		}
		else if(getMonth()==12){
			String x="December";
			return (day+" "+x+" "+year);

		}

		return "";
	}
	public static boolean isBigger(MyDate x,MyDate y){
		if(x.getYear()>y.getYear()){
			return true;
		}
		else if(x.getYear()==y.getYear() && x.getMonth()>y.getMonth()){
			return true;
		}
		else if(x.getYear()==y.getYear() && x.getMonth()==y.getMonth() && x.getDay()>y.getDay()){
			return true;
		}
		else
			return false;

	}
}
