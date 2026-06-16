class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            int ans = target - nums[i];

            if(map.containsKey(ans))
            {
                return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}