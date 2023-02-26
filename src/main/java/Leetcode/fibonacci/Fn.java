package Leetcode.fibonacci;

/**
 * 动态规划
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-20
 */
public class Fn {

    public static int fib(int n) {
        final int MOD = 1000000007;
        if (n < 2) {
            return n;
        }
        int p, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % MOD;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
    }


}
