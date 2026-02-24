class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int len = nums.length;
        int count =0;
        int max = 0;

        for(int i=0; i<len; i++)
        {
          if(nums[i] == 1)
          {
            count++;
            max = Math.max(max,count);
          }
          else
          {
            count =0;
          }
        }
        return max;
    }
}