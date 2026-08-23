class Solution 
{
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    public static int atMost(int[] nums, int k)
    {
        int len = nums.length;
        
        int left =0;
        int count =0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right=0; right<len; right++)
        {
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            while(map.size() > k)
            {
                int old = nums[left];
                map.put(old, map.get(old)-1);
                if(map.get(old) == 0)
                {
                    map.remove(old);
                }
                left++;
            }
             count += right-left+1;
        }
        return count;
    }
}