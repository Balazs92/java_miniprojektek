public class Feladat5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        swapFirstAndLast(array);

        System.out.print("Tömb elemei a cserét követően: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void swapFirstAndLast(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        } else {
            System.out.println("A tömbnek legalább 2 eleme kell legyen a cseréhez.");
        }
    }
}