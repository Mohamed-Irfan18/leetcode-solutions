class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
      int len = nums.length;

      Arrays.sort(nums);

      int longest =0;
      int current_count =0;
      int last_smaller = Integer.MIN_VALUE;

      for(int i=0; i<len; i++)
      {
         if(nums[i]-1 == last_smaller)
         {
           current_count++;
           last_smaller = nums[i];
         }

         else if(nums[i] != last_smaller)
         {
           current_count =1;
           last_smaller = nums[i];
         }

         longest = Math.max(longest, current_count);
      }
      return longest;
    }
}