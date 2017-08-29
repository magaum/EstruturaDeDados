package avaliacao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int lista[] = new int[10];
		String opcao;
		int num = 0;
		boolean flag = true;
		boolean cancelar = false;
		Scanner scanner = new Scanner(System.in);

		while (cancelar == false) {
			do {
				opcao = JOptionPane.showInputDialog("1 - Criar Array\n" + "2  - Imprimir na ordem normal\n"
						+ "3 - Imprimir na ordem invertida\n" + "4 - Imprimir os elementos em posições pares\n"
						+ "5 - Imprimir os elementos pares\n" + "6 - Imprimir somatório");

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
					System.out.println("Digite o valor para as posições do vetor");
					for (int i = 0; i < lista.length; i++) {
						System.out.print("[" + (i) + "] = ");
						lista[i] = scanner.nextInt();
					}
					break;
				}
				case 2: {
					for (int i = 0; i < lista.length; i++) {
						System.out.println("Posição [" + (i) + "] = " + lista[i]);
					}
					break;
				}
				case 3: {
					for (int i = lista.length - 1; i >= 0; i--) {
						System.out.println("Posição [" + (i) + "] = " + lista[i]);
					}

					break;
				}
				case 4: {
					for (int i = 0; i < lista.length; i += 2) {
						System.out.println("Posição [" + (i) + "] = " + lista[i]);
					}
					break;
				}
				case 5: {
					for (int i = 0; i < lista.length; i++) {
						if (lista[i] % 2 == 0)
							System.out.println("Posição [" + (i) + "] = " + lista[i]);
					}

					break;
				}
				case 6: {
					int soma = 0;
					for (int i = 0; i < lista.length; i++) {
						soma += lista[i];
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
