package Problema1.proxy;

public class PlacaLemn {
    private String tipLemn;
    private float suprafataPrelucrata;
    private float grosime;
    private float costPeMetruPatrat;

    public PlacaLemn(String tipLemn, float suprafataPrelucrata, float grosime, float costPeMetruPatrat) {
        this.tipLemn = tipLemn;
        this.suprafataPrelucrata = suprafataPrelucrata;
        this.grosime = grosime;
        this.costPeMetruPatrat = costPeMetruPatrat;
    }

    public String getTipLemn() {
        return tipLemn;
    }

    public float getSuprafataPrelucrata() {
        return suprafataPrelucrata;
    }

    public float getGrosime() {
        return grosime;
    }

    public float getCostPeMetruPatrat() {
        return costPeMetruPatrat;
    }
}
