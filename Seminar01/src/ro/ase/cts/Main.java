package ro.ase.cts;

import ro.ase.cts.animals.*;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.Zookeeper;

public class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo("ZOO BUCURESTI",new Zookeeper("IONESCU MARIA"));
        Lion leu = new Lion("FANE",4, Foodtype.MEAT,100);
        Zebra zebra = new Zebra("ALBUS",12,Foodtype.GRASS,40);
        Maimuta maimuta = new Maimuta("MAIMUTA",12,Foodtype.BANANE);
        zoo.addAnimal(leu);
        zoo.addAnimal(zebra);
        zoo.addAnimal(maimuta);

        zoo.feedAllAnimals();


    }
}
