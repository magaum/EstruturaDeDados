package atividadeAvaliacao3;

public class Lista {
	No inicio;

	Lista() {
		/* a lista est� vazia */
		inicio = null;
	}

	/* inserir no final da lista */
	void inserir(String nome) {
		/* criar um n� */
		No no = new No();
		no.conteudo = nome;
		no.proximo = null; /* este ser� o �ltimo n� da lista */
		/* checa se a lista est� vazia */
		if (inicio == null) {
			inicio = no;
		} else {
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			/* alterar o pr�ximo do �ltimo para o endere�o do no */
			ultimo.proximo = no;
		}
	}

	void imprimir() {
		/* checa se a lista est� vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
			System.out.println(); /* quebra de linha na tela */
		}
	}

	/* retorna a quantidade de elementos da lista */
	int size() {
		int cont = 0;
		/* percorrer a lista at� encontrar o �ltimo n� */
		No ultimo = inicio;
		while (ultimo != null) {
			cont++;
			ultimo = ultimo.proximo;
		}
		return cont;
	}

	/* ordena os elementos da lista */
	void sort() {
		// definindo inicio da lista em uma vari�vel para n�o perde-lo
		No ultimo = inicio;
		// flag para n�o causar loop infinito
		boolean flag = true;
		// contador para executar o metodo mais de uma vez
		int count = 0;
		// caso a vari�vel ultimo seja nula n�o existe lista
		if (ultimo == null) {
			System.out.println("Lista vazia");
		} else {
			do {
				// enquanto o proximo conte�do n�o for nulo o loop ser� executado pois existem
				// mais componentes na lista
				while (ultimo.proximo != null) {
					// atribuindo valores a vari�veis para melhor controle
					String a = ultimo.conteudo.toLowerCase();
					String b = ultimo.proximo.conteudo.toLowerCase();
					/*
					 * O m�todo compareTo retorna um int:
					 * 
					 * Caso "A" seja maior que "B", o m�todo retorna 1. 
					 * Caso "A" seja menor que "B", o m�todo retorna -1. 
					 * Caso "A" seja igual � "B", o m�todo retorna 0.
					 * 
					 * Refer�cia: https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html
					 * 
					 * Caso a String a seja maior em ordem alfab�tica EX.: B > A os valores s�o
					 * trocados
					 *
					 */
					if (a.compareTo(b) > 0) {
						//String auxiliar para n�o perder o valor de B
						String aux = ultimo.proximo.conteudo;
						//Atribuindo valor de A em B
						ultimo.proximo.conteudo = ultimo.conteudo;
						//Retornando valor de auxiliar para A
						ultimo.conteudo = aux;
					}
					//se esta flag n�o existisse o programa iria incrementar count para sempre e um loop infinito acontecer�
					if (flag == true)
						count++;
					//define ultimo como pr�ximo membro da lista
					ultimo = ultimo.proximo;
				}
				//desliga flag para parar de incrementar count
				flag = false;
				//volta ao inicio da lista
				ultimo = inicio;
				//count � decrementado 
				count--;
			} while (count != 0);
		}
	}
}
