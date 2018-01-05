package aula;

/*
 * Arvore binaria pois possui dois lados, esquerdo e direito
 * A insersão não é tão rápida, porém a busca é extremamente rápida 
 * 
 */

public class Arvore {
	No raiz;

	public No inserir(No no, int nro) {
		if (no == null) {
			no = new No();
			no.conteudo = nro;
		} else if (nro < no.conteudo) {
			no.esquerdo = inserir(no.esquerdo, nro);
		} else {
			no.direito = inserir(no.direito, nro);
		}
		return no;
	}

}
