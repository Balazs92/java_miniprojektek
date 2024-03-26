package Csomag;

public class HorrorFilm extends Film implements IKorhataros{
    private int korh;
    public HorrorFilm(String cim, int ar, int korh) {
        super(cim,ar);
        this.korh = korh;
    }
    @Override
    public int Korhatar() {
        return korh;
    }
    @Override
    public int Buntetes(int kor) {
        int diff = kor - korh;
        if (diff<0) {
            return Math.abs(diff)*getAr();
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Film Korhatar: " + korh;
    }
}
