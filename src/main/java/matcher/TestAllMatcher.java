package matcher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/3
 */
public class TestAllMatcher {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> emptyList = Collections.emptyList();
        boolean b = list.stream().allMatch(l -> l > 0);
        boolean b1 = emptyList.stream().allMatch(l -> l > 0);
        System.out.println(b);
        System.out.println(b1);

    }
}
