import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg az első számot: ");
        double szam1 = scanner.nextDouble();

        System.out.print("Kérem, adja meg a második számot: ");
        double szam2 = scanner.nextDouble();

        System.out.print("Kérem, adja meg az operátort (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        double eredmeny = 0;

        switch (operator) {
            case '+':
                eredmeny = szam1 + szam2;
                break;
            case '-':
                eredmeny = szam1 - szam2;
                break;
            case '*':
                eredmeny = szam1 * szam2;
                break;
            case '/':
                if (szam2 != 0) {
                    eredmeny = szam1 / szam2;
                } else {
                    System.out.println("Hiba: Nullával való osztás!");
                    return; // Kilépés a programból
                }
                break;
            default:
                System.out.println("Hiba: Ismeretlen operátor!");
                return; // Kilépés a programból
        }

        System.out.println("Eredmény: " + eredmeny);

        scanner.close();
    }
}
