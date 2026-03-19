package FactoryMethod.fabrici;

import FactoryMethod.clase.FelMancare;
import FactoryMethod.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret,float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare,float pret,float gramaj, float calorii);
}
