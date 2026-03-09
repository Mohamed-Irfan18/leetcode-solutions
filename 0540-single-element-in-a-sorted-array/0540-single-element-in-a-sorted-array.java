class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int len = nums.length;
        if(len == 1)
        return nums[0];

        for(int i=0; i<len; i++)
        {
            if(i == 0)
            {
                if(nums[i] != nums[i+1])
                {
                    return nums[i];
                }
            }
            else if(i == len-1)
            {
                if(nums[i] != nums[i-1])
                {
                    return nums[i];
                }
            }
            else
            {
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
                {
                    return nums[i];
                }
            }
        }
        return nums[0];
    }
}