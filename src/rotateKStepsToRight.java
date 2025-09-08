public class rotateKStepsToRight {
    // BruteForce
    public void rotate_bruteforce(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int temp = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
    }

    // Optimised
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
