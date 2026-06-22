package util;

public class ConsoleFormatter {

    public static void showInstructions(String text, int width) {
        final int textSize = text.length();
        // Garante que a largura mínima tenha pelo menos 4 espaços a mais que o texto.
        if (width < textSize + 4) {
            width = textSize + 4;
        }

        int totalPadding = width - textSize;
        // Se o padding for ímpar, adicionamos +1 para torná-lo par e manter a simetria perfeita.
        if (totalPadding % 2 != 0) {
            totalPadding++;
            width++;
        }

        int paddingEachSide = totalPadding / 2;
        // Impressão no console.
        System.out.println("=".repeat(width));
        System.out.println(" ".repeat(paddingEachSide) + text + " ".repeat(paddingEachSide));
        System.out.println("=".repeat(width));
    }
}
