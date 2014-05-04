package SortingAlgorithm;

public class InsertionSort {
	public void Insertionsort(int[] array,int x){
		int temp=0;
		int helper=0;
		for (int i = 1; i < x; i++) {
			temp=array[i];//dizinin i nci elemenını temp e aktarıyoruz
			helper=i-1;
			while (helper>=0 && array[helper]>temp) {// helper 0 dan büyük eşit ve helper indisli değer temp değerinden büyükse 
													 // while döngüsüne girer.
				array[helper+1]=array[helper];//
				helper=helper-1;			  // gerekli yer değiştirme yapılır
				array[helper+1]=temp;         //
			}
		}
	}
}
