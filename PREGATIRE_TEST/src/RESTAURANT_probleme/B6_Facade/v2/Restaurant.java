package RESTAURANT_probleme.B6_Facade.v2;

public class Restaurant {
    private Masa[] mese;

    public Restaurant() {
        this.mese = new Masa[4];

        this.mese[0] = new Masa(1, false, true, true);
        this.mese[1] = new Masa(2, true, false, true);
        this.mese[2] = new Masa(3, true, true, false);
        this.mese[3] = new Masa(4, true, true, true);
    }

    public Masa getMasaLibera() {
        for (int i = 0; i < mese.length; i++) {
            if (mese[i].isLibera()) {
                return mese[i];
            }
        }

        return null;
    }
}
