import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Szám beolvasása a felhasználótól
        System.out.print("Kérem, adjon meg egy számot: ");
        int n = scanner.nextInt();

        // Csillagháromszög kiíratása
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
