package ro.ase.cts.animals;

public abstract class Animal {

    protected String nume;
    protected int age;
    protected Foodtype food;

    public Animal(String nume, int age, Foodtype food) {
        this.nume = nume;
        this.age = age;
        this.food = food;
    }

    public abstract void eat(String zooKeeperName);
}
