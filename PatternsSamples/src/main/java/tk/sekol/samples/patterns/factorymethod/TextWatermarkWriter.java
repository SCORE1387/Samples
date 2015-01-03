package tk.sekol.samples.patterns.factorymethod;

public class TextWatermarkWriter implements WatermarkWriter {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }

}
