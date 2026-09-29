class Solution 
{
    public boolean repeatedSubstringPattern(String s) 
    {
        int len = s.length();


        for(int size=1; size<=len/2; size++)
        {
            String pattern = s.substring(0,size);

            String result = "";

            for(int i=0; i<len/pattern.length(); i++)
            {
                result = result + pattern;
            }

            if(result.equals(s))
            {
                return true;
            }
        }

        return false;
    }
}