package control_structures;

import java.util.Scanner;

public class IntervalAdderChallenge {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 41;

    public static void main(String[] args) {
        separator("=", SEP_COUNT);
        System.out.println("   Desafio: Somar números do intervalo");
        separator("=", SEP_COUNT);
        // Entrada de dados do usuário.
        int startNumber = getEntryUser("Digite o número inicial do intervalo: ");
        int endNumber = getEntryUser("Digite o número final do intervalo: ");

        int totalSum = 0;
        // Impede erro quando o usuário digita primeiro um número maior(exemplo: 15 e 5).
        int lowerBound = Math.min(startNumber, endNumber);
        int upperBound = Math.max(startNumber, endNumber);
        // Loop for clássico.
        for (int i = lowerBound; i <= upperBound; i++) {
            totalSum += i;
        }
        // Saída de dados.
        separator("-", SEP_COUNT);
        System.out.printf("Para o intervalo entre: %d e %d%n", startNumber, endNumber);
        System.out.printf("A soma total dos números é: %d%n", totalSum);
        separator("-", SEP_COUNT);

        INPUT.close();
    }
    // Pega os dados referêntes aos intervalos.
    public static int getEntryUser(String msg) {
        System.out.print(msg);
        return INPUT.nextInt();
    }
    // Cria separações para melhorar a visualização.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
}
