package Generics.mealplangenerator;

public class Main {
    public static void main(String[] args) {

        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();

        Meal.generateMealPlan(veg);
        Meal.generateMealPlan(vegan);
        Meal.generateMealPlan(keto);

        Meal<VegetarianMeal> meal = new Meal<>(veg);
        meal.showMeal();
    }
}

