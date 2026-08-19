class Solution 
{
    public String frequencySort(String s) 
    {
        int len = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        HashSet<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int cnt=0; cnt<map.size(); cnt++)
        {
            int max = Integer.MIN_VALUE;
            char selec = ' ';

            for(char key : map.keySet())
            {
                if(!set.contains(key) && map.get(key) > max)
                {
                    max = map.get(key);
                    selec = key;
                }
            }

            for(int i=0; i<max; i++)
            {
                sb.append(selec);
            }
            set.add(selec);
        }

        return sb.toString();
    }
}