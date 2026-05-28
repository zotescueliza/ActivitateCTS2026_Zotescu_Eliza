package ro.ase.cts.testare.dubluri;

import ro.ase.cts.clase.IPersoana;

public class StubPersoana implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 70;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
