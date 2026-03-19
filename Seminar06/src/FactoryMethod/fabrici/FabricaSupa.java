package FactoryMethod.fabrici;

import FactoryMethod.clase.FelMancare;
import FactoryMethod.clase.SupaCiuperci;
import FactoryMethod.clase.SupaLegume;
import FactoryMethod.enums.TipMancare;
import FactoryMethod.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare == TipSupa.LEGUME){
            return new SupaLegume(pret,gramaj);
        }
        else if(tipMancare == TipSupa.CIUPERCI){
            return new SupaCiuperci(pret,gramaj);
        }
        return  null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, float calorii) {
        return getFelMancare(tipMancare,pret,gramaj);
    }
}
