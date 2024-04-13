package Csomag;
import java.util.List;

public interface BankSzamla {
    void betesz(double osszeg);
    void kivesz(double osszeg) throws Exception;
    double egyenleg();
    public enum TranzakcioTipus {
        DEPOSIT, WITHDRAW
    }
}
