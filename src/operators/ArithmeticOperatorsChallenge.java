package operators;

public class ArithmeticOperatorsChallenge {

    public static final int SEP_VALUE = 36;

    public static void main(String[] args) {

        System.out.println("=".repeat(SEP_VALUE));
        System.out.println("-------- Operator Challenge --------");
        System.out.println("=".repeat(SEP_VALUE));
        double firstPart = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double secondPart = Math.pow((1 - 5) * (2 - 7) / 2.0, 2);
        double numerator = Math.pow(firstPart - secondPart, 3);
        double denominator = Math.pow(10, 3);
        double finalResult = numerator / denominator;

        System.out.printf("O resultado da equação é: %.1f%n", finalResult);
        System.out.println("-".repeat(SEP_VALUE));
    }
}
