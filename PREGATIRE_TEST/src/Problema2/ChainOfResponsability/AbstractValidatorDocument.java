package Problema2.ChainOfResponsability;

public abstract class AbstractValidatorDocument {
    protected AbstractValidatorDocument urmator;

    public void seteazaUrmator(AbstractValidatorDocument urmator) {
        this.urmator = urmator;
    }

    public abstract boolean valideaza(Document document);
}
