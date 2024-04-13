package Csomag;
public class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama = 0;
    private static final int INGYENESTRANZSZAMA = 3;
    private static final double TRANZAKCIOARA = 200;

    public FolyoSzamla(String tulajdonosNeve, double egyenleg) {
        super(tulajdonosNeve, egyenleg);
    }

    @Override
    public void betesz(double osszeg) {
        super.betesz(osszeg);
        tranzakciokSzama++;
    }

    @Override
    public void kivesz(double osszeg) throws Exception {
        super.kivesz(osszeg);
        tranzakciokSzama++;
    }

    public void levonKoltseg() throws Exception {
        if (tranzakciokSzama > INGYENESTRANZSZAMA) {
            double levonando = TRANZAKCIOARA * (tranzakciokSzama - INGYENESTRANZSZAMA);
            super.kivesz(levonando);
        }
        tranzakciokSzama = 0;
    }
}
