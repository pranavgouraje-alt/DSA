class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        String str=new String();


        for(char ch:s.toCharArray())
        {
            if(!st.isEmpty()&&st.peek()==ch)
            {
                st.pop();
            }else{
                st.push(ch);
               
            }

        }
        StringBuilder sb = new StringBuilder();
           for (char ch : st) {
    sb.append(ch);
}
 str = sb.toString();
 return str;
      
    }
}