class Solution 
{
    public String reverseWords(String s) 
    {
        int len = s.length();
        //s.trim();
        String[] res = s.split("\\s+");
        String rev = "";

        for(int i = res.length-1; i >=0; i--)
        {
            rev += res[i] + " ";
           
        }
        return rev.trim();
        
    }
}