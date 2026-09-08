class Solution 
{
    public String toLowerCase(String s) 
    {
        int len = s.length();

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)((int) ch+32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}