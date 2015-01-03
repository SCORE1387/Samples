package tk.sekol.samples.patterns.templatemethod;

public abstract class AbstractDrink {

    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addIngredients();
    }

    protected abstract void brew();

    protected abstract void addIngredients();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
