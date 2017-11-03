package ZadanieZwierzaki.Zwierzeta;

import ZadanieZwierzaki.Animal;
import ZadanieZwierzaki.Glaskable;
import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;

import java.util.ArrayList;

public class Pies extends Animal implements Glaskable {


    public Pies(String imie){
        super(imie);
        this.addPotrawa(new Potrawy(NazwyPotraw.KOSC, 3));
    }

    public Pies(String imie, ArrayList<Potrawy> dieta) {
        super(imie, dieta);
    }

    @Override
    public String dajGlos() {
        return String.format("Hau Hau? -.-'");
    }

    @Override
    public String przedstawSie() {
        return String.format("Haucze swoje imie ktore brzmi %s", getImie());
    }

    @Override
    public String glaskaj() {
        return String.format("jak mnie dotkniesz to zagryze");
    }

    @Override
    public String toString() {
        return String.format("Mam na imie %s a moja ulubiona potrawa to %s \n %s", getImie(), dieta(), glaskaj());
    }
}
