package aula;

/*
 * Arvore binaria pois possui dois lados, esquerdo e direito
 * A insers�o n�o � t�o r�pida, por�m a busca � extremamente r�pida 
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
