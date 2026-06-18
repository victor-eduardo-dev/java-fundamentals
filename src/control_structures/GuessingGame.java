package control_structures;

import java.util.Scanner;

public class GuessingGame {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 36;

    public static void main(String[] args) {
        // Exibi o título e as informações.
        separator("=", SEP_COUNT);
        System.out.println("           Guessing Game");
        System.out.println(" Adivinhe o número secreto [0 à 20]");
        separator("=", SEP_COUNT);
        // Número secreto estático - Possível melhoria usar Random().
        int secretNumber = 9;
        // Inicia o paltite do usuário com -1, para não precisar usar (Do While).
        int usersGuess = -1;
        int attempts = 0;
        // Loop While.
        while (secretNumber != usersGuess) {
            usersGuess = getUserNumber("Digite seu palpite: ");
            attempts++;

            if (usersGuess > secretNumber) {
                separator("-", SEP_COUNT);
                System.out.println("O número secreto é menor!");
                separator("-", SEP_COUNT);
            } else if (usersGuess < secretNumber) {
                separator("-", SEP_COUNT);
                System.out.println("O número secreto é maior!");
                separator("-", SEP_COUNT);
            }
        }
        // Exibe o resultado na tela.
        separator("-", SEP_COUNT);
        System.out.printf("Parabéns você acertou!!!%nO número secreto é: %d%n", secretNumber);
        System.out.printf("Tentativas: %d%n", attempts);
        separator("-", SEP_COUNT);

        INPUT.close();
    }
    // Pega o palpite do usuário.
    public static int getUserNumber(String msg) {
        System.out.print(msg);
        return INPUT.nextInt();
    }
    // Cria separações para melhorar a visualização.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }
}
