package exercicios_target;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		while (true) {
			System.out.println("Digite um número inteiro: ");
			try {
				n = scanner.nextInt();
				break;

			} catch (InputMismatchException excecao) {
				System.out.println("Para calcular a sequência Fibonacci só podem ser usados números interios.");
				scanner.nextLine();
			}
		}

		if (n < 0) {
			System.out.println("Números negatios não pertencem a sequência de Fibonacci.");
		} else {

			int n1 = 0;
			int n2 = 1;
			int res = 0;
			boolean fibonacci = false;

			while (res <= n) {
				if (res == n) {
					fibonacci = true;
					break;
				}
				res = n1 + n2;
				n1 = n2;
				n2 = res;
			}

			if (fibonacci) {
				System.out.println("O número digitado pertence a sequência de Fibonacci.");
			} else {
				System.out.println("O número digitado não pertence a sequência de Fibonacci.");
			}

			scanner.close();
		}
	}
}
