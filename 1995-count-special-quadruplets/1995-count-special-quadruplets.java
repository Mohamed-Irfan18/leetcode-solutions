class Solution 
{
    public int countQuadruplets(int[] nums)
    {
        int len = nums.length;
        int count =0;
        // Set<Integer> res = new HashSet<>();
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<len; j++)
            {
                for(int k=j+1; k<len; k++)
                {
                    for(int l=k+1; l<len; l++)
                    {
                        if(nums[i] + nums[j] + nums[k] == nums[l])
                        {
                           count++;
                        }
    
                    }
                }
            }
        }
        
        return count;
    }
}