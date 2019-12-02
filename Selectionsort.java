package alleSortierverfahrenZeitmesung;

public class Selectionsort {
	private int zaehler=0;
	private int[] afuellung;
	
	public Selectionsort(int x[]) {
		afuellung=x;
		selectionsort(x);
	}
	
	public int[] selectionsort(int[] x) {	
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) { //warum springt er da ned eini?
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					System.out.println("hallo");
				}
			}
		}

		return x;
	}

	public void print() {
		System.out.println("\nSelectionsort: ");
		System.out.println("Anzahl der Durchgänge : "+zaehler);
		for (int i = 0; i < afuellung.length; i++) {
			System.out.print(afuellung[i]+"   ");
		}
		System.out.println("");
	}
	
}
