
class Solution
{
    public int countPartitions(int[] nums) 
    {
       int len = nums.length;
       int tot =0;
       int ans =0;

       for(int i: nums)
       {
         tot += i;
       }

       int left =0;
       for(int i=0; i<len-1; i++)
       {
         left += nums[i];
         int right = tot - left;
         if((left - right) % 2 == 0)
         {
           ans++;
         }
       }
       return ans;

    }
}