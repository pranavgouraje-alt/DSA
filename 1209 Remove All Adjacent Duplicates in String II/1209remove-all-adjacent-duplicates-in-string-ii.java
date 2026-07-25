class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder str=new StringBuilder();
        Stack<Integer>countst=new Stack<>();

        for(char ch:s.toCharArray())
        {
            int len=str.length();

            if(len>0&&str.charAt(len-1)==ch)
            {
                countst.push(countst.pop()+1);
            }
            else{
                countst.push(1);
            }

            str.append(ch);

            if(countst.peek()==k)
            {
                str.delete(str.length()-k,str.length());
                countst.pop();
            }
        }
        return str.toString();
    }
}