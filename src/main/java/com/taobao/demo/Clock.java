package com.taobao.demo;

/**
 * 报时的钟
 */
public class Clock {

    // 日期格式化
    private final java.text.SimpleDateFormat clockDateFormat
            = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 状态检查
     */
    final void checkState() {
        throw new IllegalStateException("STATE ERROR!");
    }

    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    final java.util.Date now() {
        return new java.util.Date();
    }

    /**
     * 报告时间
     *
     * @return 报告时间
     */
    final String report() {
        checkState();
        return clockDateFormat.format(now());
    }

    /**
     * 循环播报时间
     */
    final void loopReport() throws InterruptedException {
        while (true) {
            try {
                System.out.println(report());
            } catch (Throwable cause) {
                cause.printStackTrace();
            }
            Thread.sleep(1000);
        }
    }

     public static void newObjectForEver() {
        while (true) {
            Object o = new Object();
            System.out.println(o);
        }
     }

    public static void main(String... args) throws InterruptedException {
//        new Clock().loopReport();
        newObjectForEver();
    }

}