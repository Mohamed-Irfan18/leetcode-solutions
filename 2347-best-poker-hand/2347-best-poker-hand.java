class Solution 
{
    public String bestHand(int[] ranks, char[] suits) 
    {
        int len = ranks.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : ranks)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        boolean flush = true;

        for(int i=1; i<suits.length; i++)
        {
            if(suits[i] != suits[0])
            {
                flush = false;
                break;
            }
        }

        if(flush)
        {
            return "Flush"; 
        }

        boolean pair = false;

        for(int num : ranks)
        {
            if(map.get(num) >= 3 )
            {
                return "Three of a Kind";
            }
            else if(map.get(num) >= 2)
            {
                pair = true;
            }
        }

        if(pair)
        {
            return "Pair";
        }


        return "High Card";
    }
}