package avaliacao;

public class Ponto {
	private int x;
	private int y;

	public Ponto() {
		this.x = (int) (Math.random() * 10 + 1);
		this.y = (int) (Math.random() * 10 + 1);
	}

	public double distancia() {
		double dx = Math.pow(x, 2);
		double dy = Math.pow(y, 2);
		return Math.sqrt(dx + dy);
	}

	public void imprimir() {
		System.out.println("(" + x + "," + y + ")");
	}
}
