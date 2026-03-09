package src.ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
            AngajatiReader angajatiReader = new AngajatiReader("angajati.txt");
			listaAngajati = angajatiReader.readAplicanti();
			for(Aplicant angajat:listaAngajati){
				System.out.println(angajat.toString());
				angajat.anuntaFinantare();
				angajat.afiseazaStatut();
			}
			angajatiReader.readAplicanti();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
