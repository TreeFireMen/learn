package Leetcode.stringTopic;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-27
 */
public class ReplaceSpaceSolution {
    public String replaceSpace(String s) {
//        return s.replace(" ", "%20");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
