package tk.sekol.samples.patterns.decorator;

public class ColorVisualDecorator extends VisualDecorator {

    public ColorVisualDecorator(VisualComponent specialComponent) {

        super(specialComponent);
    }

    public String draw() {
        return specialComponent.draw() + setColor();
    }

    private String setColor() {
        return " with color";
    }
}

