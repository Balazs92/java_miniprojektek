public class Feladat7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        findAndPrintDuplicates(arr);
    }

    public static void findAndPrintDuplicates(int[] arr) {
        System.out.println("Többször előforduló elemek a tömbben:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
