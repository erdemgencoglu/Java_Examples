package SortingAlgorithm;

public class BubbleSort {
	public void Bubblesort(int[] array,int x){
		int temp=0; //SWAP değişkenimiz
		for (int i=1; i<x; i++)// Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü
	    {
	        for(int j=0; j<(x-i); j++)// Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
	        {
	            if (array[j] > array [j+1])//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
	            {
	                temp = array [j];       //
	                array [j] = array [j+1];// SWAP
	                array [j+1] = temp;     //
	            }
	        }
	    }
	}
}
