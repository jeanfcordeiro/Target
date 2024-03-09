package exercicios_target;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String inverter = inverterString(palavra);
        System.out.println("Palavra digitada: " + palavra);
        System.out.println("Palavra invertida: " + inverter);
    }

    public static String inverterString(String palavra) {
        StringBuilder inverter = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverter.append(palavra.charAt(i));
        }
        return inverter.toString();
    }
}
