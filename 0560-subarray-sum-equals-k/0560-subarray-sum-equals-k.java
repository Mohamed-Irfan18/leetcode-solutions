class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
      int len = nums.length;
      int count =0;
    
     // HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<len; i++)
      {
         int sum =0;
         for(int j=i; j<len; j++)
         {
           sum += nums[j];
           if(sum == k)
           {
              count++;
           }
         }
      }
      return count;
    }
}