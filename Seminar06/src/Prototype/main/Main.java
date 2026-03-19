package Prototype.main;

import Prototype.clase.Rezervare;
import Prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
//        Rezervare rez1 = new Rezervare("Gica",20,5,"0244386446");
//        Rezervare rez2 = (Rezervare) rez1.clone();

        RezervareAbstracta rez1 = new Rezervare("Gica",20,5,"0244386446");
        RezervareAbstracta rez2 = (Rezervare) rez1.clone();

        ((Rezervare) rez2).setOraRezervare(10);
        ((Rezervare) rez2).setZiuaRezervarii(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
