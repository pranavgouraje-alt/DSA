class Solution {
    public String interpret(String command) {

        // StringBuilder s=new StringBuilder();

        // for(int i=0;i<=command.length();i++)
        // {

        // }
        command=command.replace("()","o");
        command=command.replace("(al)","al");

        return command;
        
    }
}