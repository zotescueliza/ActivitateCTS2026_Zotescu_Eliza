package Problema2.Adapter;

public class AdapterDocumentExtern implements AbstractDocumentJuridic{

    private DocumentExtern documentExtern;

    public AdapterDocumentExtern(DocumentExtern documentExtern) {
        this.documentExtern = documentExtern;
    }

    @Override
    public String obtineTitlu() {
        System.out.println("Se transforma denumirea externa in titlu intern.");
        return documentExtern.getDenumireDocument();
    }

    @Override
    public String obtineAutor() {
        System.out.println("Se transforma creatorul extern in autor intern.");
        return documentExtern.getCreatorDocument();
    }

    @Override
    public String obtineContinut() {
        System.out.println("Se transforma corpul extern in continut intern.");
        return documentExtern.getCorpDocument();
    }
}
