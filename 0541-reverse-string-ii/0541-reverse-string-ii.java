class Solution 
{
    public static void Swap(char[] ch, int left, int right)
    {
        while(left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k)
    {
        int len = s.length();

        char[] ch = s.toCharArray();

        for(int i=0; i<len; i=i+2*k)
        {
            int right = Math.min(i+k-1, ch.length-1);
            Swap(ch,i, right);
        }

        return new String(ch);

    }
}