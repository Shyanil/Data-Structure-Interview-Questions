

public class example {
    // / https://leetcode.com/problems/richest-customer-wealth/description/
    /*Input: letters = ["c","f","j"], target = "a"
Output: "c"*/
    public static void main(String[] args) {
        char letters [] ={'c','f','j'};
        char target = 'e';

        System.out.println(finalDigit(letters, target));
       }
    static char finalDigit(char letters[],char target){
      int start = 0;
      int end = letters.length - 1;
      while (start<=end) {
        int mid = start + (end - start)/2;
        if (target < letters[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
      }
      System.out.println(start % letters.length);
      return letters[start % letters.length];
    }
}

