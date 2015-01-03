package tk.sekol.samples.patterns.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        VisualComponent bvc = new BorderVisualDecorator(new TextComponent());
        VisualComponent cbvc = new ColorVisualDecorator(bvc);
        System.out.println(bvc.draw());
        System.out.println(cbvc.draw());
    }
}
