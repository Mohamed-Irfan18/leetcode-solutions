class Solution 
{
    public boolean Check(String s, int left, int right)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s)
    {
        int len = s.length();

        int left=0;
        int right=len-1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return Check(s,left+1, right) || Check(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}