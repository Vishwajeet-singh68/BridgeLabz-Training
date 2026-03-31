package Generics.mealplangenerator;

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) {
        this.plan = plan;
    }
    public void showMeal() {
        plan.displayPlan();
    }
    public static <T extends MealPlan> void generateMealPlan(T plan) {
        System.out.print("Generated: ");
        plan.displayPlan();
    }
}