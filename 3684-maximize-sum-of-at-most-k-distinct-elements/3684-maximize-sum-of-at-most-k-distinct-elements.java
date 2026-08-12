class Solution 
{
    public int[] maxKDistinct(int[] nums, int k) 
    {
        int len = nums.length;

        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<len; j++)
            {
                if(nums[j] < nums[i])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=nums.length-1; i>=0; i--)
        {
            if(set.size() < k)
            {
                set.add(nums[i]);
            }
        }

        int[] res = new int[set.size()];
        int ind =0;

        for(int t : set)
        {
            res[ind++] = t;
        }
        return res;
    }
}