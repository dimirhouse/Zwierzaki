package ZadanieZwierzaki;

import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;

import java.util.ArrayList;

public abstract class Animal extends Potrawy {
    private String imie;
    private ArrayList<Potrawy> dieta = new ArrayList<>();

    public abstract String dajGlos();

    public abstract String przedstawSie();

    public  ArrayList<Potrawy> dieta(){
        return dieta;
    }

    public Animal() {
    }

    public Animal(String imie, ArrayList<Potrawy> dieta) {
        this.imie = imie;
        this.dieta = dieta;
    }

    public Animal(String imie) {
        this.imie = imie;
    }

    public Animal(String imie, ArrayList<Potrawy> dieta, String ulubionaPotrawa) {
        this.imie = imie;
        this.dieta = dieta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public ArrayList<Potrawy> getDieta() {
        return dieta;
    }

    public void setDieta(ArrayList<Potrawy> dieta) {
        this.dieta = dieta;
    }

    public void addPotrawa (Potrawy potrawa){
        dieta.add(potrawa);
    }

}
