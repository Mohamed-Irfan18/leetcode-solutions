class Solution 
{
    public int equalSubstring(String s, String t, int maxCost) 
    {
        int len1 = s.length();
        int len2 = t.length();

        int left=0;
        int cost = 0;
        int max =0;

        for(int right=0; right<len1; right++)
        {
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            while(cost > maxCost)
            {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            if(right-left+1 > max)
            {
                max = right -left+1;
            }
        }
        return max;
    }
}