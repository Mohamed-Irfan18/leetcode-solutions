class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int len = nums.length;

        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums)
        {
            set.add(num);
        }
        int longest = 0;

        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current_num = num;
                int cnt =1;

                while(set.contains(current_num + 1))
                {
                    current_num++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}