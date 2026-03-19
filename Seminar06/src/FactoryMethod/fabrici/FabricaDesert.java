package FactoryMethod.fabrici;

import FactoryMethod.clase.Clatita;
import FactoryMethod.clase.FelMancare;
import FactoryMethod.clase.Papanasi;
import FactoryMethod.enums.TipDesert;
import FactoryMethod.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        if(tipMancare == TipDesert.CLATITE){
            return new Clatita(pret,gramaj,calorii);
        } else if (tipMancare == TipDesert.PAPANASI) {
            return new Papanasi(pret,gramaj,calorii);
        }
        return null;
    }
}
