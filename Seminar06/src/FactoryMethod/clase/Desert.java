package FactoryMethod.clase;

public abstract class Desert implements FelMancare {
    protected float pretDesert;
    protected float gramajDesert;
    protected float caloriiDesert;

    public Desert(float pretDesert, float gramajDesert, float caloriiDesert) {
        this.pretDesert = pretDesert;
        this.gramajDesert = gramajDesert;
        this.caloriiDesert = caloriiDesert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pretDesert=").append(pretDesert);
        sb.append(", gramajDesert=").append(gramajDesert);
        sb.append(", caloriiDesert=").append(caloriiDesert);
        sb.append('}');
        return sb.toString();
    }
}
