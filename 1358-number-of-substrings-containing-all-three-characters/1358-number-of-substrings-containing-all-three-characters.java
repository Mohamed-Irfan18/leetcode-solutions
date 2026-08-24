class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int len = s.length();

        int left =0;
        int count =0;
        int a =0; 
        int b =0;
        int c =0;

        for(int right=0; right<len; right++)
        {
            char ch = s.charAt(right);
            if(ch == 'a')
            {
                a++;
            }
            else if(ch == 'b')
            {
                b++;
            }
            else
            {
                c++;
            }

            while(a > 0 && b > 0 && c >0)
            {
                count += len-right;
                char ch1 = s.charAt(left);
                if(ch1 == 'a')
                {
                    a--;
                }
                else if(ch1 == 'b')
                {
                    b--;
                }
                else
                {
                    c--;
                }
                left++;
            }
        }
        return count;
    }
}