public class Trapping_Rain_water {

    static int trap(int[] height) {
        int n = height.length;
        int l = 0 , r = n - 1 , leftMax = 0 , rightMax = 0 , result = 0;
        while (l <= r){
            if(height[l] <= height[r]){
                if(height[l] >= leftMax){
                    leftMax = height[l];
                } else {
                    result += leftMax - height[l];
                }
                l++;
            } else {
                if(height[r] >= rightMax){
                    rightMax = height[r];
                } else {
                    result+=  rightMax - height[r];
                }
                r--;
            }
        }
        return  result;

    }
}
