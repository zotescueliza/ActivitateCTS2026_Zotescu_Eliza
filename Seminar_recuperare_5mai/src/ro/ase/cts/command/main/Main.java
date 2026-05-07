package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Popescu");
        PersonalSpital asistenta = new Asistent("ENESCU");

        Pacient pac1 = new Pacient("Grigorecsu");
        Pacient pac2 = new Pacient("Lovinescu");


        Command command1 = new Internare(medic,pac1);
        Command command2 = new Tratare(asistenta,pac2);

        Operator operator = new Operator();

        operator.inregistreaza(command1);
        operator.inregistreaza(command2);

        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta,new Pacient("Oprescu")));
        operator.executaFisa();
        operator.executaFisa();
    }
}
