import java.util.Arrays;

public class TwoStackGame {

    public static int twoStacks(int sum , int[] FArray, int []SArray){
        return twoStackshelper(sum , FArray , SArray , 0 , 0)  - 1;
    }

    private static int twoStackshelper(int sum, int[] a, int[] b, int sumtotal, int counter) {
        if(sumtotal > sum){
            return  counter;
        }

        if(a.length == 0 || b.length == 0){
            return counter;
        }

        int ans1 = twoStackshelper(sum , Arrays.copyOfRange(a , 1 , a.length) , b , a[0] + sumtotal , counter + 1);
        int ans2 = twoStackshelper(sum , a , Arrays.copyOfRange(b , 1 ,b.length) , b[0] + sumtotal , counter + 1);

        return Math.max(ans1 , ans2);
    }
}
