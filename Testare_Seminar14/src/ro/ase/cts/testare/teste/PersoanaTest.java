package ro.ase.cts.testare.teste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.IPersoana;
import ro.ase.cts.clase.Persoana;
import ro.ase.cts.testare.categorii.CategorieBicep;
import ro.ase.cts.testare.categorii.CategorieRight;

public class PersoanaTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(CategorieBicep.class)
    public void testErrorConditionerCheckCNP(){
        Persoana p = new Persoana("Gigel","5234523");
        p.checkCNP();
    }

    @Test(timeout = 10)
    public void testPerformanceCheckCNP(){
        Persoana p = new Persoana("Gigel","5030303766554");
        p.checkCNP();
    }

    @Test
    @Category({CategorieRight.class, CategorieBicep.class})
    public void testCorect(){
        IPersoana persoana = new Persoana("Ion","5030303766554");
        Assert.assertEquals("M",persoana.getSex());
    }

}
