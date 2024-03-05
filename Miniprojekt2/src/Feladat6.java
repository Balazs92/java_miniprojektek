public class Feladat6 {
    public static void main(String[] args) {
        int[] array = {55, 32, 45, 98, 82, 11, 9, 39, 50};
        findAndPrintMinMax(array);
    }

    public static void findAndPrintMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("A tömb üres.");
            return;
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Legkisebb elem: " + smallest);
        System.out.println("Legnagyobb elem: " + largest);
    }
}
