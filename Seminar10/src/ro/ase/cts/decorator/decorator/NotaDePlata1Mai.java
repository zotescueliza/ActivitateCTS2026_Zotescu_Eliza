package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("LA MULTI ANI DE 1 MAI!");
    }
}
