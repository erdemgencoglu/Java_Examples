package SortingAlgorithm;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

		/**
		 * @_kurtulusahmet
		 * @author landforce
		 */
		public static void main(String[] args) {
			
			Random random =new Random();
			int[] Array = new int[999];
			int choice;
			String answer;
			
			for (int i = 0; i < Array.length; i++) {
				Array[i]=random.nextInt(1000);
			}			
		
			choice=menu();
			
			switch(choice){
				case 1:
					SelectionSort selection = new SelectionSort();
					long start = System.currentTimeMillis();//Sıralamanın başladığı an
				
					selection.Selectionsort(Array, Array.length);
					
				    long finish = System.currentTimeMillis();//sıralamanın bittiği an
					
					System.out.println("After sorting: ");
					for (int i = 0; i < Array.length; i++) {
						System.out.println(Array[i]);
					 }
					
					 System.out.println("Time: " + (finish-start) + " milliseconds");
					 answer=OtherOperations();
					 if(answer.equalsIgnoreCase("y")){
						 main(args);
					 }
					 else{
						 System.exit(-1);
					 }
				case 2:
					InsertionSort insertion = new InsertionSort();
					start = System.currentTimeMillis();//Sıralamanın başladığı an
				
					insertion.Insertionsort(Array, Array.length);
					
					finish = System.currentTimeMillis();//sıralamanın bittiği an
					
					System.out.println("After sorting: ");
					for (int i = 0; i < Array.length; i++) {
						System.out.println(Array[i]);
					 }
					
					 System.out.println("Time: " + (finish-start) + " milliseconds");
					 answer=OtherOperations();
					 if(answer.equalsIgnoreCase("y")){
						 main(args);
					 }
					 else{
						 System.exit(-1);
					 }
				case 3:
					BubbleSort bubble = new BubbleSort();
					start = System.currentTimeMillis();//Sıralamanın başladığı an
				
					bubble.Bubblesort(Array, Array.length);
					
					finish = System.currentTimeMillis();//sıralamanın bittiği an
					
					System.out.println("After sorting: ");
					for (int i = 0; i < Array.length; i++) {
						System.out.println(Array[i]);
					 }
					
					 System.out.println("Time: " + (finish-start) + " milliseconds");
					 answer=OtherOperations();
					 if(answer.equalsIgnoreCase("y")){
						 main(args);
					 }
					 else{
						 System.exit(-1);
					 }
				case 4:
					QuickSort quick = new QuickSort();
					start = System.currentTimeMillis();//Sıralamanın başladığı an
				
					quick.Quicksort(Array, 0, 998);
					
					finish = System.currentTimeMillis();//sıralamanın bittiği an
					
					System.out.println("After sorting: ");
					for (int i = 0; i < Array.length; i++) {
						System.out.println(Array[i]);
					 }
					
					 System.out.println("Time: " + (finish-start) + " milliseconds");
					 answer=OtherOperations();
					 if(answer.equalsIgnoreCase("y")){
						 main(args);
					 }
					 else{
						 System.exit(-1);
					 }
				case 5:
					ShellSort shell = new ShellSort();
					start = System.currentTimeMillis();//Sıralamanın başladığı an
				
					shell.Shellsort(Array, Array.length);
					
					finish = System.currentTimeMillis();//sıralamanın bittiği an
					
					System.out.println("After sorting: ");
					for (int i = 0; i < Array.length; i++) {
						System.out.println(Array[i]);
					 }
					
					 System.out.println("Time: " + (finish-start) + " milliseconds");
					 answer=OtherOperations();
					 if(answer.equalsIgnoreCase("y")){
						 main(args);
					 }
					 else{
						 System.exit(-1);
					 }
			  }
		}
		public static int menu(){
			int ch;		
			Scanner scan1 = new Scanner(System.in);
			System.out.println("\nWhich sorting algorithm you want to use?");
			System.out.println("\n\n1-Selection Sort\n2-Insertion Sort\n3-Bubble Sort\n4-Quick Sort\n5-Shell Sort\n\n");
			System.out.println("Your choice : ");
			ch=scan1.nextInt();
			return ch;
		}
		public static String OtherOperations(){
			Scanner scan2 = new Scanner(System.in);
			String answer;
			System.out.println("\n\nDo you want to use another sorting algorithm? <y/n> : ");
			System.out.println("Your answer : ");
			answer=scan2.next();
			return answer;			
		}
	}

