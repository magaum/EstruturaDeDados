package filaFIFO;

public class Fila {
	private No inicio, fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	/* informa se a fila est� vazia */
	public boolean isVazia() {
		return fim == null;
	}

	public void inserir(int nro) {
		/* criar um n� */
		No no = new No();
		no.conteudo = nro;
		no.proximo = null; /* este ser� o �ltimo n� da fila */
		/* checa se a lista est� vazia */
		if (fim == null) {
			inicio = no;
		} else {
			/* alterar o pr�ximo do �ltimo para o endere�o do no */fim.proximo = no;
		}
		fim = no;
	}

	/* retira o elemento do in�cio da fila */
	public int remover() {
		if (isVazia()) {
			System.out.println("Fila vazia");
			return -1;
		} else {
			int nro = inicio.conteudo;
			/* atualiza a posi��o de in�cio */
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
		/* checa se a fila est� vazia */
		if (isVazia()) {
			System.out.println("Lista vazia");
		} else {
			/* percorrer a fila at� encontrar o �ltimo n� */
			No no = inicio;
			while (no != null) {
				System.out.print(no.conteudo + " ");
				no = no.proximo;
			}
			System.out.println(); /* quebra de linha na tela */
		}
	}
}