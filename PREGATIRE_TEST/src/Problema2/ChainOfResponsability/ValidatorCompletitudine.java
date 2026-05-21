package Problema2.ChainOfResponsability;

public class ValidatorCompletitudine extends AbstractValidatorDocument{
    @Override
    public boolean valideaza(Document document) {
        if (document.getTitlu() != null && document.getAutor() != null && document.getContinut() != null && document.getTitlu().length() > 0 && document.getAutor().length() > 0 && document.getContinut().length() > 0) {
            System.out.println("Documentul " + document.getTitlu() + " este complet.");
            if (urmator != null) {
                return urmator.valideaza(document);
            } else {
                return true;
            }
        } else {
            System.out.println("Validarea s-a oprit. Documentul este incomplet.");
            return false;
        }
    }
}
