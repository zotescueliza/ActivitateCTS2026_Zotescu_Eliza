package ro.ase.cts.Teste;

import org.junit.Assert;
import ro.ase.cts.clase.CalatorAbonat;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testplatesteBilet() {
        CalatorAbonat calator = new CalatorAbonat("Nick");
        calator.setSold(5.5f);
        calator.platesteBilet(1f);
        Assert.assertEquals(calator.getSold(),4.5f,0.001f);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient(){
        CalatorAbonat calator = new CalatorAbonat("Irina");
        calator.setSold(5.5f);
        calator.platesteBilet(10f);
        Assert.assertEquals(5.5f,calator.getSold(),0.001f);

    }

}