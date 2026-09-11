class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int len = nums.length;

        int[] res = new int[len];
        int index =0;

        for(int i=0; i<len; i++)
        {
            int count =0;

            for(int j=0; j<len; j++)
            {
                if(nums[j] != nums[i] && nums[j] <= nums[i])
                {
                    count++;
                }
                res[i] = count;
            }
        }

        return res;
        
    }
}