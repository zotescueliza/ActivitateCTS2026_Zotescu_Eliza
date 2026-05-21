package RESTAURANT_probleme.B7_Decorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstracta notaSimpla = new NotaDePlata(5, 180.5);

        System.out.println("=== Printare nota simpla ===");
        notaSimpla.printeazaNota();
        System.out.println("===============================");

        NotaDePlataAbstracta notaCuFelicitare = new DecoratorFelicitare(notaSimpla);


        System.out.println("=== Printare nota cu felicitare ===");
        notaCuFelicitare.printeazaNota();
    }
}
