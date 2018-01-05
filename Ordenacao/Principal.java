package ultimaAula;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		/*Heapsort
		 * int[] v1 = { 14, 8, 13, 8, 15, 17, 10, -10, 4, 15, 8, 12, 17, 12, -1 };
		
		int[] v2 = { -10, -1, 4, 8, 8, 8, 10, 12, 12, 13, 14, 15, 15, 17, 17 };
		int[] v3 = { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25 };
		int[] v4 = { 15, 16, 11, 5, 9, 2, 18, 20, 7 };
		Heapsort hs = new Heapsort();
		hs.heapsort(v4);
		System.out.println();
		System.out.println("Trocas: "+hs.count);*/
		int[] v3 = { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25 };
		Mergesort mg = new Mergesort();
		mg.mergesort(v3);
		System.out.println(Arrays.toString(v3));
	}
}