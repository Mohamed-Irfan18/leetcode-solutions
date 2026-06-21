class Solution 
{
    public long maximumSubarraySum(int[] nums, int k) 
    {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum =0;

        for(int i=0; i<k; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            sum += nums[i];
        }

        long max =0;

        if(map.size() == k)
        {
            max = sum;
        }

        for(int i=k; i<len; i++)
        {
            int leaving = nums[i-k];
            map.put(leaving, map.get(leaving)-1);

            if(map.get(leaving) == 0)
            {
                map.remove(leaving);
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            sum = sum - nums[i-k] + nums[i];

            if(map.size() ==  k)
            {
                max = Math.max(max, sum);
            }
        }

        return max;

    }
}