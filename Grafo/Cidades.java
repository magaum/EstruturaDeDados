package aula;

import java.util.Arrays;

public class Cidades {

	String cidades[] = new String[] {"jacarei" , "guararema" , "sao jose" ,"taubate", "igarata" , "cacapava"};
	int[][] adj = new int[][] {
		/*jacarei*/			{ 0, 1, 1, 0, 1, 1 }, 
		/*gua*/				{ 1, 0, 1, 1, 0, 0 }, 
		/*sjc*/				{ 1, 1, 0, 1, 0, 1 },
		/*tte*/				{ 0, 0, 1, 0, 0, 1 }, 
		/*igarata*/			{ 1, 1, 0, 0, 0, 0 }, 
		/*cacapava*/		{ 1, 0, 1, 0, 1, 0 }, };
	String incd[] = new String[] {"jac-gua", "jac-sjc", "jac-igt", "jac-cac", "gua-sjc", "gua-tte", "sjc-tte", "sjc-cac", "tte-cac", "igt-gua"};	
		int[][] inc = new int[][] {
			/*jacarei*/			{ 1, 1, 1, 1, 0, 0, 0, 0, 0, 0 }, 
			/*gua*/				{ 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 }, 
			/*sjc*/				{ 0, 1, 0, 0, 1, 0, 1, 1, 0, 0 },
			/*tte*/				{ 0, 0, 0, 0, 0, 1, 1, 0, 1, 0 }, 
			/*igarata*/			{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 }, 
			/*cacapava*/		{ 0, 0, 0, 1, 0, 0, 0, 1, 1, 0 }, };

	public void imprimeAdj() {
		System.out.print("Matriz de adjacencia\n\n               ");
		for(int i = 0; i < cidades.length;i++) {
			System.out.printf("%11s", cidades[i]);
		}
		System.out.println();
		for(int i = 0; i < adj.length;i++) {
			System.out.printf("%-10s",cidades[i]);
				for(int j = 0;j < adj.length;j++) {
					System.out.printf("%11d ",adj[i][j]);
				}
				System.out.println();
		}
	}
	
	public void imprimeInc() {
	/*	0 jacarei > igarata > sjc > bot > cacapava
		1 igarata > sjc > tte > bot
		2 sjc > tte > bot > cacapava 
		3 tte > bot > cacapava 
		4 bot > cacapava > jacarei
		5 cacapava > jacarei > igarata
		*/
		System.out.print("\nMatriz de incidencia\n\n               ");
		for(int i = 0; i < incd.length;i++) {
			System.out.printf("%11s", incd[i]);
		}
		System.out.println();
		for(int i = 0; i < inc.length;i++) {
			System.out.printf("%-10s",cidades[i]);
			for(int j = 0; j < incd.length; j++) {
				System.out.printf("%11d",inc[i][j]);
			}System.out.println();
		}
	}
	
	public void vizinhos() {
		System.out.print("\nVizinhos\n               ");
		System.out.println();
		for(int i = 0; i < adj.length;i++) {
				int count=0;
				for(int j = 0;j < adj.length;j++) {
					if(adj[i][j]==1) {
						count++;
					}
				}
				System.out.printf("%-9s: %d\n",cidades[i],count);
		}
	}
	
}
