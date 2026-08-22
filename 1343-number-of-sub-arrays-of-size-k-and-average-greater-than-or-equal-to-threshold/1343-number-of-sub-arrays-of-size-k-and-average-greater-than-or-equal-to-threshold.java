class Solution 
{
    public int numOfSubarrays(int[] arr, int k, int threshold)
    {
        int len = arr.length;

        int avg = 0;
        int count =0;
        int sum =0;

        for(int i=0; i<k; i++)
        {
            sum += arr[i];
        }
        
        if(sum >= k * threshold)
        {
            count++;
        }

        for(int i=k; i<len; i++)
        {
            sum = sum - arr[i-k] + arr[i];

            if(sum >= k * threshold)
            {
                count++;
            }
        }

        return count;
        
    }
}