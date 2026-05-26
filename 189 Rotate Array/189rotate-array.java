class Solution {

    public void rotate(int[] nums, int k) {

        int last = nums.length;

        k = k % last;

        reverse(nums, 0, last - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, last - 1);

        for(int i = 0; i < last; i++) {

            System.out.print(nums[i] + " ");
        }
    }

    public void reverse(int[] nums, int start, int end) {

        while(start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}