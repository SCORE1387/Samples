package tk.sekol.samples.patterns.templatemethod;

public class Coffee {

    public void prepare() {
        boilWater();
        brew();
        pourInCup();
        addIngredients();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brew() {
        System.out.println("Dripping coffee through filter");
    }

    private void addIngredients() {
        System.out.println("Adding sugar and milk");
    }
}
