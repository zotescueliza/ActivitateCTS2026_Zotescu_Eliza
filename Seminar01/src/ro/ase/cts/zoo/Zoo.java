package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    //atributele clasei
    //vizibilotate la nivel de pachet
    private String nume;
    private Zookeeper zookeeper;
    private List<Animal> animals;

    public Zoo(String nume, Zookeeper zookeeper) {
        this.nume = nume;
        this.zookeeper = zookeeper;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal animal: animals){
            this.zookeeper.feedAnimal(animal);

        }
    }
}
