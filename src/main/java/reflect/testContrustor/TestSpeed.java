package reflect.testContrustor;

import java.lang.reflect.Method;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-11
 */
public class TestSpeed {
    public static void test01(){
        User user = new User();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            user.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void test02() throws Exception {
        Class c1 = Class.forName("reflect.testContrustor.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        User user = (User) c1.newInstance();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            getName.invoke(user, null);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void test03() throws Exception {
        Class c1 = Class.forName("reflect.testContrustor.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        User user = (User) c1.newInstance();
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            getName.invoke(user, null);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws Exception {
        test01();
        test02();
        test03();
    }


}
