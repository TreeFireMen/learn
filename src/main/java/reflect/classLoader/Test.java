package reflect.classLoader;

/**
 * 深刻理解双亲委派模型：
 * https://www.cnblogs.com/hollischuang/p/14260801.html
 *
 * 原理：先检查类是否已经被加载 若没有没加载则调用父类加载器加载 若父类加载器为空则默认使用启动类加载器加载
 *      如果父类加载器失败则调用自己的findClass加载
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-09
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = People.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        classLoader = Class.forName("java.lang.Runnable").getClassLoader();
        System.out.println(classLoader);
        System.out.println(ClassLoader.getSystemClassLoader());

//        System.out.println(System.getProperty("java.class.path"));


    }

}

class People {
    private int id;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
