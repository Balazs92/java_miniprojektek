package Csomag;
public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata;

    public TakarekSzamla(String tulajdonosNeve, double egyenleg, double kamatRata) {
        super(tulajdonosNeve, egyenleg);
        this.kamatRata = kamatRata;
    }

    public void hozzaadKamat() {
        double kamat = egyenleg() * kamatRata / 100;
        betesz(kamat);
    }
}
