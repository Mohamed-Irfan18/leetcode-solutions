class Solution 
{
    public int removeDuplicates(int[] nums)
    {
        int len = nums.length;

        int slow =0;
        int count =0;
        
        for(int fast=0; fast<len; fast++)
        {
           if(slow < 2 || nums[fast] != nums[slow-2])
           {
              nums[slow] = nums[fast];
              slow++;

           }
        }

        return slow;
    }
}