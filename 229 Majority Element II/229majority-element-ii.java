class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for(int num:nums)
        {
            if(count1==0&&num!=candidate2)
            {
                count1=1;
                candidate1=num;
            }
            else if(count2==0&&num!=candidate1)
            {
                count2=1;
                candidate2=num;
            }
            else if(candidate1==num)
            {
                count1++;
            }
              else if(candidate2==num)
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
     count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        int target = nums.length / 3;
        if (count1 > target) ans.add(candidate1);
        if (count2 > target) ans.add(candidate2);

        return ans;
    }
}