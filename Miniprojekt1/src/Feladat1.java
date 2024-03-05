import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        // Scanner objektum létrehozása a konzolról történő adatbevitelhez
        Scanner scanner = new Scanner(System.in);

        // Szám beolvasása és ellenőrzése
        System.out.print("Kérem, adjon meg egy egész számot 1 és 10 között: ");
        int szam = scanner.nextInt();

        if (szam < 1 || szam > 10) {
            System.out.println("Hiba: A megadott szám nem 1 és 10 között van.");
            return; // Kilépés a programból
        }

        // Szorzótábla kiíratása
        for (int i = 1; i <= 10; i++) {
            System.out.println(szam + " x " + i + " = " + (szam * i));
        }

        // Scanner lezárása
        scanner.close();
    }
}
