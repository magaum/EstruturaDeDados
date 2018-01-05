package atividadeAvaliacao3;

public class Lista {
	No inicio;

	Lista() {
		/* a lista está vazia */
		inicio = null;
	}

	/* inserir no final da lista */
	void inserir(String nome) {
		/* criar um nó */
		No no = new No();
		no.conteudo = nome;
		no.proximo = null; /* este será o último nó da lista */
		/* checa se a lista está vazia */
		if (inicio == null) {
			inicio = no;
		} else {
			/* percorrer a lista até encontrar o último nó */
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			/* alterar o próximo do último para o endereço do no */
			ultimo.proximo = no;
		}
	}

	void imprimir() {
		/* checa se a lista está vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			/* percorrer a lista até encontrar o último nó */
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
		/* percorrer a lista até encontrar o último nó */
		No ultimo = inicio;
		while (ultimo != null) {
			cont++;
			ultimo = ultimo.proximo;
		}
		return cont;
	}

	/* ordena os elementos da lista */
	void sort() {
		// definindo inicio da lista em uma variável para não perde-lo
		No ultimo = inicio;
		// flag para não causar loop infinito
		boolean flag = true;
		// contador para executar o metodo mais de uma vez
		int count = 0;
		// caso a variável ultimo seja nula não existe lista
		if (ultimo == null) {
			System.out.println("Lista vazia");
		} else {
			do {
				// enquanto o proximo conteúdo não for nulo o loop será executado pois existem
				// mais componentes na lista
				while (ultimo.proximo != null) {
					// atribuindo valores a variáveis para melhor controle
					String a = ultimo.conteudo.toLowerCase();
					String b = ultimo.proximo.conteudo.toLowerCase();
					/*
					 * O método compareTo retorna um int:
					 * 
					 * Caso "A" seja maior que "B", o método retorna 1. 
					 * Caso "A" seja menor que "B", o método retorna -1. 
					 * Caso "A" seja igual à "B", o método retorna 0.
					 * 
					 * Referêcia: https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html
					 * 
					 * Caso a String a seja maior em ordem alfabética EX.: B > A os valores são
					 * trocados
					 *
					 */
					if (a.compareTo(b) > 0) {
						//String auxiliar para não perder o valor de B
						String aux = ultimo.proximo.conteudo;
						//Atribuindo valor de A em B
						ultimo.proximo.conteudo = ultimo.conteudo;
						//Retornando valor de auxiliar para A
						ultimo.conteudo = aux;
					}
					//se esta flag não existisse o programa iria incrementar count para sempre e um loop infinito acontecerá
					if (flag == true)
						count++;
					//define ultimo como próximo membro da lista
					ultimo = ultimo.proximo;
				}
				//desliga flag para parar de incrementar count
				flag = false;
				//volta ao inicio da lista
				ultimo = inicio;
				//count é decrementado 
				count--;
			} while (count != 0);
		}
	}
}
