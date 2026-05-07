package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinie {
    Map<Integer,Linie> registru = new HashMap<>();

    public Linie getLinie(int nrLinie, String primaStatie, String ultimaStatie){
        if(registru.containsKey(nrLinie)){
            if(registru.get(nrLinie) != null){
                return registru.get(nrLinie);
            }
            else
            {
                throw new RuntimeException("Nu avem un obiect asociat acestei linii");
            }
        } else {
            registru.put(nrLinie,new Linie(nrLinie,primaStatie,ultimaStatie));
            return registru.get(nrLinie);
        }
    }
}
