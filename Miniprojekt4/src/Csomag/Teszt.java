package Csomag;

public class Teszt {
    public static void main(String[] args) throws Exception {
        FolyoSzamla folyoSzamla = new FolyoSzamla("Duma Dani", 10000);
        TakarekSzamla takarekSzamla = new TakarekSzamla("Ördög Péter", 20000, 2.5);

        folyoSzamla.betesz(5000);
        folyoSzamla.kivesz(2000);
        folyoSzamla.levonKoltseg();

        takarekSzamla.betesz(10000);
        takarekSzamla.hozzaadKamat();

        System.out.println(folyoSzamla);
        System.out.println(takarekSzamla);
    }
}
