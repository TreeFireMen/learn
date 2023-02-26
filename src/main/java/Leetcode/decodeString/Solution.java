package Leetcode.decodeString;

import java.util.Stack;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-17
 */
public class Solution {
    public static void main(String[] args) {
      System.out.println(decodeString("2[a2[bc]]"));
    }

    public static String decodeString(String s) {
        StringBuffer ans = new StringBuffer();
        Stack<Integer> multiStack = new Stack<>();
        Stack<StringBuffer> ansStack = new Stack<>();
        int multi = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) multi = multi * 10 + c - '0';
            else if (c == '[') {
                ansStack.add(ans);
                multiStack.add(multi);
                ans = new StringBuffer();
                multi = 0;
            } else if (Character.isAlphabetic(c)) {
                ans.append(c);
            } else {
                StringBuffer ansTmp = ansStack.pop();
                int tmp = multiStack.pop();
                for (int i = 0; i < tmp; i++) ansTmp.append(ans);
                ans = ansTmp;
            }
        }
        return ans.toString();
    }
}
