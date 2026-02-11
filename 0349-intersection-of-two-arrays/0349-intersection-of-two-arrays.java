import java.util.*;
class Solution
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> st = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for(int num : nums1)
        {
           st.add(num);
        }

        for(int num : nums2)
        {
           if(st.contains(num))
           {
             res.add(num);
           }
        }
        
        int[] result = new int[res.size()];
        int index =0;

        for(int num : res)
        {
           result[index++] = num;
        }
        return result;
    }
}