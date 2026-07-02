package Deepskilling.week_1.engineering_concepts.DesignPatternsAndPrinciples.Exercise_2;

public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
