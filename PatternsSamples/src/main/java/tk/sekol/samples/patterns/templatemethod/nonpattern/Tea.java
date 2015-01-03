package tk.sekol.samples.patterns.templatemethod.nonpattern;

public class Tea {

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
        System.out.println("Steeping the tea");
    }

    private void addIngredients() {
        System.out.println("Adding lemon");
    }

}
