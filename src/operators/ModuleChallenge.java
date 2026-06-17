package operators;

import java.util.Scanner;

public class ModuleChallenge {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_VALUE = 35;

    public static void main(String[] args) {
        separator("-", SEP_VALUE);
        System.out.println("   Calculator - Module Challenge");
        separator("-", SEP_VALUE);
        double number1 = Double.parseDouble(getEntry("Digite o 1º número: "));
        String operator = getEntry("Insira um operador [+ - * / %]: ");
        double number2 = Double.parseDouble(getEntry("Digite o 2º número: "));

        double result = operator.equals("+") ? number1 + number2 :
                operator.equals("-") ? number1 - number2 :
                operator.equals("*") ? number1 * number2 :
                operator.equals("/") ? number1 / number2 :
                operator.equals("%") ? number1 % number2 : 0.0;

        separator("-", SEP_VALUE);
        System.out.printf("A operação: %.1f %s %.1f = %.1f%n", number1, operator, number2, result);
        separator("-", SEP_VALUE);

        INPUT.close();
    }

    // Separador para melhorar a visualização da saída de dados.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }

    public static String getEntry(String msg) {
        System.out.print(msg);
        String userEntry = INPUT.nextLine();
        return userEntry.replace(",", ".");
    }
}
