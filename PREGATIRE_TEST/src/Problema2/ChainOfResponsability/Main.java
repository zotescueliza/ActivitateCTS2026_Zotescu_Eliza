package Problema2.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Document documentValid = new Document("Contract vanzare", "Tribunal Bucuresti", "Continut complet al documentului", true, true, true);
        Document documentFaraSemnatura = new Document("Cerere apel", "Avocat Ionescu", "Continut cerere apel", false, true, true);
        Document documentFaraAnexa = new Document("Dosar executare", "Judecatoria Sector 1", "Continut dosar executare", true, true,false);

        AbstractValidatorDocument validatorSemnatura = new ValidatorSemnatura();
        AbstractValidatorDocument validatorCompletitudine = new ValidatorCompletitudine();
        AbstractValidatorDocument validatorFormat = new ValidatorFormat();
        AbstractValidatorDocument validatorAnexa = new ValidatorAnex();

        validatorSemnatura.seteazaUrmator(validatorCompletitudine);
        validatorCompletitudine.seteazaUrmator(validatorFormat);
        validatorFormat.seteazaUrmator(validatorAnexa);

        System.out.println("=== Validare document valid ===");
        boolean rezultatValidare = validatorSemnatura.valideaza(documentValid);
        System.out.println("Rezultat validare: " + rezultatValidare);

        System.out.println("===============================");

        System.out.println("=== Validare document invalid fara semnatura ===");
        rezultatValidare = validatorSemnatura.valideaza(documentFaraSemnatura);
        System.out.println("Rezultat validare: " + rezultatValidare);

        System.out.println("===============================");

        System.out.println("=== Validare document invalid fara anexa ===");
        rezultatValidare = validatorSemnatura.valideaza(documentFaraAnexa);
        System.out.println("Rezultat validare: " + rezultatValidare);

        System.out.println("===============================");

        System.out.println("=== Validare cu ordinea validatorilor schimbata ===");

        AbstractValidatorDocument validatorFormatNou = new ValidatorFormat();
        AbstractValidatorDocument validatorAnexaNou = new ValidatorAnex();
        AbstractValidatorDocument validatorSemnaturaNou = new ValidatorSemnatura();
        AbstractValidatorDocument validatorCompletitudineNou = new ValidatorCompletitudine();

        validatorFormatNou.seteazaUrmator(validatorAnexaNou);
        validatorAnexaNou.seteazaUrmator(validatorSemnaturaNou);
        validatorSemnaturaNou.seteazaUrmator(validatorCompletitudineNou);

        rezultatValidare = validatorFormatNou.valideaza(documentValid);
        System.out.println("Rezultat validare dupa schimbarea ordinii: " + rezultatValidare);
    }
}
