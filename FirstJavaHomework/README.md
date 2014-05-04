
1. Problem: 

	1. π değerini hesaplamak: π sayısı sonsuz seri kullanılarak hesaplanabilir. Seri içerisinde ne kadar çok terim olursa, o kadar hassas 		hesaplama yapılmaktadır. 200.000 adım boyunca yaklaşılan π sayısının değerini ekrana yazdıran Java uygulamasını yazınız. 3.14159 ile 		başlayan bir değerin üretilmesi için kaç adım geçmesi gereklidir cevaplayınız. 
	2.e x hesaplamak: e^x ifadesi sonsuz seri ile hesaplanabilir. 
	Adım sayısını kullanıcıdan alarak e^x değerini hesaplayacak Java uygulamasını yazınız. 
	3. Tarihleri saklamak için aşağıda UML sınıf diyagramı verilen MyDate sınıfını ve bu sınıfın metod 
	ve özelliklerini test etmek için main metodu bulunan MyDateTest sınıfını yazınız. 

2. Problemin Çözümü(Solution): Döngüler yardımıyla verilen sonsuz serileri bloklaştırarak işlem yapıldı. MyDate sorusu içinde set-get methodları ile işlem yapıldı. Giriş değerleri için koşullar düzenlendi.

3. Programın Amacı(Purpose of Application): 
Java kodlarıyla matematiksel işlemler yapmak ve set-get methodları içinde koşul ifadeleri kullanarak uygulama geliştirmek.

4. En Çok Zorlanılan Kısım(Most Difficult Part): 
PI sayısı için 3.14159 gibi bir sayıya nasıl ulaştırılacağı an ki adım sayısı...

5. Programın Çalışması(How application works): 
PI ve e sayısı için yer alan classları OdevTest.java classı üzerinde çalıştırıyorum.MyDate classınıda MyDateTest.java classı üzerinde çalıştırıyoruz.

6. Metodlar(Functions): 

public static boolean isBigger(MyDate x,MyDate y)//Obje olarak gönderilen tarihleri karşılaştırır.
public String getDate()//Tarihin Strin olarak döndürülüp yazdırılmasını sağlar.
public void setDay(int day)//Private olan gün değişkenini aldırır.
public int getDay()//Private olan gün değişkenini döndürür.
public void setMonth(int month)//Private olan ay değişkenini aldırır.
public int getMonth()//Private olan ay değişkenini döndürür.
public void setYear(int year)//Private olan yıl değişkenini aldırır.
public int getYear()//Private olan yıl değişkenini döndürür.
public double pi1()//200000. Adımdaki pi değerini bulur.
public void pi2()//3.14159 sayısına kaçıncı adımda ulaşıldığını gösterir.
public double eserisi(double x)//sonsuz e serisine göre adım sayısı kullanıcıdan alınarak e sayısını buldurur.
public static double faktoriyel(double x)//faktoriyel hesabı yapmamıza yarar.
public static double power(double x,double y)//sayının üssünü alan methodumuz.

7. Buglar(Bugs): 3.14159 sayısında virgülden sonra 5 basamak olması bulunan sayıda 5 ten fazla basamak olması.
