package easy;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i : nums) {
            sum += i;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
