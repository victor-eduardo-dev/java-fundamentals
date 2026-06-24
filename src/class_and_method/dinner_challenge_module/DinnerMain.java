package class_and_method.dinner_challenge_module;

import util.ConsoleFormatter;
import util.Divider;

public class DinnerMain {

    private static final int SEP_COUNT = 35;

    public static void main(String[] args) {

        ConsoleFormatter.showInstructions("Desafio do Módulo: Jantar", SEP_COUNT);

        Person firstPerson = new Person("Victor", 90);
        Person secondPerson = new Person("Murilo", 65);

        Food foodOne = new Food("Lasanha", 1.5);
        Food foodTwo = new Food("Sorvete", 0.8);
        Food foodThree = new Food("Salada de Fruta", 0.3);

        System.out.printf("%s, peso antes do jantar: %.1f%n", firstPerson.getName(), firstPerson.getWeight());
        firstPerson.eatFood(foodOne);
        firstPerson.eatFood(foodTwo);
        firstPerson.eatFood(foodThree);
        System.out.printf("Peso após o jantar: %.1f%n", firstPerson.getWeight());
        Divider.separator("=", SEP_COUNT);

        System.out.printf("%s, peso antes do jantar: %.1f%n", secondPerson.getName(), secondPerson.getWeight());
        secondPerson.eatFood(foodOne);
        secondPerson.eatFood(foodThree);
        System.out.printf("Peso após o jantar: %.1f%n", secondPerson.getWeight());
        Divider.separator("=", SEP_COUNT);
    }
}
