package Leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用两个栈实现一个队列
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-20
 */
public class CQueue {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            in2out();
        }
        return outStack.pop();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
