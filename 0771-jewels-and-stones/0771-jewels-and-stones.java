class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        int len = stones.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<jewels.length(); i++)
        {
            char ch = jewels.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int count =0;

        for(int i=0; i<len; i++)
        {
            char ch = stones.charAt(i);
            if(map.containsKey(ch))
            {
                count++;
            }
        }
        return count;
    }
}