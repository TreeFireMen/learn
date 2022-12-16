package com.basic;

/**
 * 内部类
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-11
 */
public class Outer {
    private int a = 10;

    public void a() {
        System.out.println("this is outer method");
    }

    class Inner {
      public void b() {
          System.out.println(a);
          System.out.println("this is a inner method");
      }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.a();
        Inner inner = outer.new Inner();
        inner.b();
    }
}
// 一个Java类中可以有多个class类，但是只能有一个public class
class B {

}
