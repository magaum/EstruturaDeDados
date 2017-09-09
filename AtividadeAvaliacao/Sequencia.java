package avaliacao;

public class Sequencia {

	private int[] lista;
	private int posicao = 0;
	private int lenght;

	public Sequencia(int quant) {
		if (quant < 5)
			quant = 5;
		lenght = quant;
		lista = new int[quant];
	}

	public boolean add(int nro) {
		if (posicao < lenght) {
			lista[posicao] = nro;
			posicao++;
			return true;
		} else {
			return false;
		}
	}

	public void resize(int quant) {
		int aux = quant;
		if (quant < 5)
			aux = 5;
		lenght += aux;
		int[] list = new int[lenght];
		for (int i = 0; i < lenght - quant; i++) {
			list[i] = lista[i];
		}
		lista = new int[lenght];
		lista = list;
	}

	public void imprimir() {
		for (int i = 0; i < lenght; i++) {
			System.out.println(lista[i]);
		}
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

}
