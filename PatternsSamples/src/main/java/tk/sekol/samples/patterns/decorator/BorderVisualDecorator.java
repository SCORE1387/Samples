package tk.sekol.samples.patterns.decorator;

public class BorderVisualDecorator extends VisualDecorator {

    public BorderVisualDecorator(VisualComponent specialComponent) {
        super(specialComponent);
    }

    public String draw() {
        return specialComponent.draw() + setBorder();
    }

    private String setBorder() {
        return " with border";
    }
}
