package RESTAURANT_probleme.B6_Facade.v1;

public class SistemServeteleMasa {
    public boolean verificaServeteleNoi(Masa masa) {
        if (masa.isAreServeteleNoi()) {
            System.out.println("Pe masa " + masa.getNumarMasa() + " au fost puse servetele noi.");
            return true;
        } else {
            System.out.println("Pe masa " + masa.getNumarMasa() + " nu au fost puse servetele noi.");
            return false;
        }

    }
}
