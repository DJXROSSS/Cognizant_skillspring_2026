package week_1.engineering_concepts.DesignPatternsAndPrinciples.Exercise_2;

public class PdfDocumnetFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
