package Problema2.ChainOfResponsability;

public class ValidatorSemnatura extends AbstractValidatorDocument{
    @Override
    public boolean valideaza(Document document) {
        if (document.isSemnat()) {
            System.out.println("Documentul " + document.getTitlu() + " are semnatura valida.");
            if (urmator != null) {
                return urmator.valideaza(document);
            } else {
                return true;
            }
        } else {
            System.out.println("Validarea s-a oprit. Documentul " + document.getTitlu() + " nu este semnat.");
            return false;
        }
    }
}
