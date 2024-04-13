package Csomag;

import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements BankSzamla{
    private double egyenleg;
    private String tulajdonosNeve;
    private static int szamlakSzama = 0;
    private int szamlaSzam;
    private List<Tranzakcio> tranzakciok = new ArrayList<>();
    public RegularisSzamla(String tulajdonosNeve, double egyenleg) {
        this.tulajdonosNeve = tulajdonosNeve;
        this.egyenleg = egyenleg;
        this.szamlaSzam = ujSzamlaSzam();
    }

    private int ujSzamlaSzam() {
        return ++szamlakSzama;
    }

    @Override
    public void betesz(double osszeg) {
        egyenleg += osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
    }

    @Override
    public void kivesz(double osszeg) throws Exception {
        if (egyenleg < osszeg) {
            throw new Exception("Nincs elegendő összeg a számlán!");
        }
        egyenleg -= osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg));
    }

    @Override
    public double egyenleg() {
        return egyenleg;
    }

    @Override
    public String toString() {
        return "RegularisSzamla{" +
                "egyenleg=" + egyenleg +
                ", tulajdonosNeve='" + tulajdonosNeve + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
