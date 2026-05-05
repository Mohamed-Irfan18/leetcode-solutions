import java.util.Arrays;
class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int len  = nums.length;
        int[] res = new int[len];
        int left =0;
        int right =len-1;
        int pos = len-1;

        while(left <= right)
        {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];

            if(leftSqr > rightSqr)
            {
                res[pos] = leftSqr;
                left++;
            }
            else
            {
                res[pos] = rightSqr;
                right--;
            }
            pos--;
        }

        return res;
    }
}