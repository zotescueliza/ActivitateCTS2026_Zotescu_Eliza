package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
//        Hotel hotel = new Hotel();  asta e ca o verificare daca da eroare inseamna ca e bn
        Hotel hotel1 = Hotel.getInstance("Intercontinental",10,5);
        Hotel hotel2 = Hotel.getInstance("Mamaia",200,0);

        hotel1.rezervareCamera();
        hotel1.rezervareCamera();

        hotel2.rezervareCamera();
        hotel2.rezervareCamera();

        //nu conteaza cate instante avem pt ca la singleton apare mereu datele introduse prima data
    }

}
