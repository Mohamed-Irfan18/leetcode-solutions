class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int len = nums.length;
        
        int[] res = new int[len];
        int posindex =0;
        int negindex =1;

        for(int i=0; i<len; i++)
        {
          if(nums[i] < 0)
          {
            res[negindex] = nums[i];
            negindex += 2;
          }
          else
          {
           res[posindex] = nums[i];
           posindex += 2;
          }
        }
        return res;
    }
}