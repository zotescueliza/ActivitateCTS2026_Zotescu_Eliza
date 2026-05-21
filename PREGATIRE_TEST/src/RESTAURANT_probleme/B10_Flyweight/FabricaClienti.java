package RESTAURANT_probleme.B10_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {

    private Map<String, AbstractClientRestaurnat> clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public AbstractClientRestaurnat getClient(String nume, String numarTelefon, String emali){
        String cheieClient = numarTelefon;

        //verificam daca exista clientul
        if(!clienti.containsKey(cheieClient)){
            clienti.put(cheieClient,new ClientRestaurant(nume, numarTelefon,emali));
        }else{
            System.out.println("Se reutilizeaza obiectul client pentru: " + nume);
        }
        return clienti.get(cheieClient);
    }

    public int getNrClienti(){
        return clienti.size();
    }

}
