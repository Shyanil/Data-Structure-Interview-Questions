public class CellingProblem {
    //smallest element in array thats grether or equals to target 
    public static void main(String[] args) {
        int arr [] ={20,30,40,50,60};
        int targert = 33;
        int ANS = CellingProblemBS(arr, targert);
        System.out.println(ANS);
    }
    static int CellingProblemBS(int arr[], int targert){
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAss = arr[start] < arr[end];
        while (start<= end) {
            int mid = start + (end - start)/2;
            if (isAss) {
                if (targert > arr[mid]) {
                    start = mid +1;
                } else{
                    end = mid - 1;
                }
            } else{
                if (targert < arr[mid]) {
                    start = mid +1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
