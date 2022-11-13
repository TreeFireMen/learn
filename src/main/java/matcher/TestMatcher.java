package matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/3
 */
public class TestMatcher {
    public static void main(String[] args) {
        // \w:数字字母下划线   \d：表示十进制数字
        String regex = "\\w(\\d\\d)(\\w+)";
        String candidate = "$%$%%$x99Super%$%$%Java$%%$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(candidate);
        if (matcher.find()) {
            int gc = matcher.groupCount();
            for (int i = 0; i <= gc; i++)
                System.out.println("group " + i + " :" + matcher.group(i));
        }
    }

}
