package aula;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String opcao = "";
		int n;
		Hash hash = new Hash(10);
		do {
		opcao = JOptionPane.showInputDialog("Digite uma opção:\n"
				+ "1 - Inserir nome\n"
				+ "2 - Remover nome\n"
				+ "3 - Buscar nome\n"
				+ "4 - Imprimir\n"
				+ "5 - Sair");
		try{
			n = Integer.parseInt(opcao);
		}
		catch(Exception e) {
			n = 0;
		}
		switch(n) {
		case 1 : {
			opcao = JOptionPane.showInputDialog("Digite o nome para inserir: ");
			if(opcao.length()>10)
				JOptionPane.showMessageDialog(null, "Palavra muito grande, digite uma palavra com até 10 caracteres", "Erro", 2);
			else
			hash.inserir(opcao);
			n = 0;
			break;
		}
		case 2 : {
			opcao = JOptionPane.showInputDialog("Digite o nome para remover: ");
			hash.remover(opcao);
			n = 0;
			break;
		}
		case 3 : {
			opcao = JOptionPane.showInputDialog("Digite o nome para buscar: ");
			hash.buscar(opcao);
			n = 0;
			break;
		}
		case 4 : {
			hash.imprimir();
			n = 0;
			break;
		}
		default : {
			break;
		}
		}

		}while(n < 1 || n > 5);
	}
}
