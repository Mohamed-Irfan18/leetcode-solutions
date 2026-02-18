class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int len = nums.length;

        int max =Integer.MIN_VALUE;
        int prefix =1;
        int suffix =1;
        int ans =0;

        for(int i=0; i<len; i++)
        {
          if(prefix == 0)
          {
            prefix =1;
          }
          if(suffix == 0)
          {
            suffix =1;
          }

          prefix = prefix*nums[i];
          suffix = suffix*nums[len-i-1];
          ans = Math.max(prefix,suffix);
          max = Math.max(max,ans);
        }
        return max;
    }
}