class Solution 
{
    public boolean isArraySpecial(int[] nums) 
    {
        int len = nums.length;


        for(int i=1; i<len; i++)
        {
            if((nums[i]%2 ==0) && (nums[i-1] %2 == 0))
            {
                return false;
            } 
            else if((nums[i]%2 !=0) && (nums[i-1]%2 != 0))
            {
                return false;
            }
        }   

        return true;
    }
}