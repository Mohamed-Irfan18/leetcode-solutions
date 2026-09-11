class Solution 
{
    public String frequencySort(String s) 
    {
        int len = s.length();

        int[] freq = new int[128];
        for(char ch : s.toCharArray())
        {
            freq[ch]++;
        }
        
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length())
        {
            int max =0;
            char c = ' ';

            for(int i=0; i<128; i++)
            {
                if(freq[i] > max)
                {
                     max = freq[i];
                     c = (char)i;
                }
            }
            
                for(int j=0; j<max; j++)
                {
                    sb.append(c);
                }
                freq[c] =0;
        }
        return sb.toString();
    }
}