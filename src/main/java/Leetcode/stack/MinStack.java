package Leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-22
 */
public class MinStack {

     Deque<Integer> xStack;
     Deque<Integer> minStack;


    /** initialize your data structure here. */
    public MinStack() {
        xStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
