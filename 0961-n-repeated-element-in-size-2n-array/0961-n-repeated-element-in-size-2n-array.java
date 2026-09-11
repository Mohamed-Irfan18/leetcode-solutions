class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        int ans =-1;
        for(int num : map.keySet())
        {
            if(map.get(num) == (len/2))
            {
                ans = num;
            }
        }
        return ans;
    }
}