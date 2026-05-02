class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int len = s.length();
        int left = 0;
        int[] freq = new int[26];
        int max = 0;
        int maxFreq = 0;

        for(int right=0; right<len; right++)
        {
            freq[s.charAt(right) -'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);

            while((right-left+1) -maxFreq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right-left+1);
        }

        return max;
    }
}