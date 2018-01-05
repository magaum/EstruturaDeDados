package aula;

public class HashEncadeado {
	private int m; /* n�mero de elementos da tabela */
	private No tabela[]; /* tabela de dispers�o */

	public HashEncadeado(int m) {
		this.m = m;
		this.tabela = new No[m];
	}

	/*
	 * Converte a chave em um valor [0,m-1]. O valor retornado ser� a posi��o da
	 * chave na tabela de dispers�o. Essa fun��o � chamada de fun��o de
	 * espalhamento, pois ela mapeia um valor (chave) do intervalo [0,R-1] para o
	 * intervalo [0,m-1], onde m � menor que R
	 */
	public int hash(int ch) {
		return ch % m;
	}

	/*
	 * As colis�es na tabela de dispers�o podem ser resolvidas usando listas
	 * encadeadas: todas as chaves que t�m um mesmo c�digo hash s�o armazenadas na
	 * lista
	 */
	public void inserir(int ch) {
		/* cria um n� */
		No no = new No();
		no.chave = ch;
		no.ocorrencia = 1;
		/* obt�m a posi��o na tabela de dispers�o */
		int hc = hash(ch);
		if (tabela[hc] == null) { /* lista vazia */
			tabela[hc] = no;
		} else {
			No aux = tabela[hc];
			/* busca o final da lista ou um valor repetido */
			while (aux.proximo != null && aux.chave != ch) {
				aux = aux.proximo;
			}
			if (aux.chave == ch) {
				aux.ocorrencia++;
			} else {
				aux.proximo = no;
			}
		}
	}
/*
	public No buscar(int chave) {
		int h = hash(chave);
		//percorrer a lista
		No no = tabela[h];
		while(no!= null) {
			if(no.chave == chave) {
				return no;
			}
			no = no.proximo;
		}
		return no;
	}*/
	public boolean buscar(int nro) {
		int hc = hash(nro);
		No no = tabela[hc];
		//percorrer a lista
		while(no != null) {
			if(no.chave == nro) {
				return true;
			}
			no = no.proximo;
		}
		return false;
	}
	
	public String criaNome() {
		String r = "";
		for(int i = 0; i < 4; i++) {
			char letra = (char)(Math.random()*26+97);
			r+=letra;
		}
		return r;
	}
	
	public void remover(int nro) {
		int hc = hash(nro);
		No no = tabela[hc];
		No anterior = null;
		//percorrer
		while(no != null) {
			if (no.chave == nro) {
				anterior.proximo = no.proximo;
				break;
			}
		}
		anterior = no;
		no = no.proximo;
	}
	
	public void imprimir() {
		No aux;
		/* percorre o array */
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(i + ": ");
			/* percorre a lista encadeada que est� na posi��o i do array */
			aux = tabela[i];
			while (aux != null) {
				System.out.print(aux + " ");
				aux = aux.proximo;
			}
			System.out.println();
		}
	}
}
