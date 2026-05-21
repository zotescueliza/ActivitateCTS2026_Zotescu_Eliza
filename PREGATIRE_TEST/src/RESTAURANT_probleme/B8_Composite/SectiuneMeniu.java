package RESTAURANT_probleme.B8_Composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements AbstrcatMeniu{

    private String denumire;

    /// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private List<AbstrcatMeniu> elementeMeniu;

    public SectiuneMeniu(String denumire) {
        this.denumire = denumire;
        this.elementeMeniu = new ArrayList<>();
    }

    public void adaugaElement(AbstrcatMeniu elementMeniu) {
        elementeMeniu.add(elementMeniu);
    }

    public void stergeElement(AbstrcatMeniu elementMeniu) {
        elementeMeniu.remove(elementMeniu);
    }
    @Override
    public void afiseazaMeniu() {
        System.out.println("Sectiune meniu: " + denumire);

        for(AbstrcatMeniu elmeniu : elementeMeniu){
            elmeniu.afiseazaMeniu();
        }
    }

}
