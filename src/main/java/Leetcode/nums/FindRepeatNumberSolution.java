package Leetcode.nums;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-27
 */
public class FindRepeatNumberSolution {
    //    public int findRepeatNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.add(nums[i])) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = findFistPosition(nums, target);
        int right = findLastPosition(nums, target);
        if (left == -1) {
            return 0;
        }
        return right - left + 1;
    }
    private  static int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    private  static int findFistPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}
