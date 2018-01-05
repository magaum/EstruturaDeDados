package aula;

import javax.swing.JOptionPane;

public class Hash {
	private int m; /* n�mero de elementos da tabela */
	private No tabela[]; /* tabela de dispers�o */

	public Hash(int m) {
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
	public void inserir(String nome) {
		/* cria um n� */
		No no = new No();
		Integer ch;
		ch = nome.hashCode();
		if (ch < 0) {
			ch *= -1;
		}
		no.nome = nome;
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

	public void remover(String nome) {
		int ch;
		ch = nome.hashCode();
		if (ch < 0) {
			ch *= -1;
		}
		int hc = hash(ch);
		No inicio = tabela[hc];
		if (inicio != null) {
			No aux = inicio.proximo;
			if (inicio.chave == ch) {
				if (inicio.ocorrencia > 1)
					tabela[hc].ocorrencia--;
				else
					tabela[hc] = tabela[hc].proximo;
			} else {
				while (aux != null || aux.chave != ch) {
					aux = aux.proximo;
					inicio = inicio.proximo;
				}
				if (aux.chave == ch) {
					if (aux.ocorrencia > 1)
						aux.ocorrencia--;
					else
						inicio = inicio.proximo.proximo;
				}
			}
		}
	}

	public void buscar(String nome) {
		boolean encontrou = false;
		int ch;
		ch = nome.hashCode();
		if (ch < 0) {
			ch *= -1;
		}
		
		int hc = hash(ch);
		No inicio = tabela[hc];
		if (inicio != null) {
			No aux = inicio.proximo;
			if (inicio.chave == ch && inicio.nome.equals(nome)) {
				JOptionPane.showMessageDialog(null,
						"Nome encontrado!\n" + "Nome buscado: " + nome + "\n" + "Nome encontrado: " + inicio.nome + "\n"
								+ "Chave: " + inicio.chave + "\n" + "Ocorrencias: " + inicio.ocorrencia + "\n");
				encontrou = true;
			} else {
				while (aux != null && aux.chave != ch) {
					aux = aux.proximo;
					inicio = inicio.proximo;
				}
				try {
					if (aux.chave == ch) {
						JOptionPane.showMessageDialog(null, "Nome encontrado!\n" + "Chave: " + inicio.chave + "\n"
								+ "Ocorrencias: " + inicio.ocorrencia + "\n" + "Proximo nome: " + inicio.proximo.nome);
						encontrou = true;
					}
				} catch (Exception e) {

				}
			}
			if (encontrou == false) {
				JOptionPane.showMessageDialog(null, "Nome n�o encontrado");
			}
		}
	}

	public void imprimir() {
		No aux;
		/* percorre o array */
		for (int i = 0; i < tabela.length; i++) {
			System.out.print(i + ": ");
			/* percorre a lista encadeada que est� na posi��o i do array */
			aux = tabela[i];
			while (aux != null) {
				System.out.print(aux.nome + " ");
				aux = aux.proximo;
			}
			System.out.println();
		}
		System.out.println();
	}
}
