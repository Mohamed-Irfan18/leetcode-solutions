class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int num : nums)
        {
            if(map.get(num) == 1)
            {
                return num;
            }
        }
        return -1;
    }
}