package class_and_method.dinner_challenge_module;

public class Food {

    private final String foodName;
    private final double foodWeight;

    Food(String foodName, double foodWeight) {
        this.foodName = foodName;
        this.foodWeight = foodWeight;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public double getFoodWeight() {
        return this.foodWeight;
    }
}
