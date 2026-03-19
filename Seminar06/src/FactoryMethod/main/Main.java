package FactoryMethod.main;

import FactoryMethod.clase.FelMancare;
import FactoryMethod.enums.TipDesert;
import FactoryMethod.enums.TipSupa;
import FactoryMethod.fabrici.FabricaDesert;
import FactoryMethod.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI,15.3f,200f,24f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME,12f,300f,20f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE,12f,200f,300f);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI,14f,200,300f);

        supaLegume.afisareDescriere();
        supaCiuperci.afisareDescriere();

        clatite.afisareDescriere();
        papanasi.afisareDescriere();

    }
}
