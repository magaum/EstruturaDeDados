package aula;

public class Principal {

	public static void main(String args[]) {
		Arvore arvore = new Arvore();
		/*
		 * endere�o de mem�ria � criado com a linha 10 e atribu�do em arvore.raizd
		 */
		arvore.raiz = arvore.inserir(arvore.raiz, 17);
		arvore.raiz = arvore.inserir(arvore.raiz, 8);
		arvore.raiz = arvore.inserir(arvore.raiz, 19);
	}
}
