package Prototype.clase;

public class Rezervare implements RezervareAbstracta {
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String numarTelefon) {
        if(numeClient.length()>1){
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "Ion";
        }
        //fara this este parametrul din constructor
        if(oraRezervare<23 && oraRezervare >9){
            this.oraRezervare = oraRezervare;
        }else{
            this.oraRezervare = 9;
        }

        if(ziuaRezervarii<30){
            this.ziuaRezervarii=ziuaRezervarii;
        }
        else {
            this.ziuaRezervarii=1;
        }
        if(numarTelefon.length()<10){
            this.numarTelefon = numarTelefon;
        }else{
            this.numarTelefon="0799171161";
        }


    }
    private Rezervare(){

    }

    public int getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public int getZiuaRezervarii() {
        return ziuaRezervarii;
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        this.ziuaRezervarii = ziuaRezervarii;
    }

    @Override
    public RezervareAbstracta clone(){
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.numarTelefon = this.numarTelefon;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziuaRezervarii = this.ziuaRezervarii;

        return rezervareNoua;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
