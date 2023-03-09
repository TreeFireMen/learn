package Leetcode.stringTopic;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-27
 */
public class ReverseLeftWordsSolution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        if (n > s.length()) {
            return s;
        }
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        String s1 = s.substring(0, n);
        return sb.append(s1).toString();
    }
}
