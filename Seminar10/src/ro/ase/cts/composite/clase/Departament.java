package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> subStructuri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        subStructuri.remove(structura);
    }
    public Structura getStructura(int pozitie){
        return subStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("NUME SECTIE " + this.numeDepartament);
        for( Structura structura : subStructuri){
            structura.afiseazaDetaliiStructura();
        }
    }
}
