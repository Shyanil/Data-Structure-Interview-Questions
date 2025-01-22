public class LinearSearchAlgorithm3 {
    // max and min value at once
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("Max value: " + findMinMax(arr));
    }

    static int findMinMax(int arr[]) {
        if (arr.length == 0) {
            return -1; // or throw an exception if appropriate
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { // Start loop from the second element
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min value: " + min);
        return max;
    }
}
