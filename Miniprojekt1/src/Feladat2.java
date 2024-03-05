import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A helyes jelszó
        String helyesJelszo = "titkos";

        // Jelszóellenőrző függvény meghívása
        boolean sikeres = jelszoEllenorzes(scanner, helyesJelszo);

        // Sikeres belépés vagy háromszori hibaüzenet kiírása
        if (sikeres) {
            System.out.println("Sikeres belépés!");
        } else {
            System.out.println("Háromszori hibás próbálkozás után leáll a program.");
        }

        scanner.close();
    }

    // Jelszóellenőrző függvény
    public static boolean jelszoEllenorzes(Scanner scanner, String helyesJelszo) {
        int probalkozasok = 0;

        while (probalkozasok < 3) {
            System.out.print("Kérem, adja meg a jelszót: ");
            String jelszo = scanner.nextLine();

            if (jelszo.equals(helyesJelszo)) {
                return true; // Sikeres belépés
            } else {
                System.out.println("Hibás jelszó. Próbálkozások száma: " + (probalkozasok + 1));
                probalkozasok++;
            }
        }

        return false; // Háromszori hibás próbálkozás után
    }
}
