package designPattern.proxy.example3;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-07
 */
public class CurdProxy implements CurdService {

    private CurdServiceImpl curdServiceImpl;

    public void setCurdServiceImpl(CurdServiceImpl curdServiceImpl) {
        this.curdServiceImpl = curdServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        curdServiceImpl.add();
    }

    @Override
    public void delete() {
        log("delete");
        curdServiceImpl.delete();
    }

    @Override
    public void change() {
        log("change");
        curdServiceImpl.change();
    }

    @Override
    public void query() {
        log("query");
        curdServiceImpl.query();
    }

    private void log(String name) {
        System.out.println("log日志输出： " + name);
    }
}
