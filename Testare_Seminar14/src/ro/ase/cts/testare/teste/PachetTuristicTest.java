package ro.ase.cts.testare.teste;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.IPersoana;
import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.testare.categorii.CategorieBicep;
import ro.ase.cts.testare.categorii.CategorieRight;
import ro.ase.cts.testare.dubluri.PersoanaFake;
import ro.ase.cts.testare.dubluri.StubPersoana;

public class PachetTuristicTest  {
    @Test
    @Category(CategorieRight.class)
    public void testAplicaDiscountVarstnici(){
        IPersoana persoana = new StubPersoana();
        PachetTuristic p = new PachetTuristic(persoana,"Sibiu",400.0);
        p.aplicaDiscountVarstnici(10);

        Assert.assertEquals(360,p.getPret(),0.01);
    }

    @Test
    @Category(CategorieBicep.class)
    public void testAplicaDiscountBoundaryFake(){
        IPersoana persoanaFake = new PersoanaFake();
        ((PersoanaFake)persoanaFake).setGetVarstaValue(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Ibiza",400.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        Assert.assertEquals(360.,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CategorieRight.class)
    public void testNuAplicaDiscountFake(){
        IPersoana persoanaFake = new PersoanaFake();
        ((PersoanaFake)persoanaFake).setGetVarstaValue(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Ibiza",400.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        Assert.assertEquals(400.0,pachetTuristic.getPret(),0.01);
    }

}