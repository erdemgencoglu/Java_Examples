package SortingAlgorithm;

public class ShellSort {
	public void Shellsort(int [] array,int x){
		int hlength=(x/2);//atlama payımızı başta belirliyoruz						 
		int temp=0;
		int helper=0;
		
		while (hlength>0) { // döngü içerisinde atlama payımız 1 den küçük oluncaya kadar devam
			  				// ettiriyoruz
			for (int i = hlength; i < x; i++) {
				temp=array[i];
				helper=i;
				while (helper>=hlength && array[helper-hlength]>temp) {
					array[helper]=array[helper-hlength];
					helper=helper-hlength;
				}
				array[helper]=temp;
			}
			hlength=(hlength/2); //döngü sonunda atlama yeni atlama payımızı belirliyoruz
		}
	}
}
