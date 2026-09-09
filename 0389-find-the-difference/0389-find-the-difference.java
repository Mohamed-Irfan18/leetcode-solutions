class Solution 
{
    public char findTheDifference(String s, String t)
    {
        int len = s.length();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }

        for(char ch : t.toCharArray())
        {
            freq[ch-'a']--;
        }

        for(int i=0; i<26; i++)
        {
            if(freq[i] == -1)
            {
                return (char)(i+'a');
            }
        }

        return ' ';
      
    }
}