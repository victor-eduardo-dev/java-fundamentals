package src.variables_and_constants;

import java.util.Scanner;

public class ConversionChallenge {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_VALUE = 40;

    public static void main(String[] args) {

        System.out.println("=".repeat(SEP_VALUE));
        System.out.println("--------- Conversion Challenge ---------");
        System.out.println("=".repeat(SEP_VALUE));
        // Dados brutos inseridos pelo usuário.
        String firstEntry = getUserEntry("Digite o 1º salário: ");
        double firstSalary = Double.parseDouble(firstEntry);
        String secondEntry = getUserEntry("Digite o 2º salário: ");
        double secondSalary = Double.parseDouble(secondEntry);
        String thirdEntry = getUserEntry("Digite o 3º salário: ");
        double thirdSalary = Double.parseDouble(thirdEntry);
        // Calculo da média salarial.
        double averageSalary = (firstSalary + secondSalary + thirdSalary) / 3;

        // Saída dos dados.
        System.out.printf("Média salarial do funcionário: R$ %.2f%n", averageSalary);
        System.out.println("=".repeat(SEP_VALUE));
        INPUT.close();
    }

    public static String getUserEntry(String msg) {
        System.out.print(msg);
        String salary = INPUT.nextLine();
        System.out.println("-".repeat(SEP_VALUE));
        if (salary.contains(",")) {
            salary = salary.replace(",", ".");
        }
        return salary;
    }
}
