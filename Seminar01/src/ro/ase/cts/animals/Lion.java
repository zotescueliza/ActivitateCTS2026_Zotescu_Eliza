package ro.ase.cts.animals;

public class Lion extends Animal{

    private int weight;

    public Lion(String nume, int age, Foodtype food, int weight) {
        super(nume, age, food);
        this.weight = weight;

    }
//super pt ca e in alta clasa daca eram atribut declarat in clasa asta era cu this
    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeeper:"+zooKeeperName+" fed lion " + super.nume + " with " + super.food + "." );
    }
}
