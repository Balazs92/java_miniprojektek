public class Feladat6 {
    // Függvény a két egész tömb egyenlőségének vizsgálatára
    public static boolean egyenlo(int[] arr1, int[] arr2) {
        // Ellenőrizzük, hogy a tömbök ugyanolyan hosszúak-e
        if (arr1.length != arr2.length) {
            return false;
        }

        // Minden elem egyezését ellenőrizzük
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // Ha minden elem egyezik, akkor a tömbök egyenlőek
        return true;
    }

    public static void main(String[] args) {
        // Tesztesetek
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        int[] arr4 = {1, 2, 3, 4};
        int[] arr5 = {5, 4, 3, 2, 1};

        // Tesztelés és eredmények kiíratása
        System.out.println("arr1 és arr2 egyenlőek: " + egyenlo(arr1, arr2));
        System.out.println("arr1 és arr3 egyenlőek: " + egyenlo(arr1, arr3));
        System.out.println("arr1 és arr4 egyenlőek: " + egyenlo(arr1, arr4));
        System.out.println("arr1 és arr5 egyenlőek: " + egyenlo(arr1, arr5));
    }
}
