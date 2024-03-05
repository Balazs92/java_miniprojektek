import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy karakterláncot: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("Eredeti karakterlánc: " + input);
        System.out.println("Törölt karakterlánc: " + result.toString());
    }
}
