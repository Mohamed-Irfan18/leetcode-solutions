class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<len; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                return key;
            }
        }

        return -1;
    }
}