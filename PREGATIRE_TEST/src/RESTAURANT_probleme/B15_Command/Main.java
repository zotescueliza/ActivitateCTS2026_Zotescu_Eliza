package RESTAURANT_probleme.B15_Command;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);

        Operator operator = new Operator();

        operator.preiaComanda(new ComandaRezervare(masa1));
        operator.preiaComanda(new ComandaOcupareMasa(masa2));
        operator.preiaComanda(new ComandaOcupareMasa(masa1));

        operator.executaComenzi();
    }
}
