class Solution 
{
    public String frequencySort(String s) 
    {
        int len = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        HashSet<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int cnt=0; cnt<map.size(); cnt++)
        {
            int max = Integer.MIN_VALUE;
            char sel = ' ';

            for(char ch : map.keySet())
            {
                if(!set.contains(ch) && map.get(ch) > max)
                {
                    max = map.get(ch);
                    sel = ch;
                }
            }

            for(int i=0; i<max; i++)
            {
                sb.append(sel);
            }
            set.add(sel);
        }
        return sb.toString();
    }
}