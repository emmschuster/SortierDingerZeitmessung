package alleSortierverfahrenZeitmesung;

import java.util.Random;
import java.util.Scanner;

public class AllMain {

	private static int laengeArray;
	private static int[] ranArray, ranArraybbs, ranArraybs, ranArrayss, ranArrayis;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wie lang soll der Array sein?");
		laengeArray=sc.nextInt();
		ranArray=new int[laengeArray];
		fillArray(ranArray);
		ranArraybbs=new int[laengeArray];
		ranArraybs=new int[laengeArray];
		ranArrayss=new int[laengeArray];
		ranArrayis=new int[laengeArray];
		fillArray(ranArraybbs);
		fillArray(ranArraybs);
		fillArray(ranArrayss);
		fillArray(ranArrayis);
		System.out.println("\nDein Array : ");
		for (int i = 0; i < ranArray.length; i++) {
			System.out.print(ranArray[i]+"	");
		}
		System.out.println("\n");
		
		long abbs=System.nanoTime();
		Bubblesort bbs=new Bubblesort(ranArraybbs);
		bbs.print();
		long ebbs=System.nanoTime();
		zeitausgabe(abbs,ebbs);
		
		long abs=System.nanoTime();
		Bogosort bs=new Bogosort(ranArraybs);
		bs.print();
		long ebs=System.nanoTime();
		zeitausgabe(abs,ebs);
		
		long ass=System.nanoTime();
		Selectionsort ss=new Selectionsort(ranArrayss);
		ss.print();
		long ess=System.nanoTime();
		zeitausgabe(ass,ess);
		
		long ais=System.nanoTime();
		Insertionsort is=new Insertionsort(ranArrayis);		
		is.print();
		long eis=System.nanoTime();
		zeitausgabe(ais,eis);
		sc.close();
	}

	private static void zeitausgabe(long abbs, long ebbs) {
		long zeit=ebbs-abbs;
		System.out.println("Es hat "+zeit+" nano Sekunden gedauert.");
	}

	private static void fillArray(int[] x) {
		Random rnd = new Random();
		for (int i = 0; i < laengeArray; i++) {
			x[i] = rnd.nextInt(101);		//zahlen von 1 bis 100 werden random eini gmacht
		}
		
	}

}
