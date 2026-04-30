package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNouAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println(" LA MULTI ANI DE ANUL NOU! ");


    }
}
