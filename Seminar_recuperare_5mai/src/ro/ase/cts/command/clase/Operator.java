package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<Command> listaComenzi = new ArrayList<>();


    //invocare => inregistrare fisa
    public void inregistreaza(Command command){
        listaComenzi.add(command);
    }

    public void executaFisa(){

        if(listaComenzi.size()>0){
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }

    }
}
