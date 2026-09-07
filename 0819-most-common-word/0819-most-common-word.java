class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        String[] arr = paragraph.toLowerCase().split("[^a-z]+");
        
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(String s : banned)
        {
            set.add(s);
        }

        for(String t : arr)
        {
            if(!set.contains(t))
            {
                map.put(t,map.getOrDefault(t,0)+1);
            }
        }

        int max =0;
        String ans = "";

        for(String key : map.keySet())
        {
            if(map.get(key) > max)
            {
                max =  map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}