class Solution 
{
    public int findLucky(int[] arr) 
    {
        int len = arr.length;
        int max = -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet())
        {
            if(key == map.get(key))
            {
                max = Math.max(max, key);
            }
        }

        return max;
        
    }
}