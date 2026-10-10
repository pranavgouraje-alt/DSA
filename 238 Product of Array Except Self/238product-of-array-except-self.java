class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] result = new int[nums.length];

        // for(int i = 0; i < nums.length; i++) {

        //     int product = 1;

        //     for(int j = 0; j < nums.length; j++) {

        //         if(i != j) {
        //             product = product * nums[j];
        //         }
        //     }

        //     result[i] = product;
        // }

        // return result;


    int n = nums.length;
    int[] prefix = new int[n];
    int[] suffix = new int[n];
    int[] res = new int[n];

 
    prefix[0] = 1;
    for (int i = 1; i < n; i++) {
        prefix[i] = prefix[i - 1] * nums[i - 1];
    }

    suffix[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
        suffix[i] = suffix[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < n; i++) {
        res[i] = prefix[i] * suffix[i];
    }

    return res;
}
}

   
      