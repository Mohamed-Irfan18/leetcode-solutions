class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        int len = nums.length;

        HashSet<Integer> set = new HashSet<>();

        int left =0;
        int sum =0;
        int max =0;

        for(int right=0; right<len; right++)
        {
            sum += nums[right];

            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);

            if(sum > max)
            {
                max = sum;
            }
        }

        return max;
    }
}