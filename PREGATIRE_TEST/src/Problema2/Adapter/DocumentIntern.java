package Problema2.Adapter;

public class DocumentIntern implements AbstractDocumentJuridic{

    private String titlu;
    private String autor;
    private String continut;

    public DocumentIntern(String titlu, String autor, String continut) {
        this.titlu = titlu;
        this.autor = autor;
        this.continut = continut;
    }

    @Override
    public String obtineTitlu() {
        return this.titlu;
    }

    @Override
    public String obtineAutor() {
        return this.autor;
    }

    @Override
    public String obtineContinut() {
        return this.continut;
    }
}
