package designPattern.chainOfResponsibility.example2;

/**
 * 基础验证接口
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public abstract class Middleware {

    private Middleware next;

    /**
     * '...' 居然可以这样用啊！！！
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }


    public abstract boolean check(String email, String passwd);


    protected boolean checkNext(String email, String passwd) {
        if (next == null) {
            return true;
        }
        return next.check(email, passwd);
    }

}
