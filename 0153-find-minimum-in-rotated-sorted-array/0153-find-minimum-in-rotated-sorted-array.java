class Solution 
{
    public int findMin(int[] nums) 
    {
      int len = nums.length;

      //int high =len-1;
      int min = Integer.MAX_VALUE;
      //int ele = nums[0];
      for(int i=0; i<len; i++)
      {
        if(nums[i] < min)
        {
          min = nums[i];
        }
      }
      return min;
    }
}