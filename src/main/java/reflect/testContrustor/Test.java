package reflect.testContrustor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-11
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        Class c1 = Class.forName("reflect.testContrustor.User");
//        User u1 = (User) c1.newInstance();
//        System.out.println(u1);
//
//        Constructor constructor = c1.getConstructor(String.class, Integer.class);
//        User u2 = (User) constructor.newInstance("小王", 18);
//        System.out.println(u2);
        Class c1 = Class.forName("reflect.testContrustor.User");
        User u1 = (User) c1.newInstance();
//        Method setName = c1.getDeclaredMethod("setName", String.class);
        Field name = c1.getDeclaredField("name");
        // 私有属性不能直接操作，需要关闭程序的安全的检测
        name.setAccessible(true);
        name.set(u1, "zzz");
        System.out.println(u1.getName());
//        setName.invoke(u1, "zzj");
//        System.out.println(u1.getName());



    }
}
