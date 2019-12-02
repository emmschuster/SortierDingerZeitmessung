package alleSortierverfahrenZeitmesung;

public class Insertionsort {
	private int zeahler;
	private int[] afuellung;
	public Insertionsort(int x[]) {
		afuellung=x;
		intersectionSort(afuellung);
	}
	
	public void print() {
		System.out.println("\nInsertionsort: ");
		System.out.println("Anzahl der Durchgänge : "+zeahler);
		for (int i = 0; i < afuellung.length; i++) {
			System.out.print(afuellung[i]+"	");
		}
		System.out.println("");
	}
	
	public int[] intersectionSort(int[] x) {	
		int temp;
		for (int i = 1; i < x.length; i++) {		
			temp = x[i];
			int j = i;
			while (j > 0 && x[j - 1] > temp) {
				x[j] = x[j - 1];
				j--;
				zeahler++;
			}
			x[j] = temp;
		}
		return x;
	}
}
