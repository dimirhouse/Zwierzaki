package ZadanieZwierzaki;

import ZadanieZwierzaki.Jedzenie.NazwyPotraw;
import ZadanieZwierzaki.Jedzenie.Potrawy;
import ZadanieZwierzaki.Zwierzeta.Kot;
import ZadanieZwierzaki.Zwierzeta.Pies;
import ZadanieZwierzaki.Zwierzeta.Ryba;

import java.util.ArrayList;
import java.util.List;

public class ZwierzakiTest {
    public static void main(String[] args) {



        Potrawy mieso = new Potrawy(NazwyPotraw.MIESO, 10);
        Potrawy salata = new Potrawy(NazwyPotraw.SALATA, 50);
        Potrawy robaki = new Potrawy(NazwyPotraw.ROBAKI, 30);
        Potrawy plankton = new Potrawy(NazwyPotraw.PLANKTON, 100000);
        Potrawy mleko = new Potrawy(NazwyPotraw.MLEKO, 8);
        Potrawy ziarno = new Potrawy(NazwyPotraw.ZIARNO, 500);


//        System.out.println("\n" + "POTRAWY");

        ArrayList<Potrawy> zarcie = new ArrayList<>();

        zarcie.add(mieso);
        zarcie.add(salata);
        zarcie.add(robaki);
        zarcie.add(plankton);
        zarcie.add(mleko);
        zarcie.add(ziarno);
//        zarcie.add(patrycjusz); //zrobic test czy bedzie to dzialalo (kot zje rybe)

        Kot morgoth = new Kot("Morgoth");
        Pies kolejarz = new Pies("Kolejarz");
        Ryba patrycjusz = new Ryba("Patrycjusz");

        List<Animal> zoo = new ArrayList<>();
        zoo.add(morgoth);
        zoo.add(kolejarz);
        zoo.add(patrycjusz);

        for (int i = 0; i < zoo.size(); i++) {
            System.out.println("\n" + zoo.get(i).toString());
            System.out.println(zoo.get(i).dajGlos() + "\n");
        }

        Potrawy kasza = new Potrawy(NazwyPotraw.KASZA, 10);
        Potrawy owoce = new Potrawy(NazwyPotraw.OWOCE, 8);

        ArrayList<Potrawy> jedzenieOsoby = new ArrayList<>();

        jedzenieOsoby.add(kasza);
        jedzenieOsoby.add(owoce);
        jedzenieOsoby.add(mleko);
        jedzenieOsoby.add(salata);

        Person jakub = new Person("Jakub", jedzenieOsoby);
        System.out.println(jakub.toString());

        for (int i = 0; i < zarcie.size(); i++) {
            for (int j = 0; j < jedzenieOsoby.size(); j++) {
                if (zarcie.get(i).equals(jedzenieOsoby.get(j))){
                    System.out.println("Te same potrawy to:");
                    System.out.println(jedzenieOsoby.get(j).toString());
                }
            }
        }

        for (int i = 0; i < zarcie.size(); i++) {
            for (int j = 0; j < jedzenieOsoby.size(); j++) {
                if (!zarcie.get(i).equals(jedzenieOsoby.get(j))){
                    System.out.println("\n Potrawy nowe to:");
                    System.out.println(jedzenieOsoby.get(j).toString());
                }
            }
        }
    }
}
