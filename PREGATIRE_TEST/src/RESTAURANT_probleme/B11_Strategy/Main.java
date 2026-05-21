package RESTAURANT_probleme.B11_Strategy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu Ion");

        client.setModDePlata(new PlataCash());
        client.platesteNota(120.5);

        System.out.println("===============================");

        client.setModDePlata(new PlataCard());
        client.platesteNota(200);
    }
}
