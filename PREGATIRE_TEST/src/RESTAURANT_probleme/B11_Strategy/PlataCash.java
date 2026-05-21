package RESTAURANT_probleme.B11_Strategy;

public class PlataCash implements AbstractModDePlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Clientul plateste cu cash suma de " + suma + " lei.");
    }
}
