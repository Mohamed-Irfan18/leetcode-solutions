class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : map.keySet())
        {
            if(map.get(num) > 1)
            {
                list.add(num);
            }
        }

          HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int n = nums.length;

        int actsum = 0;
        int expsum = n*(n+1)/2;
        for(int num : set)
        {
            actsum += num;
        }
        
        int sum = expsum - actsum;
        list.add(sum);

        int[] res = new int[list.size()];
        int index =0;
        for(int t : list)
        {
            res[index++] = t;
        }

        return res;
    }
}