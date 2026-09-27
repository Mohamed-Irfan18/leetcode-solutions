class Solution 
{
    public int maxSubarraySumCircular(int[] nums) 
    {
        int len = nums.length;

        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        int current_max =0;
        int current_min =0;
        int sum =0;

        int circular_sum =0;

        for(int num : nums)
        {
            current_max = Math.max(num, current_max + num);
            max = Math.max(max, current_max);

            current_min = Math.min(num, current_min+num);
            min = Math.min(min, current_min);

            sum += num;

            circular_sum = sum - min;

        }

        if(max < 0)
        {
            return max;
        }
        else
        {
            return Math.max(max,circular_sum);
        }
        
    }
}