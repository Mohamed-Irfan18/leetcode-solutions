class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int len = nums.length;

        int currentmax =0;
        int currentmin =0;
        int ans =0;
        int max =0;
        int min = Integer.MAX_VALUE;

        for(int num : nums)
        {
            currentmax = Math.max(num, currentmax +num);
            max = Math.max(max, currentmax);

            currentmin = Math.min(num, currentmin+num);
            min = Math.min(min, currentmin);

            ans = Math.max(max,Math.abs(min));
        }

        return ans;
    }
}