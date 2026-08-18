class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> set = new HashSet<>();

        int[] res = new int[len];
        int index = 0;

        for(int cnt=0; cnt<map.size(); cnt++)
        {
            int min = Integer.MAX_VALUE;
            int selec = -1;


            for(int key : map.keySet())
            {
                if(!set.contains(key) && (map.get(key) < min || (map.get(key) == min && key > selec)))
                {
                   min = map.get(key);
                   selec = key;
                }
            }
            for(int i=0; i<min; i++)
            {
                res[index++] = selec;
            }
            set.add(selec);
        }

        return res;
    }
}