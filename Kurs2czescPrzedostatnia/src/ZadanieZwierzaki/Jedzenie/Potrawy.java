package ZadanieZwierzaki.Jedzenie;

import java.util.ArrayList;

public class Potrawy {

    private NazwyPotraw nazwyPotraw;
    private float ilosc;

    public Potrawy() {
    }

    public Potrawy(NazwyPotraw nazwyPotraw, float ilosc) {
        this.nazwyPotraw = nazwyPotraw;
        this.ilosc = ilosc;
    }

    public Potrawy(ArrayList<Potrawy> dostepnePotrawy) {

    }

    public NazwyPotraw getNazwyPotraw() {
        return nazwyPotraw;
    }

    public void setNazwyPotraw(NazwyPotraw nazwyPotraw) {
        this.nazwyPotraw = nazwyPotraw;
    }

    public float getIlosc() {
        return ilosc;
    }

    public void setIlosc(float ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return String.format("potrawa %s  w ilosci  %.2f", nazwyPotraw, ilosc);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj instanceof Potrawy){
            Potrawy potrawy = (Potrawy) obj;
            return nazwyPotraw == potrawy.nazwyPotraw;
        }
        return false;
    }

}
