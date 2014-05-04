package SortingAlgorithm;

public class QuickSort {
	public void Quicksort(int[] array, int altindis, int üstindis) {
		// altindis o adımda sıralanan yeni oluşturulan dizilerin en küçük
		// indisidir
		// üstindis o adımda sıralanan yeni oluşturulan dizilerin en büyük
		// indisidir

		int i = altindis, j = üstindis, h;
		// x terimi, mukayesenin yapılacağı quick sort tabiriyle pivottur.
		int x = array[(altindis + üstindis) / 2]; // dizimizin tam ortası yada
													// ortancı elemanı
		// Takas eylemiyle diziyi ayrıştırma
		do {
			while (array[i] < x)
				i++;
			while (array[j] > x)
				j--;
			if (i <= j) {
				h = array[i];
				array[i] = array[j];
				array[j] = h;
				i++;
				j--;
			}
		} while (i <= j);
		// yinelge (recursion) sıralamanın tekrarlandığı kısım
		if (altindis < j)
			Quicksort(array, altindis, j);
		if (i < üstindis)
			Quicksort(array, i, üstindis);
	}
}
