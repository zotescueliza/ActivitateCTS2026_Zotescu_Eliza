package ro.ase.cts.clase;

public class Hotel {
    private String nume;
    private int numarCamere;
    private int numarCamereOcupate;

    private static Hotel instantaHotel = null;

    public Hotel(String nume, int numarCamere, int numarCamereOcupate) {
        this.nume = nume;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }
//versiune este lazyitialization, ca sa nu fie lazy adaugam synchronize

    public static synchronized Hotel getInstance(String nume, int numarCamere,int numarCamereOcupate){
        if(instantaHotel == null){
            instantaHotel = new Hotel(nume,numarCamere,numarCamereOcupate);
        }
        return instantaHotel;
    }

    public void rezervareCamera(){
        if(this.numarCamereOcupate < this.numarCamere){
            System.out.println("Rezervare realizata cu succes!");
            this.numarCamereOcupate++;
        }
        else{
            System.out.println("Nu mai sunt camere libere disponibile");
        }
    }

    public void afiseazaDetaliiHotel() {
        StringBuilder sb = new StringBuilder("Hotelul cu ");
        sb.append("numele= ")
                .append(this.nume).append('\'')
                .append(", numarCamere=").append(this.numarCamere)
                .append(", numarCamereOcupate=")
                .append(this.numarCamereOcupate)
                .append(' ');
        System.out.println(sb);
    }

}
