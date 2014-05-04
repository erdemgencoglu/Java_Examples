package SortingAlgorithm;

public class SelectionSort {
	
	public void Selectionsort(int[] array,int x){
		
		int temp=0;// geçici değişkenimiz
		int helper=0;//yardımcı değişkenimiz
		
		for (int i = 0; i < x; i++) {
			helper=i;//bu kısımda i elemanını değer kaybına uğratmamak için helper a aktarıyoruz.
			for (int j = i; j < x; j++) {
				if(array[helper]>array[j]){
					helper=j;
				}
			}
			temp=array[i];         //
			array[i]=array[helper];// SWAP
			array[helper]=temp;    //
		}
	}

}
