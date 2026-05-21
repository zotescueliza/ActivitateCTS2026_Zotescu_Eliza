package RESTAURANT_probleme.B11_Strategy;

public class PlataCard implements AbstractModDePlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Clientul plateste cu cardul suma de " + suma + " lei.");
    }
}
