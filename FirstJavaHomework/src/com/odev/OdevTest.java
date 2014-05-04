package com.odev;

import java.util.Scanner;

public class OdevTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int secim = 0;
		int secim2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- PI sayısını görüntülemek için\n\n2- e sayısını görüntülemek için");
		System.out.print("Seçiminiz : ");
		try{
			secim=sc.nextInt();
		}catch(Exception ex){
			System.err.println("ERROR");
			main(args);
		}		
		if(secim==1){
			piNumber p = new piNumber();
			System.out.println("\n\n1- 200000. adımda ki PI sayısının değerini görmek için\n" +
					"2-PI sayısının 3.14159 gibi değere kaçıncı adımda geldiğini görmek için\n\n ");
			System.out.print("Seciminiz : ");
			try{
				secim2=sc.nextInt();
			}catch(Exception ex){
				System.err.println("ERROR");
				main(args);
			}
			if(secim2==1){
				System.out.println(p.pi1());
			}
			else if (secim2==2) {
				p.pi2();
			}
			else{
				System.err.println("Yanlış seçim yaptınız.");
				main(args);
			}
		}
		else if(secim==2){
			e_serisi e = new e_serisi();
			double x = 0;
			System.out.print("e sayısının üssü olan x sayısını giriniz : ");
			try{
				x=sc.nextDouble();
			}catch(Exception ex){
				System.err.println("ERROR");
				main(args);
			}
			System.out.println(e.eserisi(x));
		}
		else{
			System.err.println("Yanlış seçim yaptınız.");
			main(args);
		}

	}

}
