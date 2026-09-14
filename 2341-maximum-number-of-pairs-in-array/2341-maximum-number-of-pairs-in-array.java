class Solution 
{
    public int[] numberOfPairs(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int sol =0;

        List<Integer> list = new ArrayList<>();

        for(int num : map.keySet())
        {
            sol += map.get(num)/2;
        }

        list.add(sol);
        list.add(len-sol*2);
        
        int[] res = new int[list.size()];
        int ind =0;

        for(int t : list)
        {
            res[ind++] = t;
        }

        return res;
    }
}