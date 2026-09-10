class Solution 
{
    public int minDeletions(String s) 
    {
        int len = s.length();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }

        int count =0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<26; i++)
        {
            while(freq[i] > 0 && set.contains(freq[i]))
            {
                freq[i]--;
                count++;
            }
            if(freq[i] > 0)
            {
                set.add(freq[i]);
            }
        }
        return count;
    }
}