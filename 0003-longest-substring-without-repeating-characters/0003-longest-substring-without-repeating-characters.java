class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int len = s.length();

        HashSet<Character> set = new HashSet<>();

        int left =0;
        int max =0;

        for(int right=0; right<len; right++)
        {
            char ch = s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            if(right-left+1 > max)
            {
                max = right-left+1;
            }

        }
        return max;
    }
}