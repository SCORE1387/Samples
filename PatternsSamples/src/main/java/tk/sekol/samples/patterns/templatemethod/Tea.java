package tk.sekol.samples.patterns.templatemethod;

public class Tea extends AbstractDrink {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding lemon");
    }

}
