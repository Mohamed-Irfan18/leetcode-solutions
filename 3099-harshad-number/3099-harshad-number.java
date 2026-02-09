class Solution 
{
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int dig =0;
       
        int sum =0;
        int temp =x;

        while(temp >0)
        {
          dig = temp%10;
          sum += dig;
          temp /= 10;
        }
          if(x%sum == 0)   
          {
            return sum;
          }
        
        return -1;
    }
}