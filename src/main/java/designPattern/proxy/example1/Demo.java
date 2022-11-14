package designPattern.proxy.example1;

/** 和装饰器的区别：一个是增强功能，一个是加以控制
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class Demo {
    /**
     * 例子体会： 该代理模式将步骤：从磁盘中读取数据  只需要执行一次
     *          在代理类中将具体功能类成为<b>成员变量</b>
     */
    public static void main(String[] args) {
        ProxyImage aa = new ProxyImage("aa");
        aa.display();
        System.out.println("");
        aa.display();
    }
}
