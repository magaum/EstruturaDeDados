package aula;

public class Cliente implements Comparable{

	int idade;
	String nome;
	public Cliente(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	public int compareTo(Cliente c) {
		return this.nome.compareTo(c.nome);
	}
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

}
