import java.util.Scanner;

public class Bonuszfel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kávéfajták és árak definiálása
        int alapAr = 100;
        int duplaCukrosAr = alapAr + 20;
        int habosAr = alapAr + 50;
        int poharNelkuliAr = alapAr - 10;

        // Menü megjelenítése
        System.out.println("Kávé választék:");
        System.out.println("1. Pohár nélkül (" + poharNelkuliAr + " Ft)");
        System.out.println("2. Dupla cukorral (" + duplaCukrosAr + " Ft)");
        System.out.println("3. Habos kávé (" + habosAr + " Ft)");

        // Választás bekérése
        System.out.print("Kérem, válasszon egy kávéfajtát (1-3): ");
        int valasztas = scanner.nextInt();

        // Fizetendő összeg meghatározása
        int fizetendo = 0;
        switch (valasztas) {
            case 1:
                fizetendo = poharNelkuliAr;
                break;
            case 2:
                fizetendo = duplaCukrosAr;
                break;
            case 3:
                fizetendo = habosAr;
                break;
            default:
                System.out.println("Hibás választás!");
                return;
        }

        // Fizetendő összeg bekérése
        System.out.print("Fizetendő összeg: "+fizetendo+"Ft");
        int osszeg = scanner.nextInt();

        // Ellenőrzés, hogy elég pénzt adott-e meg a felhasználó
        if (osszeg < fizetendo) {
            System.out.println("Nem megfelelő összeg! A kávé " + fizetendo + " Ft.");
        } else {
            int visszajaro = osszeg - fizetendo;
            System.out.println("Köszönjük a vásárlást! A visszajáró: " + visszajaro + " Ft.");
        }

        scanner.close();
    }
}
