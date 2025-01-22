import java.util.ArrayList;
import java.util.List;

public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= nums.length - k; i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 0; j <= i + k - 1; j++){
                maxi = Math.max(maxi , nums[j]);
            }
            list.add(maxi);
        }

        int[] result = new int[list.size()];
        for(int l = 0; l< list.size() ; l++){
            result[l] = list.get(l);
        }
        return result;
    }
}

/*
*
* Complexity
Time Complexity:
Outer loop runs O(n - k + 1) times.
Inner loop runs O(k) times for each iteration of the outer loop.
Total complexity = O((n - k + 1) * k) ≈ O(n * k) in the worst case.
Space Complexity:
Storing results in the list and result[], so the space complexity is O(n).
* */