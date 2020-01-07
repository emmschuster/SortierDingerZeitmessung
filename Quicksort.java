package alleSortierverfahrenZeitmesung;

public class Quicksort {
	private int[] mlist;
	public Quicksort(int[] arr) {
		mlist = arr;
		print();
	}

	private static void show(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "    ");
		}
		System.out.println("");
	}

	private static void quicks(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		// darf i da p schu deklarieren oder soll i des aussen machen?
		int p = partition(array, start, end);
		System.out.println("Teilung bei Index : " + p);
		quicks(array, start, p - 1);
		quicks(array, p + 1, end);
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[start];
		int low = start + 1;
		int high = end;
		// boolean x=true;
		while (true) {
			while (low <= high && array[high] >= pivot) {
				high -= 1;
			}
			while (low <= high && array[low] <= pivot) {
				low += 1;
			}
			if (low <= high) {
				array[low] = array[high];
				array[high] = array[low];
			} else {
				System.out.print("low berührt high break");
				break;
			}
		}
		array[start] = array[high];
		array[high] = array[start];
		System.out.println("vertausche pivot mit high stelle");
		show(array);
		return high;
	}

	public void print() {
		System.out.println("Anfangsarray: ");
		show(mlist);
		int laenge = mlist.length;
		quicks(mlist, 0, (laenge - 1));
		System.out.println("Endzustand: ");
		show(mlist);
	}
}