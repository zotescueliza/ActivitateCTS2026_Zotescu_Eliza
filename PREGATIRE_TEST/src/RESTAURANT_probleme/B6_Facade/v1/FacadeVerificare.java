package RESTAURANT_probleme.B6_Facade.v1;

public class FacadeVerificare {
    private SistemDisponibilitateMasa sistemDisponibilitateMasa;
    private SistemDebarasareMasa sistemDebarasareMasa;
    private SistemServeteleMasa sistemServeteleMasa;

    public FacadeVerificare() {
        this.sistemDisponibilitateMasa = new SistemDisponibilitateMasa();
        this.sistemDebarasareMasa = new SistemDebarasareMasa();
        this.sistemServeteleMasa = new SistemServeteleMasa();
    }

    public boolean verificaMasaPentruClient(Masa masa) {
        System.out.println("Se verifica masa " + masa.getNumarMasa() + " pentru client.");

        boolean masaLibera = sistemDisponibilitateMasa.verificaMasaLibera(masa);
        boolean masaDebarasata = sistemDebarasareMasa.verificareMasaDebarasata(masa);
        boolean serveteleNoi = sistemServeteleMasa.verificaServeteleNoi(masa);

        if (masaLibera && masaDebarasata && serveteleNoi) {
            System.out.println("Clientul poate fi asezat la masa " + masa.getNumarMasa() + ".");
            return true;
        } else {
            System.out.println("Clientul nu poate fi asezat la masa " + masa.getNumarMasa() + ".");
            return false;
        }
    }
}
