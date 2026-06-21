package control_structures;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 30;

    public static void main(String[] args) {
        // Exibe o título com separado antes e depois.
        separator("=", SEP_COUNT);
        System.out.println("      É um número PRIMO?");
        separator("=", SEP_COUNT);

        int userNumber = getUserNumber("Digite um número: ");
        separator("-", SEP_COUNT);
        boolean isPrime = isPrimeNumber(userNumber);

        // Chama a função showResult().
        showResult(isPrime);
        INPUT.close();
    }
    // Pega a entrada do usuário.
    public static int getUserNumber(String msg) {
        System.out.print(msg);
        return INPUT.nextInt();
    }
    // Cria separações para melhorar a visualização.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
    // Verifica se o número é primo.
    public static boolean isPrimeNumber(int userNumber) {
        if (userNumber <= 1) {
            return false;
        }
        // Verifica divisores apenas até a raiz quadrada do número,
        // porque após √n os divisores apenas se repetem invertidos.
        // Se nenhum divisor for encontrado até √n, o número é primo.
        for (int i = 2; i <= Math.sqrt(userNumber); i++) {
            if (userNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Exibe o resultado na tela.
    public static void showResult(boolean isPrime) {
        String finalMessage = isPrime ? "É PRIMO." : "NÃO É PRIMO.";
        System.out.println(finalMessage);
        separator("-", SEP_COUNT);
    }
}
