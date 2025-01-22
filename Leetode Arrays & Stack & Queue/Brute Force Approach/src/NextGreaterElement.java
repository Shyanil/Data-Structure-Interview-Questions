public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1 , int [] nums2){
        int[] ngE = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            ngE[i] = nums2[k];
                            break;
                        }
                    }

                    if (ngE[i] == 0) {
                        ngE[i] = -1;

                    }
                    break;
                }

            }
        }
        return ngE;
    }

    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();

        // Test case 1
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result1 = solution.nextGreaterElement(nums1, nums2);
        System.out.println("Result 1: " + java.util.Arrays.toString(result1));

        // Test case 2
        int[] nums1_2 = {2, 4};
        int[] nums2_2 = {1, 2, 3, 4};
        int[] result2 = solution.nextGreaterElement(nums1_2, nums2_2);
        System.out.println("Result 2: " + java.util.Arrays.toString(result2));
    }
    }

