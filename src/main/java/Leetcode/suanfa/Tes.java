package Leetcode.suanfa;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-20
 */
public class Tes {
    public static void main(String[] args) {
        int[] a = new int[]{-3, -2, -1, 0, 1, 2, 5};
      int[] ints = sortedSquares(a);
      for (int anInt : ints) {
        System.out.println(anInt);
      }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[index--] = nums[left] * nums[left++];
            } else {
                res[index--] = nums[right] * nums[right--];
            }
        }
        return res;
    }

}
