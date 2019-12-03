package alleSortierverfahrenZeitmesung;

import java.util.Random;
import java.util.Scanner;

public class AllMain {

	private static int laengeArray;
	private static int[] ranArray;
	private static int sortierArt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie lang soll der Array sein?");
		laengeArray = sc.nextInt();
		ranArray = new int[laengeArray];
		fillArray(ranArray);
		System.out.println("\nDein Array : ");
		for (int i = 0; i < ranArray.length; i++) {
			System.out.print(ranArray[i] + "	");
		}
		System.out.println("\n");
//		System.out.println("hallo1");
		System.out.println(
				"Mithilfe welchem Verfahren soll er sortiert werden?\nBubblesort = 1\nBogosort = 2\nSelectionsort = 3\nInsertionsort = 4");
		try {
			sortierArt = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Es dürfen nur Zahlen eingeben werden!!!");
		}
		System.out.println("");
		if (sortierArt > 4) {
			System.out.println("Die Zahl muss zwischen 1 und 4 liegen!!!");
		} else {
			switch (sortierArt) {
			case 1:
				long abbs = System.nanoTime();
				Bubblesort bbs = new Bubblesort(ranArray);
				bbs.print();
				long ebbs = System.nanoTime();
				zeitausgabe(abbs, ebbs);
//			System.out.println("hallo2");
				break;
			case 2:
				long abs = System.nanoTime();
				Bogosort bs = new Bogosort(ranArray);
				bs.print();
				long ebs = System.nanoTime();
				zeitausgabe(abs, ebs);
				break;
			case 3:
				long ass = System.nanoTime();
				Selectionsort ss = new Selectionsort(ranArray);
				ss.print();
				long ess = System.nanoTime();
				zeitausgabe(ass, ess);
				break;
			case 4:
				long ais = System.nanoTime();
				Insertionsort is = new Insertionsort(ranArray);
				is.print();
				long eis = System.nanoTime();
				zeitausgabe(ais, eis);
				break;
			}
		}
		sc.close();
	}

	private static void zeitausgabe(long abbs, long ebbs) {
		long zeit = ebbs - abbs;
		System.out.println("Es hat " + zeit + " nano Sekunden gedauert.");
	}

	private static void fillArray(int[] x) {
		Random rnd = new Random();
		for (int i = 0; i < laengeArray; i++) {
			x[i] = rnd.nextInt(101); // zahlen von 1 bis 100 werden random eini gmacht
		}

	}

}
