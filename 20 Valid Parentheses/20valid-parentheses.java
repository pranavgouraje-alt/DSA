class Solution {
    public boolean isValid(String s) {
        /*int length=0;
        do{
         length=s.length();
        if(s.contains("[]"))
        {
            s=s.replace("[]","");
        }
          else if(s.contains("()"))
        {
            s=s.replace("()","");
        }
          else if(s.contains("{}"))
        {
            s=s.replace("{}","");
        }}
        while(s.length() <length);
        
            return s.isEmpty();
       */
      Stack<Character> stack = new Stack<>();
      for(char ch:s.toCharArray())
      {
       if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
        else{
            if(stack.isEmpty())
            return false;      

         char top=stack.pop();
       if ((ch == ')' && top != '(') || 
                    (ch == ']' && top != '[') || 
                    (ch == '}' && top != '{')) {
                    return false; 
                }
        }
      }
      return stack.isEmpty();
    }
}