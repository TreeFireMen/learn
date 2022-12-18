package function;

import java.util.function.Consumer;

/**
 * consumer的accept 和 andThen操作
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-16
 */
public class TestConsumer {
    public static void main(String[] args) {
        //定义一个字符串类型数组
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        //调用printInfo方法，传递一个字符串数组，和两个Lambda表达式
        printInfo(array,
                //消费方式:对s进行切割，获取姓名，按照指定的格式输出
                (s) -> {
                    System.out.print("姓名:" + s.split(",")[0]);
                },
                //消费方式:对s进行切割，获取姓别，按照指定的格式输出
                (s) -> {
                    System.out.println(",性别:" + s.split(",")[1]);
                });
    }

    //定义一个方法，参数传递String类型的数组和两个Consumer接口，泛型使用String
    public static void printInfo(String[] array, Consumer<String> one, Consumer<String> two) {
        //遍历字符串数组
        for (int i = 0; i < array.length; i++) {
            //使用andThen方法连接两个Consumer接口，消费字符串
            one.andThen(two).accept(array[i]);
        }
    }
}

