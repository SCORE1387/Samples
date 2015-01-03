package tk.sekol.samples.patterns.decorator;

public class VisualDecorator implements VisualComponent {
    protected VisualComponent specialComponent;

    public VisualDecorator(VisualComponent specialComponent) {

        this.specialComponent = specialComponent;
    }

    @Override
    public String draw() {
        return specialComponent.draw();
    }
}
