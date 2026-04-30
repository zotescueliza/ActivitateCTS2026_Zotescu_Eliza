package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.decorator.NotaDePlataPrintatNouAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(160.23f,"12 ianuarie 2026");
        notaDePlata.printeaza();

        int a=2;
        NotaDePlataDecorator notaDePlataDecorator;

        if(a == 1){
            notaDePlataDecorator = new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
