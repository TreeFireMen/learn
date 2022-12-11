package reflect.testAnnotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-11
 */
public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("reflect.testAnnotation.Student");

        Table a1 = (Table) c1.getAnnotation(Table.class);
        System.out.println(a1.value());

        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            TableField annotation = field.getAnnotation(TableField.class);
            System.out.println(annotation.name());
            System.out.println(annotation.type());
            System.out.println(annotation.length());
        }

    }


}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface TableField {
    String name();
    String type();
    int length();
}
