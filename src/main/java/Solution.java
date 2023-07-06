public class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int slidingSum = nums[0];
        while (left <= right && right < nums.length + 1) {
            if (slidingSum == target) {
                minLength = Math.min(minLength, right - left + 1);
                if (minLength == 1) return 1;
                slidingSum -= nums[left];
                left++;

            } else if (slidingSum < target && right != nums.length - 1) {

                right++;
                slidingSum += nums[right];
            } else if (slidingSum < target && right == nums.length - 1) {
                break;
            } else if (slidingSum > target) {
                minLength = Math.min(minLength, right - left + 1);
                if (minLength == 1) return 1;
                slidingSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
