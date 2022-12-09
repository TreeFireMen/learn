package reflect.testClass;

import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-09
 */
public class MultiClass {
    public static void main(String[] args) {

        /**
         *
         *
         枚举是一种类，注解是一种接口。每个数组还属于一个类，该类反映为 Class 对象，
         该对象由具有相同元素类型和维度数的所有数组共享。
         原始 Java 类型（布尔值、字节、字符、短整型、整型、长整型、浮点数和双精度型）和关键字 void 也表示为 Class 对象
         */
        Class c1 = void.class;
        Class c2 = ElementType.class; // 枚举

        Class c3 = Override.class;  // 注解
        Class c4 = int[].class;
        Class c5 = int[][].class;
        Class c6 = Class.class;
        Class c7 = Comparable.class;
        Class c8 = boolean.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
    }
}
