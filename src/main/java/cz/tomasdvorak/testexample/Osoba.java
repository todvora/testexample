package cz.tomasdvorak.testexample;

/**
 * Source: https://gist.github.com/kitsaels/b85c3140b631adf02f7e
 */
public class Osoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private float vaha;

    Osoba(String jmeno, String prijmeni, int vek, float vaha) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.vaha = vaha;
    }

    public String toString() {
        return jmeno + " " + prijmeni + " má " + vek + " let a váží " + vaha + " kg";
    }
}