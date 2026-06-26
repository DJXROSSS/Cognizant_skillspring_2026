package week_1.engineering_concepts.Exercise_2;

public class PdfDocumnetFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
