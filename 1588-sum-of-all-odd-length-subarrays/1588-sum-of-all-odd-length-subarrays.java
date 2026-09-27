class Solution 
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int len = arr.length;

        int sum =0;
       

        for(int i=0; i<len; i++)
        {
             int currentsum =0;
            for(int j=i; j<len; j++)
            {
                currentsum += arr[j];
                
                int length = j-i+1;
                if(length%2 != 0)
                {
                    sum += currentsum;
                }
            }
        }        

        return sum;
    }
}