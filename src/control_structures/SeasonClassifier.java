package control_structures;

import java.util.Scanner;

public class SeasonClassifier {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 36;

    public static void main(String[] args) {
        // Título.
        separator("=", SEP_COUNT);
        System.out.println("  Classificador de Estações do Ano");
        separator("=", SEP_COUNT);
        // Chama a função que recebe a entrada do usuário.
        String userEntry = getUserEntry("Insira o mês do ano: ").toLowerCase().strip();
        // O switch apenas mapeia a entrada para o resultado.
        String season = switch (userEntry) {
            case "dezembro", "janeiro", "fevereiro" -> "Verão";
            case "março", "abril", "maio", "marco"    -> "Outono";
            case "junho", "julho", "agosto"          -> "Inverno";
            case "setembro", "outubro", "novembro"   -> "Primavera";
            default                                  -> "Inválido";
        };
        // Delega a responsabilidade de decidir o que exibir para a função.
        showSeason(season);

        separator("-", SEP_COUNT);
        INPUT.close();
    }

    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
    // Pega a entrada do usuário.
    public static String getUserEntry(String msg) {
        System.out.print(msg);
        return INPUT.nextLine();
    }
    // Exibe o resultado na tela.
    public static void showSeason(String season) {
        if (season.equals("Inválido")) {
            separator("-", SEP_COUNT);
            System.out.println("Digite um mês válido!");
        } else {
            separator("-", SEP_COUNT);
            System.out.printf("Estação do ano: %s%n", season);
        }
    }
}
