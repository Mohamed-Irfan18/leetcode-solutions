class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int len = s.length();

        int count =0;

        for(int i=0; i<k; i++)
        {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        int max = count;

        for(int i=k; i<len; i++)
        {
            char coming = s.charAt(i);
            char leaving = s.charAt(i-k);

            if(coming == 'a' || coming == 'e' || coming == 'i' || coming == 'o' || coming == 'u')
            {
                count++;
            }

            if(leaving == 'a' || leaving == 'e' || leaving == 'i' || leaving == 'o' || leaving == 'u')
            {
                count--;
            }

            if(count > max)
            {
                max = count;
            }
        }
        return max;
    }
}