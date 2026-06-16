package operators;

import java.util.Scanner;

public class LogicOperatorsChallenge {
    // Criação do Scanner.
    public static final Scanner INPUT = new Scanner(System.in);
    // Quantidade de separadores.
    public static final int SEP_VALUE = 40;

    public static void main(String[] args) {
        // Cabeçalho com Nome do desafio e Instruções.
        separator("-", SEP_VALUE);
        System.out.println("------ Logic Operators Challenge -------");
        separator("-", SEP_VALUE);
        System.out.println(" Responda: [S] para Sim - [N] para Não");
        separator("-", SEP_VALUE);
        // Entrada de dados pelo usuário.
        boolean tuesdayJob = isJobConfirmed("Trabalho de Terça está confirmado: ");
        boolean thursdayJob = isJobConfirmed("Trabalho de Quinta está confirmado: ");
        boolean hasIceCream = tuesdayJob || thursdayJob;
        boolean buy50InchTv = tuesdayJob && thursdayJob;
        boolean buy32InchTv = tuesdayJob ^ thursdayJob;
        boolean willStayHome = !hasIceCream;
        // Saída dos dados.
        separator("-", SEP_VALUE);
        System.out.printf("Comprarão TV de 50\": %s%n", buy50InchTv ? "Sim" : "Não");
        System.out.printf("Comprarão TV de 32\": %s%n", buy32InchTv ? "Sim" : "Não");
        System.out.printf("Tomarão sorvete: %s%n", hasIceCream ? "Sim" : "Não");
        System.out.printf("Ficarão em casa: %s%n", willStayHome ? "Sim" : "Não");
        separator("-", SEP_VALUE);

        INPUT.close();
    }

    // Recebe entrada do usuário e retorna em boolean.
    public static boolean isJobConfirmed(String msg) {
        System.out.print(msg);
        String entry = INPUT.nextLine();

        return entry.equalsIgnoreCase("s");
    }

    // Separador para melhorar a visualização da saída de dados.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
}
