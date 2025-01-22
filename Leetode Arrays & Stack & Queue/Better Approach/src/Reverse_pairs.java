public class Reverse_pairs {
    public static int reversePairs(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > 2 * arr[j]){
                    counter++;
                }
            }
        }
        return  counter;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }
}

// Brute Force
