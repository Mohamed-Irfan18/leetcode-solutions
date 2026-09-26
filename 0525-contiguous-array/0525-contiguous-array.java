class Solution 
{
    public int findMaxLength(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum =0;
        int max =0;

        for(int i=0; i<len; i++)
        {
            if(nums[i] == 0)
            {
                sum += -1;
            }
            else
            {
                sum += 1;
            }

            if(map.containsKey(sum))
            {
                int length = i - map.get(sum);
                if(length > max)
                {
                    max = length;
                }
            }
            else
            {
                map.put(sum,i);
            }
        }
        return max;
    }
}