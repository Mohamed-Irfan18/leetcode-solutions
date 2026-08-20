class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int len = nums.length;
        
        int[] res = new int[k];
        int index =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);   
        }

        HashSet<Integer> set = new HashSet<>();

        for(int cnt=0; cnt<k; cnt++)
        {
            int max = Integer.MIN_VALUE;
            int sel = -1;

            for(int key : map.keySet())
            {
               if(!set.contains(key) && map.get(key) > max)
               {
                   max = map.get(key);
                   sel = key;
               }
            }
            set.add(sel);

            res[index++] = sel;
        }

        return res;


    }
}