class Solution {
    public boolean isAnagram(String s, String t) {

    //     char s1[]=s.toCharArray();
    //     char s2[]=t.toCharArray();
    //     Arrays.sort(s1);
    //     Arrays.sort(s2);

    //    return Arrays.equals(s1,s2);

    if (s.length() != t.length()) {
            return false;
        }

    int freq[]=new int[26];
   

     for(int i=0;i<s.length();i++)
     {
         freq[s.charAt(i)-'a']++;
         freq[t.charAt(i)-'a']--;
     }

     for(int c:freq){
        if(c!=0){
            return false;
        }
     }
        return true;
    }
}