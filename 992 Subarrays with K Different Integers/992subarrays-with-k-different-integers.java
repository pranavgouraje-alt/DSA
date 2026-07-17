class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        // int c=0,n=nums.length;

        // for(int i=0;i<n;i++)
        // {
        //     HashSet<Integer>set=new HashSet<>();
        //     for(int j=i;j<n;j++)
        //     {
        //         set.add(nums[j]);

        //         if(set.size()==k)
        //         {
        //             c++;
        //         }
        //         else if(set.size()>k)break;
        //     }
        // }

        // return c;

        return atmost(nums,k)-atmost(nums,k-1);
        
    }

    private static int atmost(int arr[],int k)
    {
        int l=0,c=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int r=0;r<arr.length;r++)
        {
            map.put(arr[r],map.getOrDefault(arr[r], 0) + 1);

            while(map.size()>k)
            {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            c=c+(r-l)+1;
        }
     return c;
    }
}