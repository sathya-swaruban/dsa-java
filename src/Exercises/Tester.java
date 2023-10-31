package Exercises;

class Food {
    public String foodName;
    public String cuisine;
    public String foodType;
    public int quantityAvailable;
    public double unitPrice;
}

public class Tester {
    public static void main(String[] args) {
        Food food = new Food();
        food.foodName = "Pizza";
        food.cuisine = "Italian";
        food.foodType = "Bread";
        food.quantityAvailable = 47;
        food.unitPrice = 404.5;
        System.out.printf("Food Name: %s%nCuisine: %s%nFood Type: %s%nQuantity: %s%nUnit Price: %s",
                food.foodName,
                food.cuisine,
                food.foodType,
                food.quantityAvailable,
                food.unitPrice);
    }
}