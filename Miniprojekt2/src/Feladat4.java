public class Feladat4 {
    public static void main(String[] args) {
        String input = "aaabbbcc";
        String compressed = compressString(input);
        System.out.println("Tömörített karakterlánc: " + compressed);
    }

    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        result.append(input.charAt(input.length() - 1));
        result.append(count);

        return result.toString();
    }
}
