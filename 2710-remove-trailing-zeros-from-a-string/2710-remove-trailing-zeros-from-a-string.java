class Solution 
{
    public String removeTrailingZeros(String num) 
    {
        int i = num.length()-1;

        while(i >= 0 && num.charAt(i) == '0')
        {
            i--;
        }

        String ans = num.substring(0, i+1);
        return ans;

       
       
    }
}