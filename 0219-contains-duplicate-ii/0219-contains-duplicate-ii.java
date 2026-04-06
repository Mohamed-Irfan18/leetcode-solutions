class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int some =  map.get(nums[i]);
                if(i - some <= k)
                {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}