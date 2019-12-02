package alleSortierverfahrenZeitmesung;

public class Bubblesort {
	private int zaehler;
	private int[] afuellung;
	
	public Bubblesort(int[] ranArray) {
		afuellung=ranArray;
		bubblesort(afuellung);
	}
	public int[] bubblesort(int[] x) {	//stabil und in-place
		int temp;
		for(int i=1; i<x.length; i++) {
			for(int j=0; j<x.length-i; j++) {
				if(x[j]>x[j+1]) {
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					zaehler++;
				}
			}
		}
		return x;
	}
	public void print() { 	
		System.out.println("Bubblesort:");
		System.out.println("Anzahl Durchgänge : "+zaehler);
		for (int j = 0; j < afuellung.length; j++) {
			System.out.print(afuellung[j] + "	");
		}
		System.out.println();
	}
}
