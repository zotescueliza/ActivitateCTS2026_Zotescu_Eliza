package Problema2.Adapter;

public class DocumentExtern {
    private String denumireDocument;
    private String creatorDocument;
    private String corpDocument;

    public DocumentExtern(String denumireDocument, String creatorDocument, String corpDocument) {
        this.denumireDocument = denumireDocument;
        this.creatorDocument = creatorDocument;
        this.corpDocument = corpDocument;
    }

    public String getDenumireDocument() {
        return denumireDocument;
    }

    public String getCreatorDocument() {
        return creatorDocument;
    }

    public String getCorpDocument() {
        return corpDocument;
    }
}
