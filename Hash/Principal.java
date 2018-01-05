package aula;

public class Principal {

	public static void main(String[] args) {

			 int nro;
			 HashEncadeado hash = new HashEncadeado(11);
			 for( int i = 0; i < 50; i++ ){
			 nro = (int) (Math.random()*100);
			 hash.inserir(nro);
			 }
			 
			 hash.imprimir();
			 boolean a = hash.buscar(20);
			 System.out.println(hash.criaNome());
			 System.out.println(a);
	}
}
