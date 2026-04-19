class Solution
{
    public int[] singleNumber(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                list.add(key);
            }
        }

        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            res[i] = list.get(i);
        }
        return res;
        
    }
}