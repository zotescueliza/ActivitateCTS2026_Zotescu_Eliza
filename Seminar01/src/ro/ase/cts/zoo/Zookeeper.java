package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

public class Zookeeper {

    private String nume;

    public Zookeeper(String nume) {
        this.nume = nume;
    }

    public void feedAnimal(Animal animal) {
        animal.eat(this.nume);
    }
}
