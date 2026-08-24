class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int len = fruits.length;

        int left =0;
        int max =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right=0; right<len; right++)
        {
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            if(map.size() > 2)
            {
                int old = fruits[left];
                map.put(old,map.get(old)-1);
                if(map.get(old) == 0)
                {
                    map.remove(old);
                }
                left++;
            }
            if(right-left+1 > max)
            {
                max = right-left+1;
            }
        }
        return max;
        
    }
}