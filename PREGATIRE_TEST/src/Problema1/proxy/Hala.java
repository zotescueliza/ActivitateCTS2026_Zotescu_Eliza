package Problema1.proxy;

public class Hala {
    private float temperaturaInterna;
    private float temperaturaExterna;
    private float consumInstantaneuEnergie;
    private float consumMaximEnergie;

    public Hala(float temperaturaInterna, float temperaturaExterna, float consumInstantaneuEnergie, float consumMaximEnergie) {
        this.temperaturaInterna = temperaturaInterna;
        this.temperaturaExterna = temperaturaExterna;
        this.consumInstantaneuEnergie = consumInstantaneuEnergie;
        this.consumMaximEnergie = consumMaximEnergie;
    }

    public float getTemperaturaInterna() {
        return temperaturaInterna;
    }

    public float getTemperaturaExterna() {
        return temperaturaExterna;
    }

    public float getConsumInstantaneuEnergie() {
        return consumInstantaneuEnergie;
    }

    public float getConsumMaximEnergie() {
        return consumMaximEnergie;
    }
}
