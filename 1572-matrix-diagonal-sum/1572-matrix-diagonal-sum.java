class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        
        int sum = 0;
        int start =0; 
        int end =mat.length-1;

        for(int i=start; i<mat.length; i++)
        {
           if(start == end) 
           {
             sum -= mat[i][start];
           }
            sum += mat[i][start] + mat[i][end];
            start++;
            end--;
        }
        return sum;
    }
}