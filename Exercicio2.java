package avaliacao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		Ponto lista[] = new Ponto[10];
		String opcao;
		int num = 0;
		boolean flag = true;
		boolean cancelar = false;
		Scanner scanner = new Scanner(System.in);

		while (cancelar == false) {
			do {
				opcao = JOptionPane.showInputDialog("1 - Criar Array\n" + "2  - Imprimir elementos\n"
						+ "3 - Imprimir elementos com distância maior que 4\n" + "4 - Imprimir o somatório das distâncias\n");

				if (opcao != null) {
					try {
						num = Integer.valueOf(opcao);
					} catch (NumberFormatException n1) {
						flag = false;
					}
				}
			} while (flag == false);
			if (opcao == null)
				cancelar = true;
			else {
				switch (num) {
				case 1: {
					for (int i = 0; i < lista.length; i++) {
						Ponto ponto = new Ponto();
						lista[i] = ponto;
					}
					System.out.println("Array criado com sucesso");
					break;
				}
				case 2: {
					for (int i = 0; i < lista.length; i++) {
						System.out.print("Posição [" + (i) + "] = ");
						lista[i].imprimir();
					}
					break;
				}
				case 3: {
					for (int i = 0; i < lista.length; i++) {
						if (lista[i].distancia() > 4.0) {
							System.out.println(lista[i].distancia());
							lista[i].imprimir();
						}
					}
					break;
				}
				case 4: {
					double soma = 0;
					for (int i = 0; i < lista.length; i++) {
						soma += lista[i].distancia();
					}
					System.out.println("Somatório = " + soma);
					break;
				}
				default:
					break;
				}
			}
		}
	}
}
