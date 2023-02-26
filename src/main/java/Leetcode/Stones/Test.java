package Leetcode.Stones;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import org.apache.commons.collections4.CollectionUtils;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-18
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue  = new PriorityQueue<>(Comparator.comparingInt(a -> -a));
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);
        queue.offer(2);
//        for (Integer integer : queue) {
//            System.out.println(integer);
//        }
        int[] ints = new int[]{5,3,2,1};
        lastStoneWeight(ints);

    }

    public static int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for (; index >= 1; index--){

            Arrays.sort(stones);
            stones[index-1] = stones[index] - stones[index-1];
        }

        return stones[0];
    }
}
