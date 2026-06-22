class Solution 
{
    public String removeTrailingZeros(String num) 
    {
        int i = num.length()-1; //i=

        while(i >= 0)
        {
            if(num.charAt(i) == '0')
            {
                i--;
            }
            else
            {
                break;
            }
        }

        String ans = num.substring(0, i+1);
        return ans;

       
       
    }
}