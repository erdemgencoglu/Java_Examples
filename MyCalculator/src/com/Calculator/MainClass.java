package com.Calculator;

import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Operations o1 = new Operations();
		Scanner input = new Scanner(System.in);
		double sayı1 = 0;
		double sayı2 = 0;
		int secim;
		int adet = 0;

		secim = menu();

		switch (secim) {
		case 1:
			System.out.println("Kaç adet sayı toplayacaksınız : ");
			try {
				adet = input.nextInt();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			if (adet <= 0 || adet == 1) {
				System.err.println("Yanlış değer girişi!!!");
				main(args);
			} else {
				if (adet > 2) {
					o1.MuchSum(adet);
				} else {
					System.out.println("Birinci sayıyı giriniz : ");
					try {
						sayı1 = input.nextDouble();
					} catch (Exception e) {
						System.err.println("ERROR\n");
						main(args);
					}
					System.out.println("İkinci sayıyı giriniz : ");
					try {
						sayı2 = input.nextDouble();
					} catch (Exception e) {
						System.err.println("ERROR\n");
						main(args);
					}
					System.out.println("Sonuç : " + o1.Sum(sayı1, sayı2));
				}
			}
			break;
		case 2:
			System.out.println("Birinci sayıyı giriniz : ");
			try {
				sayı1 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("İkinci sayıyı giriniz : ");
			try {
				sayı2 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("Sonuç : " + o1.Extraction(sayı1, sayı2));
			break;
		case 3:
			System.out.println("Kaç adet sayı çarpacaksınız : ");
			try {
				adet = input.nextInt();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			if (adet <= 0 || adet == 1) {
				System.err.println("Yanlış değer girişi!!!");
				main(args);
			} else {
				if (adet > 2) {
					o1.MuchMultiplication(adet);
				} else {
					System.out.println("Birinci sayıyı giriniz : ");
					try {
						sayı1 = input.nextDouble();
					} catch (Exception e) {
						System.err.println("ERROR\n");
						main(args);
					}
					System.out.println("İkinci sayıyı giriniz : ");
					try {
						sayı2 = input.nextDouble();
					} catch (Exception e) {
						System.err.println("ERROR\n");
						main(args);
					}
					System.out.println("Sonuç : "+ o1.Multiplication(sayı1, sayı2));
				}
			}
			break;
		case 4:
			System.out.println("Birinci sayıyı giriniz : ");
			try {
				sayı1 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("İkinci sayıyı giriniz : ");
			try {
				sayı2 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			if (sayı2 == 0) {
				do {
					System.err.println("Payda sıfır olamaz");
					System.out.println("\n\nLütfen yeniden giriniz : ");
					sayı2 = input.nextDouble();
				} while (sayı2 == 0);
			}
			System.out.println("Sonuç : " + o1.Partition(sayı1, sayı2));
			break;
		case 5:
			System.out.println("Hangi sayının yüzdesini bulmak istiyorsunuz : ");
			try {
				sayı1 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("Bu sayının %'de kaçını bulmak istiyorsunuz : ");
			try {
				sayı2 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("Sonuç : " + o1.Percent(sayı1, sayı2));
			break;
		case 6:
			System.out.println("Hangi sayının faktöriyelini almak istiyorsunuz : ");
			try {
				sayı1 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("Sonuç : " + o1.factorial(sayı1));
			break;
		case 7:
			System.out.println("Hangi sayının kuvvetini almak istiyorsunuz : ");
			try {
				sayı1 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
			}
			System.out.println("Bu sayının kaçıncı kuvvetini almak istiyorsunuz : ");
			try {
				sayı2 = input.nextDouble();
			} catch (Exception e) {
				System.err.println("ERROR\n");
				main(args);
			}
			System.out.println("Sonuç : " + o1.power(sayı1, sayı2));
			break;
		default:
			System.err.println("Hatalı seçim!!!\n\n");
			main(args);
			break;
		}
	}

	public static int menu() {
		int secim = 0;
		Scanner input = new Scanner(System.in);
		System.out
				.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Yüzde\n6-Faktoriyel\n7-Üs alma");
		System.out.print("\nSeçiminiz : ");
		try {
			secim = input.nextInt();
		} catch (Exception e) {
			System.err.println("ERROR\n");
			System.exit(-1);
		}
		return secim;
	}
}
