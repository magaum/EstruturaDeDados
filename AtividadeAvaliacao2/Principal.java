package avaliacao;

import javax.swing.JOptionPane;

public class Principal {
	static Sequencia sequencia;

	public static void main(String[] args) {

		String menu;
		do {
			menu = JOptionPane.showInputDialog("1 - Criar sequência\n" + "2 - Adicionar valor\n" + "3 - Imprimir");
			if (menu != null) {
				switch (menu) {
				case "1":
					criar();
					break;
				case "2":
					add();
					break;
				case "3":
					imprimir();
					break;
				}
			}
		} while (menu != null);
	}

	public static void criar() {
		boolean conversao;
		String escolha;
		do {
			escolha = JOptionPane.showInputDialog("Entre com a quantidade");
			conversao = validaNum(escolha);
		} while (conversao == false);
		int quant = Integer.valueOf(escolha);
		if (sequencia == null) {
			sequencia = new Sequencia(quant);
		} else {
			sequencia.resize(quant);
		}
	}

	public static void add() {
		if (sequencia == null) {
			sequenciaVazia();
		} else {
			String escolha;
			boolean conversao;
			do {
				escolha = JOptionPane.showInputDialog("Entre com o número");
				conversao = validaNum(escolha);
			} while (conversao == false);
			boolean ok = sequencia.add(Integer.parseInt(escolha));
			if (!ok) {
				JOptionPane.showMessageDialog(null, "Sequência cheia");
			}
		}
	}

	public static void imprimir() {
		if (sequencia == null) {
			sequenciaVazia();
		} else {
			sequencia.imprimir();
		}
	}

	public static void sequenciaVazia() {
		JOptionPane.showMessageDialog(null, "Primeiro é necessário criar a sequência usando a opção 1");
	}

	public static boolean validaNum(String escolha) {
		try {
			Integer.valueOf(escolha);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
