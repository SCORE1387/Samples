package tk.sekol.samples.patterns.decorator;

public class TextComponent implements VisualComponent {

    @Override
    public String draw() {
        return "Simple Text";
    }

}
