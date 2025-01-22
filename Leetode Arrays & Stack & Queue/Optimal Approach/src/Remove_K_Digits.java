import java.util.Stack;

public class Remove_K_Digits {
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && (k > 0) && (stack.peek() > num.charAt(i))){
               stack.pop();
               k--;
            }
            stack.push((num.charAt(i)));
        }

        while (k > 0){
            stack.pop();
            k--;
        }


        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());

        }
        res.reverse();
        int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }

            if (i == res.length()){
                return "0";
            }
            return res.substring(i);
        }
    }

