import java.util.Arrays;
class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
      int len = nums.length;

      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num : nums)
      {
        map.put(num,map.getOrDefault(num,0)+1);
      }

      List<Integer> list = new ArrayList<>();

      for(int num : map.keySet())
      {
        if(map.get(num) == 2)
        {
            list.add(num);
        }
      }
        
        return list;
    }
}