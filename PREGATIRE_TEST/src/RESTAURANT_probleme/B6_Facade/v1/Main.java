package RESTAURANT_probleme.B6_Facade.v1;

public class Main {
    public static void main(String[] args) {
        FacadeVerificare facadeVerificareMasa = new FacadeVerificare();

        Masa masaDisponibila = new Masa(1, true, true, true);
        Masa masaOcupata = new Masa(2, false, true, true);
        Masa masaNedebarasata = new Masa(3, true, false, true);
        Masa masaFaraServetele = new Masa(4, true, true, false);

        System.out.println("=== Verificare masa disponibila ===");
        facadeVerificareMasa.verificaMasaPentruClient(masaDisponibila);

        System.out.println("===============================");

        System.out.println("=== Verificare masa ocupata ===");
        facadeVerificareMasa.verificaMasaPentruClient(masaOcupata);

        System.out.println("===============================");

        System.out.println("=== Verificare masa nedebarasata ===");
        facadeVerificareMasa.verificaMasaPentruClient(masaNedebarasata);

        System.out.println("===============================");

        System.out.println("=== Verificare masa fara servetele noi ===");
        facadeVerificareMasa.verificaMasaPentruClient(masaFaraServetele);
    }
}

