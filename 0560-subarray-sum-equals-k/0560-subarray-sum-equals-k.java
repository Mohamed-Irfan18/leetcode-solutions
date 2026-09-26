class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
      int len = nums.length;
    
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0,1);
      
      int count =0;
      int sum =0;

      for(int i=0; i<len; i++)
      {
         sum += nums[i];

         int req = sum - k;

         if(map.containsKey(req))
         {
            count += map.get(req);
         }

         map.put(sum, map.getOrDefault(sum,0)+1);
      }

      return count;
    }
}