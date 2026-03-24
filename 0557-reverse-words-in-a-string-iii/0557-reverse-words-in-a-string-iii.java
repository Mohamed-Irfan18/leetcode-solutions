class Solution 
{
    public String reverseWords(String s) 
    {
        int len = s.length();
        String[] res = s.split(" ");
        String result = "";

        for(String wrd : res)
        {
            String rev = "";
            for(int i=wrd.length()-1; i>=0; i--)
            {
                rev += wrd.charAt(i);
            }
            result += rev + " ";
        }
        return result.trim();
    }
}