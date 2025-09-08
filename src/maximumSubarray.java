public class maximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            max = Math.max(sum, max);
            if (sum<0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1};
        System.out.println(maxSubArray(arr));
    }
}
