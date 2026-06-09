class Solution {
    public int lengthOfLastWord(String s) {
        //int length=0;
        String arr[]=s.split(" ");
        int arrle=arr.length-1;
        return arr[arrle].length();
        
    }
}