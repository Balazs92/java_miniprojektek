public class Feladat8 {
    public static void main(String[] args) {
        int[] array = {55, 32, 45, 98, 82, 11, 9, 39, 50};
        sortArrayAscending(array);

        System.out.print("Tömb elemei növekvő sorrendben: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sortArrayAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
