package RESTAURANT_probleme.B15_Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<AbstractCommand> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void preiaComanda(AbstractCommand comanda) {
        comenzi.add(comanda);
    }

    public void executaComenzi() {
        for (AbstractCommand comanda : comenzi) {
            comanda.executa();
        }

        comenzi.clear();
    }
}
