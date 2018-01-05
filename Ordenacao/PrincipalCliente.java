package aula;

import java.util.Arrays;

public class PrincipalCliente {
	public static void main(String[] args) {
		
		 int[] v = { 14, 8, 13, 8, 15, 17, 10, -10, 4, 15, 8, 12, 17, 12, -1 };
		 /*int[]
		 * v2 = { -10, -1, 4, 8, 8, 8, 10, 12, 12, 13, 14, 15, 15, 17, 17 }; int[] v3 =
		 * { 33, 32, 30, 34, 28, 21, 23, 26, 27, 22, 29, 20, 28, 25 }; String[] v =
		 * {"zz","cb","be","ee","ab","ba","cb"}; int[] x = new int[10000]; for(int i =
		 * 0; i < x.length; i++) { x[i] = (int) (Math.random()*10000); } int a[] =
		 * x.clone(); int b[] = x.clone(); insercao(a); selecao(b); bolha(x);
		 */
		/*Cliente[] v = new Cliente[5];
		v[0] = new Cliente(18, "Pedro");
		v[1] = new Cliente(40, "Arley");
		v[2] = new Cliente(28, "Ana");
		v[3] = new Cliente(21, "Bruna");
		v[4] = new Cliente(25, "Carlos");*/
		insercao(v);
	}

	// algoritmo
	public static void insercao(int[] v) {
		int aux, j, count = 0, iteracoes = 0;
		/* o loop se repete i-1 vezes */
		for (int i = 1; i < v.length; i++) {
			iteracoes++;
			aux = v[i];
			/* pode chegar a percorrer todo o subarray v[0..i-1] */
			for (j = i - 1; j >= 0 && v[j] > aux; j--) {
				v[j + 1] = v[j];
			}
			v[j + 1] = aux;
			count++;
		}
		// imprimir(v);
		System.out.println("Numero de iteracoes: " + iteracoes);
		System.out.println("Trocas: " + count);
	}

	// algoritmo 2
	public static void selecao(int[] v) {
		int menor, aux, j, count = 0, iteracoes = 0;
		for (int i = 0; i < v.length - 1; i++) {
			menor = i;
			iteracoes++;
			/* identifica a posição do menor valor no subarray [i..v.length] */
			for (j = i + 1; j < v.length; j++) {
				if (v[j] < v[menor]) {
					menor = j; /* índice do menor valor */
				}
			}
			/* troca o menor valor com a posição i */
			aux = v[i];
			v[i] = v[menor];
			v[menor] = aux;
			count++;
		}
		// imprimir(v);
		System.out.println("Numero de iteracoes: " + iteracoes);
		System.out.println("Trocas: " + count);
	}

	// public static void bolha(String[] v) {
	// public static void bolha(int[] v) {
	public static void bolha(Cliente[] v) {
		int count = 0;
		int iteracoes = 0;
		// String aux;
		Cliente aux;
		boolean trocado = true;
		/* percorre todo o array n-vezes ou até não haver trocas */
		// for (int aux, i, fim = v.length - 1; fim > 0 && trocado; fim--) {
		// for (int i, fim = v.length - 1; fim > 0 && trocado; fim--) {
		for (int i, fim = v.length - 1; fim > 0 && trocado; fim--) {
			iteracoes++;
			trocado = false;
			/*
			 * a cada iteração o maior valor vai parar na última posição do subarray
			 * [0..fim]
			 */
			// para int
			for (i = 0; i < fim; i++) {
				// if (v[i] > v[i + 1]) {
				if (v[i].compareTo(v[i + i])>0) {
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
					trocado = true;
					count++;
				}
			}
			/*
			 * for(i = 0; i < fim; i++) { if(v[i].compareToIgnoreCase(v[i + 1]) > 0) { aux =
			 * v[i]; v[i] = v[i + 1]; v[i + 1] = aux; trocado = true; } }
			 */
			// imprime array em forma de texto, não a posição de memória
			// System.out.println(java.util.Arrays.toString(v));
		}
		System.out.println("Numero de iteracoes: " + iteracoes);
		System.out.println("Trocas: " + count);
	}

	public static void imprimir(int[] v) {
		System.out.println(Arrays.toString(v));
	}
}