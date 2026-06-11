class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int len = moves.length();

        int x=0;
        int y=0;

        for(char i : moves.toCharArray())
        {
            if(i == 'R') 
            {
                x++;
            }
            else if(i == 'L')
            {
                x--;
            }
            else if(i == 'U')
            {
                y++;
            }
            else if(i == 'D')
            {
                y--;
            }
        }

        return x==0 && y==0;
        
    }
}