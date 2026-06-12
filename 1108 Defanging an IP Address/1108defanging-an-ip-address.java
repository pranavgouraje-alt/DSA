class Solution {
    public String defangIPaddr(String address) {
        //  address=address.replace(".", "[.]");
        //  return address;
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            char c=address.charAt(i);

            if(c == '.')
            {
                rev.append("[.]");
            }
            else
            {
                rev.append(c);
            }

        }

        return rev.toString();

    }
}
