import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy szót: ");
        String szo = scanner.nextLine();

        if (szo.length() > 0) {
            char elsoKarakter = szo.charAt(0);
            char utolsoKarakter = szo.charAt(szo.length() - 1);

            System.out.println("Az első karakter: " + elsoKarakter);
            System.out.println("Az utolsó karakter: " + utolsoKarakter);
        } else {
            System.out.println("Nem adott meg szót.");
        }
    }
}
