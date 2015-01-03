package tk.sekol.samples.patterns.factorymethod;

public class PictureWatermarkWriter implements WatermarkWriter {

    @Override
    public Document createDocument() {
        return new PictureDocument();
    }

}
