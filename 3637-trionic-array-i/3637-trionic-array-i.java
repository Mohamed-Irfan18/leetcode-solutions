class Solution 
{
    public boolean isTrionic(int[] nums) 
    {
        int len = nums.length;

        if(len < 0) return false;

        int i =1;

        while(i < len && nums[i] > nums[i-1])
        {
          i++;
        }

        if(i == len || i==1) return false;

        int downstart = i;

        while(i < len && nums[i] < nums[i-1])
        {
          i++;
        }

        if(i == len || i == downstart) return false;

        while(i < len && nums[i] > nums[i-1])
        {
          i++;
        }

        return i==len;
    }
}