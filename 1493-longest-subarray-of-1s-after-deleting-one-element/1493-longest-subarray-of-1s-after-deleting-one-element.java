class Solution 
{
    public int longestSubarray(int[] nums) 
    {
       int len = nums.length;
       int zero = 0;
       int left = 0;
       int max = 0;

       for(int right=0; right<len; right++)
       {
          if(nums[right] == 0)
          {
             zero++;
          }

          while(zero > 1)
          {
            if(nums[left] == 0)
            {
                zero--;
            }
            left++;
          }

           if(right-left > max)
           {
            max = right-left;
           }
       }

       return max;
    }
}