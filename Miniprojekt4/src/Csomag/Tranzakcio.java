package Csomag;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {
    private LocalDateTime idopont;
    private BankSzamla.TranzakcioTipus tranzTipus;
    private double osszeg;

    public Tranzakcio(BankSzamla.TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Tranzakcio{" +
                "idopont=" + idopont.format(formatter) +
                ", tranzTipus=" + tranzTipus +
                ", osszeg=" + osszeg +
                '}';
    }
}
