package ZadanieZwierzaki.Jedzenie;

public enum NazwyPotraw {

    KOSC("kosc"),
    MLEKO("mleko"),
    PLANKTON("plankton"),
    ZIARNO("ziarno"),
    MIESO("mieso"),
    SALATA("salata"),
    ROBAKI("robaki"),

    KASZA("kasza"),
    LODY("lody"),
    OGORKI("ogorki"),
    SER("ser"),
    OWOCE("owoce");


    private String nazwa;

    NazwyPotraw(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
