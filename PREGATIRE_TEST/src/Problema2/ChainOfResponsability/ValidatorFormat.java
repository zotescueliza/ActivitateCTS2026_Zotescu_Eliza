package Problema2.ChainOfResponsability;

public class ValidatorFormat extends AbstractValidatorDocument{
    @Override
    public boolean valideaza(Document document) {
        if (document.isFormatValid()) {
            System.out.println("Documentul " + document.getTitlu() + " are format valid.");
            if (urmator != null) {
                return urmator.valideaza(document);
            } else {
                return true;
            }
        } else {
            System.out.println("Validarea s-a oprit. Documentul " + document.getTitlu() + " nu are format valid.");
            return false;
        }
    }
}
