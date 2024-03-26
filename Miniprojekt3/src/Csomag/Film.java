package Csomag;

public class Film {
    private String cim;
    private int ar;
    private int[] velemenyek = new int[20];
    private int velemenySzam = 0;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemenySzam < velemenyek.length) {
            velemenyek[velemenySzam++] = velemeny;
        }
    }

    public double Atlag() {
        if (velemenySzam == 0) {
            System.out.println("A film még nem kapott egy véleményt sem.");
            return 0;
        }
        int osszeg = 0;
        for (int i = 0; i < velemenySzam; i++) {
            osszeg += velemenyek[i];
        }
        return (double) osszeg / velemenySzam;
    }

    @Override
    public String toString() {
        return "Film cime: " + cim + ", Film ara: " + ar;
    }
}
