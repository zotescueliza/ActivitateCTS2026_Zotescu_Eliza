package ro.ase.cts.animals;

public class Zebra extends Animal{

    private int stripesNumber;

    public Zebra(String nume, int age, Foodtype food, int stripes) {
        super(nume, age, food);
        this.stripesNumber = stripes;
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeeper: "+zooKeeperName+" fed zebra " + super.nume + " with " + super.food + "." );
    }
}
