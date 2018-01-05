package filaFIFO;

public class Fila {
	private No inicio, fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	/* informa se a fila está vazia */
	public boolean isVazia() {
		return fim == null;
	}

	public void inserir(int nro) {
		/* criar um nó */
		No no = new No();
		no.conteudo = nro;
		no.proximo = null; /* este será o último nó da fila */
		/* checa se a lista está vazia */
		if (fim == null) {
			inicio = no;
		} else {
			/* alterar o próximo do último para o endereço do no */fim.proximo = no;
		}
		fim = no;
	}

	/* retira o elemento do início da fila */
	public int remover() {
		if (isVazia()) {
			System.out.println("Fila vazia");
			return -1;
		} else {
			int nro = inicio.conteudo;
			/* atualiza a posição de início */
			inicio = inicio.proximo;
			if (inicio == null) {
				fim = null;
			}
			return nro;
		}
	}

	/* remove todos os elementos da fila */
	public void limpar() {
		inicio = null;
		fim = null;
	}

	public void imprimir() {
		/* checa se a fila está vazia */
		if (isVazia()) {
			System.out.println("Lista vazia");
		} else {
			/* percorrer a fila até encontrar o último nó */
			No no = inicio;
			while (no != null) {
				System.out.print(no.conteudo + " ");
				no = no.proximo;
			}
			System.out.println(); /* quebra de linha na tela */
		}
	}
}