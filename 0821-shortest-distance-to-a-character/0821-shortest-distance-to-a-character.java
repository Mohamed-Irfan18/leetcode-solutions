class Solution 
{
    public int[] shortestToChar(String s, char c) 
    {
        int len = s.length();

        int[] res = new int[len];
        int index =0;

        for(int i=0; i<len; i++)
        {
            int min = Integer.MAX_VALUE;

            if(s.charAt(i) == c)
            {
                res[i] = 0;
            }

            for(int j=0; j<len; j++)
            {
                if(s.charAt(j) == c)
                {
                    int dis = Math.abs(i-j);

                    if(dis < min)
                    {
                        min = dis;
                    }
                }
            }

            res[i] = min;
        }

        return res;
        
    }
}