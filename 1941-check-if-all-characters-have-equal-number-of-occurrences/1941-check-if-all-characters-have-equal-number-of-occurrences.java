class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
        int len = s.length();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int count =0;

        for(int i=0; i<26; i++)
        {
            if(freq[i] > 0)
            {
                count = freq[i];
                break;
            }
        }

        for(int i=0; i<26; i++)
        {
            if(freq[i] > 0 && freq[i] != count)
            {
                return false;
            }
        }

        return true;
    }
}