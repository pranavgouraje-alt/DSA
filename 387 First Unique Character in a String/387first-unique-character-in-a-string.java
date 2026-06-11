class Solution {
    public int firstUniqChar(String s) { 
        char arr[]=s.toCharArray();
        char ue=' ';
        Map <Character,Integer> set=new LinkedHashMap<>();
        
        for(char ch:arr)
        {
            set.put(ch, set.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : set.entrySet()) {
             if (entry.getValue() == 1) {
            
           return s.indexOf(entry.getKey());
       
    }
}

     return -1;
    }
}