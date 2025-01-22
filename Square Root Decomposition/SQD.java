public class SQD {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int n = arr.length;
        int sqrt = (int) Math.sqrt(n);
        int [] blockArray = new int[sqrt + 1];
        int BLOCK_SIZE = -1;
        for (int i = 0; i < n; i++) {
            if(i % sqrt == 0){
                BLOCK_SIZE++;
            }
            blockArray[BLOCK_SIZE] += arr[i];
        }
        System.out.println(query(blockArray, arr, 2, 7, 3));
    }

    public  static int query(int[] blockArray , int [] arr, int l , int r, int sqrt){
       int ans=0;
        while (l % sqrt != 0 && l < r && l!= 0){
        ans+=arr[l];
        l++;
        }
        while (l + sqrt <= r){
            ans += arr[l / sqrt];
            l += sqrt;
        }
        while (l <= r){
            ans+= arr[l];
            l++;
        }

        return ans;



    }
}
