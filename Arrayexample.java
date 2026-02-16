public class Arrayexample {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };
        int[] arr3 = { 70, 80, 90 };
        int[] arr4 = { 100, 110, 120 };

        int[][] allArrays = { arr1, arr2, arr3, arr4 };

        for (int i = 0; i < allArrays.length; i++) {
            System.out.println("Array " + (i + 1) + ":");

            for (int j = 0; j < allArrays[i].length; j++) {
                System.out.println(allArrays[i][j]);
            }
        }
    }
}
