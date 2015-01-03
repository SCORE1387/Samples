package tk.sekol.samples.patterns.templatemethod.nonpattern;

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

    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    protected void addIngredients() {
        System.out.println("Adding sugar and milk");
    }
}
