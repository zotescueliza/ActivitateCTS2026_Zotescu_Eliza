package RESTAURANT_probleme.B8_Composite;

public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniuRestaurant = new SectiuneMeniu("Meniu restaurant");

        SectiuneMeniu startere = new SectiuneMeniu("Startere");
        SectiuneMeniu bauturi = new SectiuneMeniu("Bauturi");
        SectiuneMeniu desert = new SectiuneMeniu("Desert");

        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");

        ItemMeniu bruschete = new ItemMeniu("Bruschete", 22);
        ItemMeniu salata = new ItemMeniu("Salata greceasca", 28);

        ItemMeniu apaPlata = new ItemMeniu("Apa plata", 8);
        ItemMeniu apaMinerala = new ItemMeniu("Apa minerala", 8);
        ItemMeniu cola = new ItemMeniu("Cola", 10);

        ItemMeniu espresso = new ItemMeniu("Espresso", 12);
        ItemMeniu cappuccino = new ItemMeniu("Cappuccino", 15);

        ItemMeniu papanasi = new ItemMeniu("Papanasi", 30);
        ItemMeniu clatite = new ItemMeniu("Clatite", 25);

        startere.adaugaElement(bruschete);
        startere.adaugaElement(salata);

        sucuri.adaugaElement(apaPlata);
        sucuri.adaugaElement(apaMinerala);
        sucuri.adaugaElement(cola);

        cafea.adaugaElement(espresso);
        cafea.adaugaElement(cappuccino);

        bauturi.adaugaElement(sucuri);
        bauturi.adaugaElement(cafea);

        desert.adaugaElement(papanasi);
        desert.adaugaElement(clatite);

        meniuRestaurant.adaugaElement(startere);
        meniuRestaurant.adaugaElement(bauturi);
        meniuRestaurant.adaugaElement(desert);

        meniuRestaurant.afiseazaMeniu();

    }
}
