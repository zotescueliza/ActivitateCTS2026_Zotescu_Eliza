package Problema2.ChainOfResponsability;

public class ValidatorAnex extends AbstractValidatorDocument {
    @Override
    public boolean valideaza(Document document) {
        if (document.isAreAnexa()) {
            System.out.println("Documentul " + document.getTitlu() + " are anexa atasata.");
            if (urmator != null) {
                return urmator.valideaza(document);
            } else {
                return true;
            }
        } else {
            System.out.println("Validarea s-a oprit. Documentul " + document.getTitlu() + " nu are anexa atasata.");
            return false;
        }
    }
}
