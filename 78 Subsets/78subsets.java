class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        issubset(0,nums,ans,new ArrayList<>());
        return ans;
        
    }
   
   private void issubset(int i,int nums[],List<List<Integer>>ans,List<Integer>temp)
   {
    ans.add(new ArrayList<>(temp));

    for(int j=i;j<nums.length;j++)
    {
        temp.add(nums[j]);
        issubset(j+1,nums,ans,temp);
        temp.remove(temp.size() - 1);
    }  
   }

}