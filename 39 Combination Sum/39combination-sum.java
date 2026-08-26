class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer> >ans=new ArrayList<>();
        
        combination(0,candidates,target,ans,new ArrayList<>());

        return ans;
        
    }

    private void combination(int index,int arr[],int target,List<List<Integer> >ans,List<Integer>ds)
    {   
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return; 
        }
        if (index == arr.length || target < 0) {
            return;
        }

        if(arr[index]<=target)
        {
            ds.add(arr[index]);
            combination(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
         combination(index+1,arr,target,ans,ds);
    }
}