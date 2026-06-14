class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character>stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<=s.length()-1;i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
            if(!stack.isEmpty())
            {
                sb.append(c);
            }
            stack.push(c);
            }
            else{
                    stack.pop();

                     if(!stack.isEmpty())
                     {
                        sb.append(c);
                     }
                
            }
        }
        return sb.toString();
    }
}