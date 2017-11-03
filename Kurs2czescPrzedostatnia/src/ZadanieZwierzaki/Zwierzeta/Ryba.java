package ZadanieZwierzaki.Zwierzeta;

import ZadanieZwierzaki.Animal;
import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;

import java.util.ArrayList;

public class Ryba extends Animal {

    public Ryba() {
    }

    public Ryba(String imie) {
        super(imie);
        this.addPotrawa(new Potrawy(NazwyPotraw.PLANKTON, 300));
    }

    public Ryba(String imie, ArrayList<Potrawy> dieta) {
        super(imie, dieta);
    }

    @Override
    public String dajGlos() {
        return String.format("BUL BUL!");
    }

    @Override
    public String przedstawSie() {
        return String.format("BUL moje imie to %s", getImie());
    }

    @Override
    public String toString() {
        return String.format("Mam na imie %s a moja ulubiona potrawa to %s", getImie(), dieta() );
    }
}
