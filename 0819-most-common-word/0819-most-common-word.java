class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        String[] arr = paragraph.toLowerCase().split("[^a-z]+");

        HashSet<String> set = new HashSet<>();
        for(String s : banned)
        {
            set.add(s);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr)
        {
            if(!set.contains(s))
            {
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }

        String ans = "";
        int max =0;

        for(String num : map.keySet())
        {
            if(map.get(num) > max)
            {
                max = map.get(num);
                ans = num;
            }
        }

        return ans;
    
    }
}