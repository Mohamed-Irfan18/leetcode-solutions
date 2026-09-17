class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int len = gain.length;

        int max = 0;
        int alt =0;
        int ans =0;

        for(int i=0; i<len; i++)
        {
            ans = ans + alt + gain[i];
            if(ans > max)
            {
                max = ans;
            }
        }

        return max;
    }
}