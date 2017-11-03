package ZadanieZwierzaki.Zwierzeta;

import ZadanieZwierzaki.Animal;
import ZadanieZwierzaki.Glaskable;
import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;

import java.util.ArrayList;

public class Kot extends Animal implements Glaskable {

    public Kot() {
    }

    public Kot(String imie){
        super(imie);
        this.addPotrawa(new Potrawy(NazwyPotraw.MLEKO, 2));
    }

    public Kot(String imie, ArrayList<Potrawy> dieta) {
        super(imie, dieta);
    }

    @Override
    public String dajGlos() {
        return String.format("Meow ");
    }

    @Override
    public String przedstawSie() {
        return String.format("Elo miau! jestem %s", getImie());
    }

    @Override
    public String glaskaj() {
        return String.format("Ej mozna mnie glaskac jak cos");
    }

    @Override
    public String toString() {
        return String.format("Mam na imie %s a moja ulubiona potrawa to %s \n %s", getImie(), dieta(), glaskaj());
    }
}
