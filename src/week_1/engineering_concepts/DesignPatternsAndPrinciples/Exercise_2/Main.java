package week_1.engineering_concepts.DesignPatternsAndPrinciples.Exercise_2;
import java.util.Scanner;
public class Main {
    static void main() {
        DocumentFactory documentFactory;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of document: (word, pdf, excel)");
        String docType = scanner.next();
        if(docType.equalsIgnoreCase("pdf")){
            documentFactory = new PdfDocumnetFactory();
        } else if(docType.equalsIgnoreCase("word")){
            documentFactory = new WordDocumentFactory();
        } else if(docType.equalsIgnoreCase("excel")){
            documentFactory = new ExcelDocumentFactory();
        } else {
            throw new RuntimeException("Invalid document type");
        }
        documentFactory.createDocument().document();
    }
}

/*
the code works in a sepefic manner,
we start from main, the software asks for the type of document you want to make from the user.
we have already defined an interface for the document object.
we have three types of docs, excel, pdf and word. each have their own class who implement the document interface, which has the document fucntion to make documents
then we have the document factory abstract class, which serves as the middleware that creates the actual documents dynamically, it serves as the factory,
the documentFactory is the factory class and document is the product class
then again we have individual classes for each type of doc, factories of each doc extends the same factory class.

the Document interface helps us to de couple the required specifics of differetn documents, and create a template.
teh factory class loosley couples the creator logic so that we can change the methods, introduce new, remove old withoud any much issue.
 */