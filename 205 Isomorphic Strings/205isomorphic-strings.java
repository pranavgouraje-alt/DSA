class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>map2=new HashSet<>();

        for(int i=0;i<=s.length()-1;i++)
        {
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if(map.containsKey(s1))
            {
                if (map.get(s1) != t1) {
                    return false;}
            }
            else{
                if(map2.contains(t1))
                {
                    return false;
                }
            }

            map.put(s1,t1);
            map2.add(t1);
        }
        return true;
    }
}