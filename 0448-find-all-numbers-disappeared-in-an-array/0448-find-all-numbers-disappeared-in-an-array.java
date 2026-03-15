class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            map.put(nums[i],1);
        }
        List<Integer> list = new ArrayList<>();
            for(int j=1; j<=len; j++)
            {
                if(!map.containsKey(j))
                {
                    list.add(j);
                }
            }
        return list;
        
    }
}