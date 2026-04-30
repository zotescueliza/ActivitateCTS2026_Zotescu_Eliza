package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {

    private NotaDePlataAbstract notaDePlata;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    //noua functionalitate => anuntare => nu scriu functia doar o las asa cu ();

    public abstract void printeazaFelicitare();
}
