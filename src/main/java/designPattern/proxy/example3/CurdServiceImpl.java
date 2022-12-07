package designPattern.proxy.example3;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-07
 */
public class CurdServiceImpl implements CurdService {

    @Override
    public void add() {
        System.out.println("执行add()");
    }

    @Override
    public void delete() {
        System.out.println("执行delete()");
    }

    @Override
    public void change() {
        System.out.println("执行change()");
    }

    @Override
    public void query() {
        System.out.println("执行change()");
    }
}
