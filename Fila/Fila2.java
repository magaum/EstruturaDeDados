package filaFIFO;

public class Fila2 {
	public class Fila {
		private int[] vetor;
		private int total; /* n�mero de elementos na fila */
		/* posi��o do pr�ximo elemento a ser retirado da fila */
		private int inicio;

		public Fila(){
		 vetor = new int[5];
		 inicio = 0;
		 total = 0;
		}

		/* informa se a fila est� vazia */
		public boolean isVazia() {
			return total == 0;
		}

		/* informa se a fila est� cheia */
		public boolean isCheia() {
			return total == vetor.length;
		}

		/* insere um elemento no final da fila */
		public void inserir(int nro) {
			if (isCheia()) {
				System.out.println("Fila cheia");
			} else {
				/* descobre onde ser� inserido o pr�ximo elemento */
				int fim = (inicio + total) % vetor.length;
				vetor[fim] = nro;
				total++;
			}
		}

		/* retira o elemento do in�cio da fila */
		public int remover() {
			if (isVazia()) {
				System.out.println("Fila vazia");
				return -1;
			} else {
				int nro = vetor[inicio];
				/* atualiza a posi��o de in�cio */
				inicio = (inicio + 1) % vetor.length;
				total--;
				return nro;
			}
		}

		/* remove todos os elementos da fila */
		public void limpar() {
			inicio = 0;
			total = 0;
		}

		public void imprimir() {
			if (isVazia()) {
				System.out.println("Fila vazia");
			} else {
				for (int i = 0, pos = inicio; i < total; i++) {
					pos = pos % vetor.length;
					System.out.print(vetor[pos] + " ");
					pos++;
				}
				System.out.println();
			}
		}
	}

}
