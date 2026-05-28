package ro.ase.cts.testare.suite;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.testare.categorii.CategorieBicep;
import ro.ase.cts.testare.categorii.CategorieRight;
import ro.ase.cts.testare.teste.PachetTuristicTest;
import ro.ase.cts.testare.teste.PersoanaTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({CategorieRight.class})
@Categories.ExcludeCategory(CategorieBicep.class)
public class SuitaCuCategorii {

}
