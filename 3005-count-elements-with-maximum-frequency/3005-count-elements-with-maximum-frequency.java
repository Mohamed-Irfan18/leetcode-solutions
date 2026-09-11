class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int max =0;
        int sum =0;

        for(int num : map.keySet())
        {
           if(map.get(num) > max)
           {
              max = map.get(num);
           }
        }

        for(int num : map.keySet())
        {
            if(map.get(num) == max)
            {
                sum += map.get(num);
            }
        }

        return sum;
    }
}