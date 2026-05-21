package RESTAURANT_probleme.B7_Decorator;

public abstract class DecoratorNotaPlata implements NotaDePlataAbstracta{

    //FOARTE IMPORTANT
    protected NotaDePlataAbstracta notaPlata ;

    public DecoratorNotaPlata(NotaDePlataAbstracta notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeazaNota() {
        notaPlata.printeazaNota();
    }

    public abstract void printeazaFelicitare();
}
