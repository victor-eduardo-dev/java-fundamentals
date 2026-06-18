package control_structures;

import java.util.Scanner;

public class StudentAverageCalculator {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 30;

    public static void main(String[] args) {
        // Cabeçalho com o título do desafio.
        separator("=", SEP_COUNT);
        System.out.println("      Average Calculator");
        separator("=", SEP_COUNT);
        // Entrada de dados pelo usuário.
        double gradeOne = getUserGrade("Digite a 1ª nota: ");
        double gradeTwo = getUserGrade("Digite a 2ª nota: ");
        double gradeThree = getUserGrade("Digite a 3ª nota: ");
        // Calculo da média
        double average = (gradeOne + gradeTwo + gradeThree) / 3;
        // Exibição do resultado.
        separator("-", SEP_COUNT);
        showResult(average);
        separator("-", SEP_COUNT);
        // Fechamento do INPUT/Scanner.
        INPUT.close();
    }

    // Pegando as notas a partir do input do usuário.
    public static double getUserGrade(String msg) {
        System.out.print(msg);
        return INPUT.nextDouble();
    }

    // Decisão de qual classificação será mostrada.
    public static void showResult(double average) {
        if (average <= 10 && average >= 7.0) {
            System.out.printf("Média do aluno(a): %.1f%nStatus: APROVADO(A)!%n", average);
        } else if (average < 7.0 && average >= 5.0) {
            System.out.printf("Média do aluno(a): %.1f%nStatus: EM RECUPERAÇÃO!%n", average);
        } else if (average < 5.0 && average >= 0) {
            System.out.printf("Média do aluno(a): %.1f%nStatus: REPROVADO(A)!%n", average);
        } else {
            System.out.printf(" Digite apenas números entre:%n           0 e 10!%n");
        }
    }

    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
}
