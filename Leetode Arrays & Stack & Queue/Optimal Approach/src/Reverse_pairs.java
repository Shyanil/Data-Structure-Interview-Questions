public class Reverse_pairs {

    public int reversePairs(int[] arr) {
        return mergeSort(arr , 0 , arr.length - 1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int counter = 0;
        if(low >= high){
            return counter;
        }

        int mid = low + (high - low)/2;

        counter+=mergeSort(arr , low ,mid);
        counter+=mergeSort(arr , mid + 1 , high);
        counter+= countPairs(arr , low , mid , high);
        mergeSortInPlace(arr , low , mid , high);
        return counter;

    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int right = mid + 1;
        for (int i = low; i <= mid ; i++) {
            while (right <= high && arr[i] > 2 * arr[right]){
                right++;

            }
            cnt += right - (mid + 1);

        }
        return  cnt;

    }


    private void mergeSortInPlace(int[] arr, int low, int mid, int high) {
        int [] mix = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[low + l] = mix[l];
        }

    }

    public static void main(String[] args) {
        // Example input
        Reverse_pairs solution = new Reverse_pairs();
        int[] nums = {2, 4, 3, 5, 1};

        // Output the number of reverse pairs
        int result = solution.reversePairs(nums);

        // Print the result
        System.out.println("Number of reverse pairs: " + result);
    }
}
