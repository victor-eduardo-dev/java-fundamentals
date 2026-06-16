package variables_and_constants;

public class VariablesAndConstants {

    public static void main(String[] args) {
        // Criação e inicialização de variáveis e constantes.
        String name = "Victor Eduardo";
        int age = 35;
        // Possível constante(apenas para o exercício).
        final String COUNTRY= "Italy";
        final int SEP_VALUE = 41;
        String course = "Analysis and Systems Development";
        String university = "Universidade Positivo";
        String mainLanguage = "Java";
        String professionalGoal = "Back-End Developer";

        System.out.println("=".repeat(SEP_VALUE));
        System.out.println("----------- Developer Profile -----------");
        System.out.println("=".repeat(SEP_VALUE));
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Country: %s%n", COUNTRY);
        System.out.println("-".repeat(SEP_VALUE));
        System.out.printf("University: %s%n", university);
        System.out.printf("Course: %s%n", course);
        System.out.printf("Main Language: %s%n", mainLanguage);
        System.out.printf("Professional Goal: %s%n", professionalGoal);
        System.out.println("=".repeat(SEP_VALUE));
    }
}
