public class BinarySerchAlgorithm3 {
    //LeetCode - 744. Find Smallest Letter Greater Than Target
    public static void main(String[] args) {
        char c[]={'c','f','j'};
        // char targert = 'j'; after j there is no value thats why role back to c or warpwround
        char targert = 'c'; 
        char result = nextGreatestLetter(c,targert);
        System.out.println(result);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start<=end) {
            //finding smallest element in array thats grether or equals to target 
            int mid = start + (end - start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // its give 2 points 1) fornormal return start for celling problem (2%4) = 2 remin same start
    }                                          // but send point for roll back if i give j after j its dont value here and thats why 4%4 = 0 
                                               // 4 is start(becz incresing value start = mid + 1; )  4 is length of array then gives me start index 
                                               // its 0 then return c
}

