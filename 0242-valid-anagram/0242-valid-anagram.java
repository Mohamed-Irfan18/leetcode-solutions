class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int len1 = s.length();
        int len2 = t.length();

        if(len1 != len2)
        {
            return false;
        }

        int[] res = new int[26];

        for(int i=0; i<len1; i++)
        {
            res[s.charAt(i)-'a']++;
            res[t.charAt(i)-'a']--;
        }

        for(int num : res)
        {
            if(num < 0)
            {
                return false;
            }
        }

        return true;
        
    }
}