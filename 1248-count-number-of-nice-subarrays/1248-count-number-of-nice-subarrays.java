class Solution 
{
    public int numberOfSubarrays(int[] nums, int k) 
    {
        return Ans(nums,k) - Ans(nums,k-1);
    }

    public int Ans(int[] nums, int k)
    {
        int len = nums.length;

        int odd =0;
        int count =0;
        int left =0;

        for(int right=0; right<len; right++)
        {
            if(nums[right]%2 != 0)
            {
                odd++;
            }

            while(odd > k)
            {
                if(nums[left]%2 != 0)
                {
                    odd--;
                }
                left++;
            }

            count += right-left+1;
        }

        return count;
    }
}