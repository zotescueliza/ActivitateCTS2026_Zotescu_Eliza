package ro.ase.cts.animals;

public class Maimuta extends Animal{
    public Maimuta(String nume, int age, Foodtype food) {
        super(nume, age, food);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeeper: "+zooKeeperName+" hraneste maimuta " + super.nume + " cu " + super.food + "." );

    }
}
