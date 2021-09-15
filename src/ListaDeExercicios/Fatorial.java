package ListaDeExercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite um número cujo fatorial deseja calcular: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double valor = n;
        double valorFatorial = 1;
        while (n > 0) {
            valorFatorial = valorFatorial*n;
            n--;
        }
        System.out.println("O fatorial é " + valor +".");
    }
}