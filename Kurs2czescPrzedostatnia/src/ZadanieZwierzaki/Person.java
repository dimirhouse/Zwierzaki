package ZadanieZwierzaki;

import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;

import java.util.ArrayList;

public class Person {

    /*napisz aplikacje, ktora ma za zadanie stowrzyc osobe ktora bedzie mogla posiadac zwierzaki roznego rodzaju.
    Kazdy zwierzak ma swoja liste ulubionych potraw. Osoba ma liste dostepnych potraw.
    Nakarm wszystkie zwierzaki metoda nakarm (patrze co zwierzak lubi i w jakiej ilosci i tyle mu dac)
    jesli czegos braknie to w metodzie person stworzyc kup

     */
    private String imie;
    private ArrayList<Potrawy> dostepnePotrawy = new ArrayList<>();

    public Person() {
    }

    public Person(String imie){
        this.imie = imie;
        this.addPotrawa(new Potrawy(dostepnePotrawy));
    }

    public Person(String imie, ArrayList<Potrawy> dostepnePotrawy) {
        this.imie = imie;
        this.dostepnePotrawy = dostepnePotrawy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public ArrayList<Potrawy> getDostepnePotrawy() {
        return dostepnePotrawy;
    }

    public void setDostepnePotrawy(ArrayList<Potrawy> dostepnePotrawy) {
        this.dostepnePotrawy = dostepnePotrawy;
    }

    public void addPotrawa (Potrawy potrawa){
        dostepnePotrawy.add(potrawa);
    }

    @Override
    public String toString() {
        return String.format("Osoba %s posiada takie jedzenie: %s", imie, dostepnePotrawy);
    }
}
