class Solution 
{
    public int maxArea(int[] height) 
    {
        int len = height.length;
        int i = 0;
        int j = len-1;
        int res = 0;        
        int max = 0;

        while(i < j)
        {
            if(height[i] <= height[j])
            {
                res = height[i] * (j-i);
                i++;
            }
            else
            {
                res = height[j] * (j-i);
                j--;
            }
            if(res > max)
            {
                max = res;
            }
        }
        return max;
    }
}