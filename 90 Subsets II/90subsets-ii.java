
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void generateSubsets(int ind, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));
         for (int i = ind; i < nums.length; i++)
         {
            if (i > ind && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, ans);
            current.remove(current.size() - 1);
        }
    }
}