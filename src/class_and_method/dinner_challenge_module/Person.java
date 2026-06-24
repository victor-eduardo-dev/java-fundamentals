package class_and_method.dinner_challenge_module;

public class Person {

    private final String name;
    private double weight;

    Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eatFood(Food food) {
        System.out.printf("comeu %s!%n", food.getFoodName());
        this.weight += food.getFoodWeight();
    }

    public double getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
 }
