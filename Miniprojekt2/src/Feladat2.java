import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy szót: ");
        String szo = scanner.nextLine();

        String ujSzo = szo.replace('a', '*');

        System.out.println("Eredeti szó: " + szo);
        System.out.println("Lecserélt szó: " + ujSzo);
    }
}
