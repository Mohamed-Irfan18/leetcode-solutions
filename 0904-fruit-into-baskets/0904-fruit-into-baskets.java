class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int len = fruits.length;

        int[] freq = new int[100000];
        int left=0;
        int count =0;
        int max =0;

        for(int right=0; right<len; right++)
        {
            if(freq[fruits[right]] == 0)
            {
                count++;
            }
            freq[fruits[right]]++;

            while(count > 2)
            {
                freq[fruits[left]]--;

                if(freq[fruits[left]] == 0)
                {
                    count--;
                }
                left++;
            }

            if(right-left+1 > max)
            {
                max = right-left+1;
            }
        }
        return max;
    }
}