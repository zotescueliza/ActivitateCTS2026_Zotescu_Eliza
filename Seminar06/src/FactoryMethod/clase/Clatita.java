package FactoryMethod.clase;

public class Clatita extends Desert {
    public Clatita(float pretDesert, float gramajDesert, float caloriiDesert) {
        super(pretDesert, gramajDesert, (int) caloriiDesert);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Clatita are ").append(super.toString());
        System.out.println(builder);
    }
}
