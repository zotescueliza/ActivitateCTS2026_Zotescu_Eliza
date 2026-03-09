package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int VALOARE_FINANATARE_ELEV=30;

	
	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	public Elev() {
		super();
	}

	@Override
	public void anuntaFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Elev.VALOARE_FINANATARE_ELEV+" Euro/zi in proiect.");
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append(super.toString());
		sb.append("clasa=").append(clasa);
		sb.append(", tutore='").append(tutore).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
