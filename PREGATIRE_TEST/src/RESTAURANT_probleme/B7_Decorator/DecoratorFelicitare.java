package RESTAURANT_probleme.B7_Decorator;

public class DecoratorFelicitare extends DecoratorNotaPlata{

    public DecoratorFelicitare(NotaDePlataAbstracta notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("PERSONALUL RESTAURANTULUI VA UREAZA LA MULTI ANI!");
    }

}
