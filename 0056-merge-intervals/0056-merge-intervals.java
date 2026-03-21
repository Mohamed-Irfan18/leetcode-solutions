class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        int len = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        ArrayList<int[]> res = new ArrayList<>();

        for(int i=0; i<len; i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int j=i+1; j<len; j++)
            {
                if(intervals[j][0] <= end)
                {
                    end = Math.max(end, intervals[j][1]);
                    i=j;
                }
                else
                {
                    break;
                }
            }
            res.add(new int[]{start, end});
        }
        return res.toArray(new int[res.size()][]);
    }
}