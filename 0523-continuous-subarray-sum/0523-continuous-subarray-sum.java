class Solution
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum =0;
        
        for(int i=0; i<len; i++)
        {
            sum += nums[i];

            int req = sum %k;

            if(map.containsKey(req))
            {
                if(i - map.get(req) >= 2)
                {
                    return true;
                }
            }
            else
            {
                map.put(req,i);
            }
        }
        return false;
    }
}