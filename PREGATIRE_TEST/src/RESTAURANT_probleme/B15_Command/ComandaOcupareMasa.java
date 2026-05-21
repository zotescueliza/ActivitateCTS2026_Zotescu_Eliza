package RESTAURANT_probleme.B15_Command;

public class ComandaOcupareMasa implements AbstractCommand{

    private Masa masa;

    public ComandaOcupareMasa(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupaMasa();
    }
}
