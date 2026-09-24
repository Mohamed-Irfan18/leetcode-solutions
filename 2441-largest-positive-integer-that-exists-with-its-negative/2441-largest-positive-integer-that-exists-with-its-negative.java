class Solution 
{
    public int findMaxK(int[] nums) 
    {
        int len = nums.length;

        int ans =-1;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        for(int num : set)
        {
            if(num > 0 && set.contains(-num))
            {
                ans = Math.max(ans,num);
            }
        }
        return ans;
    }
}