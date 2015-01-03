package tk.sekol.samples.patterns.factorymethod.nonpattern;

public class WatermarkWriter {

    public Document createDocument(String docType) {
        if (docType.equals("Picture"))
            return new PictureDocument();
        else if (docType.equals("Text"))
            return new TextDocument();
        return null;
    }
}
