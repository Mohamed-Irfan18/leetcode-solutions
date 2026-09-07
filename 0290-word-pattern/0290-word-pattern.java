class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        int len1 = pattern.length();

        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        String arr[] = s.trim().split("\\s+");

        if(len1 != arr.length)
        {
            return false;
        }

        for(int i=0; i<len1; i++)
        {
            char ch = pattern.charAt(i);
            String word = arr[i];

            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(arr[i]))
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(word))
                {
                    return false;
                }
                 map.put(ch, arr[i]);
                 set.add(word);
            }
        }
        return true;
    }
}