package las;

import java.util.Scanner;

public class LookAndSay {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String num;
		int adet;
		System.out.println("String değerini giriniz : ");
		num=scn.next();
		System.out.println("Görmek istediğiniz sayı adedini giriniz : ");
		adet=scn.nextInt();

		for (int i=1;i<=adet;i++) {
			System.out.println(num);
			 num = lookandsay(num);  
		}

	}
	public static String lookandsay(String number){
		StringBuilder yenistr= new StringBuilder();
		int sayac=0;
		char kontrol = number.charAt(0);		
		for(int i = 0; i<number.length(); i++){ // String'in sonuna kadar dönmesini sağlar.		
			if(number.charAt(i) == kontrol){// dizinin döngüde ki o elemana kontrol sayısı eşitse
				sayac+=1;
				continue;
			}
			else{
				yenistr.append(sayac + "" + kontrol); // yenistr değişkenine sayacın o anki değeri ile birlikte kontrol değişkeni eklenir(birleştirilir)
				sayac = 1;
				kontrol = number.charAt(i);
				//continue;
			}						
		}
		yenistr.append(sayac++ + "" + kontrol);
		
		return yenistr.toString();
		
	}
}
