import java.util.Arrays;
class Solution 
{
    public int mostFrequentEven(int[] nums)
    {
        int len = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int max =0;
        int ans =-1;

        for(int num : map.keySet())
        {
            if (num % 2 == 0 &&
    (map.get(num) > max ||
    (map.get(num) == max && num < ans)))
            {
                max = map.get(num);
                ans = num;
            }
        }

        return ans;
    }
}