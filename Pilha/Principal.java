package pilha;

import filaFIFO.Fila;

public class Principal {
	public static void main(String[] args) {
/*		Pilha p = new Pilha(20);
		int n = 89, r;
		while (n >= 1) {
			r = n % 2;
			System.out.print(r);
			n /= 2;
			p.push(r);
		}
		System.out.println();
		int soma = 0, e = 1;
		while (!p.isVazia()) {
			r = p.pop();
			System.out.print(r);
			soma += r * e;
			e*=2;
		}*/
		
		Fila p = new Fila();
		int n = 89, r;
		while (n >= 1) {
			r = n % 2;
			System.out.print(r);
			n /= 2;
			p.inserir(r);
		}
		System.out.println();
		int soma = 0, e = 1;
		while (!p.isVazia()) {
			r = p.remover();
			System.out.print(r);
			soma += r * e;
			e*=2;
		}
		
		System.out.println("\nSoma: " + soma);
		/*
		 * String txt = "bom dia"; char c; Pilha pilha = new Pilha(txt.length()); for
		 * (int i = 0; i < txt.length(); i++) { c=txt.charAt(i); pilha.push(c); }
		 * while(!pilha.isVazia()) { System.out.print((char)pilha.pop()); }
		 * System.out.println(); pilha.imprimir(); // Pilha vazia pilha.push(2);
		 * pilha.imprimir(); // 2 pilha.push(4); pilha.imprimir(); // 2 4 pilha.push(6);
		 * pilha.imprimir(); // 2 4 6 pilha.push(8); pilha.imprimir(); // 2 4 6 8
		 * pilha.push(9); pilha.imprimir(); // 2 4 6 8 9 pilha.push(11); // Pilha cheia
		 * pilha.imprimir(); // 2 4 6 8 9 pilha.pop(); pilha.imprimir(); // 2 4 6 8
		 * pilha.pop(); pilha.imprimir(); // 2 4 6 pilha.pop(); pilha.imprimir(); // 2 4
		 * pilha.push(3); pilha.imprimir(); // 2 4 3 pilha.pop(); pilha.imprimir(); // 2
		 * 4 pilha.pop(); pilha.imprimir(); // 2 pilha.pop(); pilha.imprimir(); // Pilha
		 * vazia
		 */
	}
}
