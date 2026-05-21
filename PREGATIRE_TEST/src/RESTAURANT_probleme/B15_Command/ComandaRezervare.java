package RESTAURANT_probleme.B15_Command;

public class ComandaRezervare implements AbstractCommand{

    private Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezervaMasa();
    }
}
