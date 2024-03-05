import java.util.Scanner;
import java.util.Random;

public class Bonuszfel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gondolt szám generálása 1 és 100 között
        int gondoltSzam = random.nextInt(100) + 1;

        System.out.println("Gondoltam egy számra 1 és 100 között. Találd ki!");

        int tipp;
        int lepes = 0;

        // Felhasználó tippelése és ellenőrzése
        do {
            System.out.print("Tippelj egy számra: ");
            tipp = scanner.nextInt();
            lepes++;

            if (tipp < gondoltSzam) {
                System.out.println("Túl kevés.");
            } else if (tipp > gondoltSzam) {
                System.out.println("Túl sok.");
            } else {
                System.out.println("Eltaláltad a számot " + lepes + " lépésben!");
            }
        } while (tipp != gondoltSzam);

        scanner.close();
    }
}
