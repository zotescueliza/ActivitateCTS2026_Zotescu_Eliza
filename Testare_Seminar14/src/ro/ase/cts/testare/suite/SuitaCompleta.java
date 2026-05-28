package ro.ase.cts.testare.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.testare.teste.PachetTuristicTest;
import ro.ase.cts.testare.teste.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {
}
