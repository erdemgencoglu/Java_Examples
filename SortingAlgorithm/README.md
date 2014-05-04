							SIRALAMA ALGORİTMALARI ( SORTING ALGORITHMS )

Bu repo içerisinde 5 farklı Sıralama Algoritması yer almaktadır.

 -->Seçmeli Sıralama(İngilizcesi Selectionsort)
 -->Eklemeli Sıralama (İngilizcesi: Insertion Sort),
 -->Kabarcık Sıralaması(İngilizcesi: Bubblesort)
 -->Hızlı Sıralama (İngilizcesi: Quicksort) 
 -->Kabuk Sıralaması (İngilizcesi: Shell sort)

 Bu program kişiye 999 elemanlı bir diziyi istediği sıralama algoritmasıyla sıralamasını sağlar ve sıralama sonunda sıralama işleminin kaç milisaniye sürdüğünü gösterir.Böylece hangi sıralama algoritmasının daha hızlı olduğunu görme şansımız olacaktır.Aşağıda sıralama algoritmalarının nasıl bir algoritma kullanıldığı anlatılmıştır.


 --> Seçmeli Sıralama(Selectionsort) <--

 	Algoritmanın çalışma şekli
		Bu sıralama algoritmasında düzensiz dizi tek tek ele alınır ve sıralama şekline göre yerleştirilir.Örneğin,listedeki en küçük değerli öğe bulunur.İlk konumdaki öğeyle(0 ıncı indis) bulunan en küçük değerli öğenin yeri değiştirtirilir. Yukarıdaki adımları listenin ilk elemanından sonrası için (ikinci elemandan başlayarak) yinelenir.Dizi kontrol edilip sıralı olduğu anlaşılınca sıralama sonra erer.

Sıralamanın nasıl yapıldığını görsel olarak bu adresten bulabilirsin.

http://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif

-->Eklemeli Sıralama (Insertion Sort)<--
	
	Algoritmanın çalışma şekli
		Bu sıralama algoritması düzensiz dizi elemanlarını tek tek ele alarak her birini dizinin sıralanmış kısmındaki uygun yerine yerleştirme esasına dayanır. Genellikle günlük hayatımızda farketmeden(örneğin iskambil kağıtlarının sıralanması) sıkça kullandığımız bir çözüm yöntemidir. 2. elemandan başlayarak elemanın kendinden önceki elemanlarla karşılaştırılması suretiyle büyük elemanlar dizide sağa doğru kaydırılır. Böylelikle açılan uygun pozisyona o anda sıralanmakta olan eleman yerleştirilir.

Sıralamanın nasıl yapıldığını görsel olarak bu adresten bulabilirsin.

http://upload.wikimedia.org/wikipedia/commons/2/25/Insertion_sort_animation.gif

--> Kabarcık Sıralaması(Bubblesort) <--

	Algoritmanın çalışma şekli
		Sıralanacak belirli elemandaki dizinin ilk eleman alınır. Eğer kendinden sonrakinden büyükse yerleri değiştirilir.(Yani algoritma gereği çift olarak karşılaştırılır.) Sonraki elemana geçilir ve aynı işlem tekrarlanır. İlk turda dizinin sonuna varıldığında en büyük eleman sonda yer almış olur. Dizinin başına dönerek bu işlem sondan birinci elemana kadar tekrarlanır. Her adımda bir eleman daha azaltılarak devam eden algoritmada bütün elemanların yerini bulmasıyla sonlanır.

Sıralamanın nasıl yapıldığını görsel olarak bu adresten bulabilirsin.

http://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif

-->Hızlı Sıralama (Quicksort)<-- 

 	Algoritmanın çalışma şekli
 		Sayı dizisinden herhangi bir sayıyı pivot eleman olarak seçilir.Sayı dizisini pivottan küçük olan tüm sayılar pivotun önüne, pivottan büyük olan tüm sayılar pivotun arkasına gelecek biçimde düzenlenir. (pivota eşit olan sayılar her iki yana da geçebilir) Bu bölümlendirme işleminden sonra eleman sıralanmış son dizide olması gerektiği yere gelir. Algoritmanın bu aşamasına bölümlen-dirme aşaması denir.Pivotun sol ve sağ yanında olmak üzere oluşan iki ayrı küçük sayı dizisi, hızlı sıralama algoritması bu küçük parçalar üzerinde yeniden çağrılarak sıralanır.Algoritma içinde sayı kalmayan (eleman sayısı sıfır olan) bir alt diziye ulaştığın-da bu dizinin sıralı olduğunu varsayılır.

Sıralamanın nasıl yapıldığını görsel olarak bu adresten bulabilirsin.
 		
http://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif

-->Kabuk Sıralaması (Shell sort)<--

	Algoritmanın çalışma şekli
		Bu sıralama algoritması dizi elemanlarını dizinin uzunluğuna göre belirlenen atlama payına(dizi büyüklüğünün yarısı) göre karşılaştırır. Atlama payını da dizi büyüklüğüne göre biz belirliyoruz. Mesela n elemanlı dizimiz olsun. n/2 bizim dizideki atlama payımızdır. 7 elemanlı ise 7 / 2 = 3.5 = 3'er 3'er atlatacağız. Mesela 0. eleman ile 3. elemanı karşılaştırır. 0. eleman büyükse yer değiştirirler. Ta ki atlama payi 1'den küçük kalana kadar. Her döngüden sonra n /= 2 ile yeni atlama miktarı belirliyoruz.
		3 / 2 = 1.5 = 1. Bu adımdan sonra elemanlar arasında birer birer atlama yapar. Bu döngüden sonra bir sonraki atlama payı 1'den küçük olacağı için sıralama sonlandırılır.

Sıralamanın nasıl yapıldığını görsel olarak bu adresten bulabilirsin.

http://upload.wikimedia.org/wikipedia/commons/d/d8/Sorting_shellsort_anim.gif