package Iskola;
import java.util.ArrayList;

public class Hallgato {
    private static int nextID = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private final ArrayList<Jegy> jegyek;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.jegyek = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargy) {
        int osszeg = 0;
        int db = 0;
        for (Jegy j : jegyek) {
            if (j.getTantargy().equals(tantargy)) {
                osszeg += j.getJegy();
                db++;
            }
        }
        if (db == 0) return 0;
        return (double) osszeg / db;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy j : jegyek) {
            String tantargy = j.getTantargy();
            if (!tantargyak.contains(tantargy)) {
                tantargyak.add(tantargy);
            }
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println(vezeteknev + " " + keresztnev);
        for (String tantargy : getTantargyak()) {
            System.out.println(tantargy + ": " + tantargyAtlag(tantargy));
        }
    }
}
