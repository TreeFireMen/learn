package Leetcode.suanfa;

import java.util.Arrays;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-26
 */
public class Rotate {
    public static void main(String[] args) {
        int nums[] = {-1,-100,3,99};
        rotate(nums, 2);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);    }
}
