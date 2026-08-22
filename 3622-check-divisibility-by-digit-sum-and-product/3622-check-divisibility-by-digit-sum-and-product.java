class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int dig = 0;
        int sum = 0;
        int pro = 1;
        int org = n;
        int tot = 0;

        while(n > 0)
        {
            dig = n % 10;
            sum += dig;
            pro *= dig;
            n /= 10;
        }

        tot = sum + pro;

        if(org % tot == 0)
        {
            return true;
        }
        return false;
        
    }
}