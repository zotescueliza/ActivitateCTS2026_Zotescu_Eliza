package Problema2.ChainOfResponsability;

public class Document {
    private String titlu;
    private String autor;
    private String continut;
    private boolean semnat;
    private boolean formatValid;
    private boolean areAnexa;

    public Document(String titlu, String autor, String continut,
                    boolean semnat, boolean formatValid, boolean areAnexa) {
        this.titlu = titlu;
        this.autor = autor;
        this.continut = continut;
        this.semnat = semnat;
        this.formatValid = formatValid;
        this.areAnexa = areAnexa;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public String getContinut() {
        return continut;
    }

    public boolean isSemnat() {
        return semnat;
    }

    public boolean isFormatValid() {
        return formatValid;
    }

    public boolean isAreAnexa() {
        return areAnexa;
    }
}
