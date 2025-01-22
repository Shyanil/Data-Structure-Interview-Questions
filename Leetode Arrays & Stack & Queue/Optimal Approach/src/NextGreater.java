//import java.util.*;
//
//public class NextGreater {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        // Map to store the next greater element for each number in nums2
//        Map<Integer, Integer> map = new HashMap<>();
//        // Stack to keep track of elements for which we are finding the next greater element
//        Stack<Integer> stack = new Stack<>();
//
//        // Traverse nums2 to determine the next greater element for each number
//        for (int i = 0; i < nums2.length; i++) {
//            int currE = nums2[i];
//
//            // While stack is not empty and the current number is greater than the top of the stack
//            while (!stack.isEmpty() && stack.peek() < currE) {
//                // Map the smaller number (stack top) to the current number
//                map.put(stack.pop(), currE);
//            }
//
//            // Push the current number onto the stack
//            stack.push(currE);
//        }
//
//        // For any remaining elements in the stack, there is no greater element
//        while (!stack.isEmpty()) {
//            map.put(stack.pop(), -1);
//        }
//
//        // Build the result array for nums1 using the map
//        int[] result = new int[nums1.length];
//        for (int j = 0; j < nums1.length; j++) {
//            result[j] = map.get(nums1[j]);
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Example input
//        int[] nums1 = {4, 1, 2};
//        int[] nums2 = {1, 3, 4, 2};
//
//        // Get the result from the nextGreaterElement method
//        int[] result = solution.nextGreaterElements(nums1, nums2);
//
//        // Print the result
//        System.out.println("Next Greater Elements for nums1:");
//        System.out.println(Arrays.toString(result));
//    }
//}
