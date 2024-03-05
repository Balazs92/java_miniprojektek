public class Feladat5 {
    public static boolean csakAlfabetikus(String str) {
        // Végigmegyünk az összes karakteren a string-ben
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Ellenőrizzük, hogy a karakter nem kis- és nem is nagybetű
            if (!(Character.isLetter(c))) {
                return false;
            }
        }
        // Ha minden karakter alfabetikus volt, akkor igazat adunk vissza
        return true;
    }

    public static void main(String[] args) {
        // Teszteljük a csakAlfabetikus metódust
        String str1 = "HelloWorld";
        String str2 = "Hello123";

        System.out.println(str1 + " csak alfabetikus karaktereket tartalmaz: " + csakAlfabetikus(str1));
        System.out.println(str2 + " csak alfabetikus karaktereket tartalmaz: " + csakAlfabetikus(str2));
    }
}

