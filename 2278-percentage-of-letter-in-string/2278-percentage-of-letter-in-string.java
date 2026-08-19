class Solution 
{
    public int percentageLetter(String s, char letter) 
    {
        int len = s.length();
        
        int ans = 0;
        int count = 0;
        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);
            if(ch == letter)
            {
                count++;
            } 
        }

        ans = count * 100 / len;

        return ans;
        
    }
}