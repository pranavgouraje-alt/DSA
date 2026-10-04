class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1;
        if(arr.length==1)
        {
            return 0;
        }

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}