class Solution 
{
     
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return AtMost(nums,k) - AtMost(nums,k-1);
    }
        public int AtMost(int[] nums, int k)
        {
            int len = nums.length;

        int[] freq = new int[20001];
        int left=0;
        int count =0;
        int total=0;

        for(int right=0; right<len; right++)
        {
            if(freq[nums[right]] == 0)
            {
                count++;
            }
            freq[nums[right]]++;

            while(count > k)
            {
                freq[nums[left]]--;
                if(freq[nums[left]] == 0)
                {
                    count--;
                }
                left++;
            }

            total += right - left + 1;
        }
        return total;
        }
    
}