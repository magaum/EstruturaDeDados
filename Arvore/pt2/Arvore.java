package aula7pt2;

public class Arvore {
	public No raiz;

	/* retorna a altura de uma �rvore bin�ria */
	public int altura(No no) {
		if (no == null) {
			return -1; /* �rvore vazia */
		} else {
			int altEsq = altura(no.esquerdo);
			int altDir = altura(no.direito);
			return altEsq < altDir ? altDir + 1 : altEsq + 1;
		}
	}

	/* libera a �rvore que se encontra abaixo do no */
	public No limpar(No no) {
		if (no != null) {
			no.esquerdo = limpar(no.esquerdo); /* limpa o lado esquerdo */
			no.direito = limpar(no.direito); /* limpa o lado direito */
		}
		return null;
	}

	public boolean buscar(No no, int nro) {
		if (no == null) {
			return false; /* n�o encontrou */
		} else {
			return nro == no.conteudo || buscar(no.esquerdo, nro) || buscar(no.direito, nro);
		}
	}

	/*
	 * Insere o nro mantendo os valores ordenados. A inser��o ser� em uma sub�rvore
	 * do no
	 */
	public No inserir(No no, int nro) {
		if (no == null) { /* �rvore vazia */
			no = new No();
			no.conteudo = nro;
		} else if (nro < no.conteudo) { /* percorre a sub�rvore esquerda */
			no.esquerdo = inserir(no.esquerdo, nro);
		} else { /* percorre a sub�rvore direita */
			no.direito = inserir(no.direito, nro);
		}
		return no;
	}

	/*
	 * Remove o n� que possui o nro mantendo os valores ordenados. A busca ser� em
	 * uma sub�rvore do no
	 */
	public No remover(No no, int nro){
		 if( no == null ){
		 return null; /* n�o existe o n� */
		 }
		 else if( nro < no.conteudo ){ /* o nro est� em um filho � esquerda */
		 no.esquerdo = remover(no.esquerdo, nro);
		 }
		 else if( nro > no.conteudo ){ /* o nro est� em um filho � direita */
		 no.direito = remover(no.direito, nro);
		 }
		 else{ /* o nro procurado est� no n� */
		 /* n� sem filhos */
		 if( no.esquerdo == null && no.direito == null ){
		 return null;
		 }
		 else if( no.esquerdo == null ){ /* n� s� tem filho � direita */
		 no = no.direito;
		 }
		 else if( no.direito == null ){ /* n� s� tem filho � esquerda */
		 no = no.esquerdo;
		 }
		 else{ /* n� tem os dois filhos */
		
		 No aux = no.esquerdo;
		 while( aux.direito != null ){
		 aux = aux.direito;
		 }
		 no.conteudo = aux.conteudo; /* troca os conte�dos */
		 aux.conteudo = nro;
		 no.esquerdo = remover(no.esquerdo, nro);
		 }
		 }
		 return no;
		 }

	/* varredura infixa ou em ordem ou sim�trica */
	public void imprimirEsqRaizDir(No no) {
		if (no != null) {
			imprimirEsqRaizDir(no.esquerdo);
			System.out.print(no.conteudo + " ");
			imprimirEsqRaizDir(no.direito);
		}
	}

	/* varredura prefixa ou pr�-ordem */
	public void imprimirRaizEsqDir(No no) {
		if (no != null) {
			System.out.print(no.conteudo + " ");
			imprimirRaizEsqDir(no.esquerdo);
			imprimirRaizEsqDir(no.direito);
		}
	}

	/* varredura posfixa ou p�s-ordem */
	public void imprimirEsqDirRaiz(No no) {
		if (no != null) {
			imprimirEsqDirRaiz(no.esquerdo);
			imprimirEsqDirRaiz(no.direito);
			System.out.print(no.conteudo + " ");
		}
	}
}