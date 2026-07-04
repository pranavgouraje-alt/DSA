class Solution {
    public List<List<Integer>> permute(int[] nums) {
          
        List<List<Integer>>ans=new ArrayList<>();
        perm(nums,0,ans);

        return ans;
        
    }


 public void perm(int[] nums,int index,List<List<Integer>>ans) {


            if(index==nums.length-1)
            {
              List<Integer>current=new ArrayList<>();
              for(int i=0;i<nums.length;i++)
              {
                current.add(nums[i]);
              }
              ans.add(current);
              return ;

            }

           
            for(int i=index;i<nums.length;i++)
            {
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;

                perm(nums,index+1,ans);
                
                 temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
            }

        }
}
       