package reflect.testClass;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-09
 */
public class Person {

    /**
     * 获取Class类的实例
     * 可以通过类名
     * 通过对象
     * 通过类的路径
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Person p = new Person();
        System.out.println(Person.class.hashCode());
        System.out.println(p.getClass().hashCode());
        System.out.println(Class.forName("reflect.testClass.Person").hashCode());
    }
}
