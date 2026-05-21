package Problema2.Adapter;

public class Main {
    public static void afiseazaDocument(AbstractDocumentJuridic documentJuridic) {
        System.out.println("Titlu: " + documentJuridic.obtineTitlu());
        System.out.println("Autor: " + documentJuridic.obtineAutor());
        System.out.println("Continut: " + documentJuridic.obtineContinut());
    }
    public static void main(String[] args) {

        AbstractDocumentJuridic documentIntern = new DocumentIntern( "Contract inchiriere", "Judecatoria Bucuresti", "Continut contract intern");
        DocumentExtern documentExtern = new DocumentExtern("Cerere chemare in judecata", "Cabinet avocatura Popescu", "Continut document extern");
        AbstractDocumentJuridic documentJuridicExtern = new AdapterDocumentExtern(documentExtern);

        System.out.println("=== Procesare document intern ===");
        afiseazaDocument(documentIntern);

        System.out.println("===============================");

        System.out.println("=== Procesare document extern adaptat ===");
        afiseazaDocument(documentJuridicExtern);
    }
}
