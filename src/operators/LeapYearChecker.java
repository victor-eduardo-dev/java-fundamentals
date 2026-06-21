package operators;

import java.util.Scanner;

public class LeapYearChecker {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 21;

    public static void main(String[] args) {

        separator("=", SEP_COUNT);
        System.out.println("   É ano Bissexto?");
        separator("=", SEP_COUNT);

        int userEntry = getUserEntry("Digite um ano: ");
        boolean leapYear = isLeapYear(userEntry);
        showResult(leapYear, userEntry);
        INPUT.close();
    }
    // Pega a entrada do usuário.
    public static int getUserEntry(String msg) {
        System.out.print(msg);
        return INPUT.nextInt();
    }
    // Cria separações para melhorar a visualização.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
    // Faz a checagem se o ano é bissexto.
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0;
    }
    // Exibe o resultado na tela.
    public static void showResult(boolean isLeapYear, int userYear) {
        separator("_", SEP_COUNT);
        System.out.printf("Ano digitado: %d%n", userYear);
        System.out.println(isLeapYear ? "É Bissexto: Sim" : "É Bissexto: Não");
        separator("_", SEP_COUNT);
    }
}
