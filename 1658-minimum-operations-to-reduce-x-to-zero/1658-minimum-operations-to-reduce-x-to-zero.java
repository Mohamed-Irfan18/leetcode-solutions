class Solution 
{
    public int minOperations(int[] nums, int x) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int tot = 0;

        for(int num : nums)
        {
            tot += num;
        }

        int tar = tot -x;

        if(tar == 0)
        {
            return len;
        }

        int max =-1;
        int sum =0;

        for(int i=0; i<len; i++)
        {
            sum += nums[i];

            int req = sum - tar;

            if(map.containsKey(req))
            {
                max = Math.max(max, i-map.get(req));
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }

        if(max == -1)
        {
            return -1;
        }
        else
        {
            return len-max;
        }
    }
}