class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rlen = matrix.length;
        int clen = matrix[0].length;

        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<clen; j++)
            {
                if(matrix[i][j] == target)
                {
                    return true;
                }
            }
        }   
        return false;
    }
}