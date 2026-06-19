package control_structures;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameDoWhile {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 36;

    public static final Random random = new Random();

    public static void main(String[] args) {
        separator("=", SEP_COUNT);
        System.out.println("        Guessing Game 2.0");
        System.out.println(" Adivinhe o número secreto [0 à 20]");
        separator("=", SEP_COUNT);

        // Cria um número secreto pseudo-randomicamente.
        int secretNumber = random.nextInt(21);
        // Inicia o contador de tentativas.
        int attempts = 0;
        // Cria a variável de palpite do usuário.
        int usersGuess;
        // Loop Do While.
        do {
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
        } while (secretNumber != usersGuess);
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
