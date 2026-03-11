class Solution
{
    public int smallestIndex(int[] nums) 
    {
        int len = nums.length;
        int dig =0;

        for(int i=0; i<len; i++)
        {
            int num = nums[i];
            int sum =0;

            while(num > 0)
            {
                dig = num % 10;
                sum += dig;
                num /= 10;
            }

            if(sum == i)
            {
                return i;
            }
        }
        return -1;
    }
}