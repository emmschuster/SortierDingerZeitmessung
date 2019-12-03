package alleSortierverfahrenZeitmesung;

public class Bogosort {
	public int zaehler;
	private int[] afuellung;
	
	public Bogosort(int[] arr) {
		afuellung = arr;
		pruefen(afuellung);
	}
	
	private void pruefen(int[] a) { 
		System.out.println("Bogosort: ");
		System.out.println("es werden " + a.length + " elemente sortiert...");
		while(!isSortiert(a)) {
			zaehler++;
			mischeln(a);
		}
	}

	private void mischeln(int[] i) {
		for(int x = 0; x < i.length; x++) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean isSortiert(int[] i) {
		for(int x = 0; x < (i.length - 1); ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}
	
	public void print() {
		System.out.println("fertig (" + zaehler + " versuche)");
		for (int j = 0; j < afuellung.length; j++) {
			System.out.print(afuellung[j] + "	");
		}
		System.out.println();
	}
	
}

