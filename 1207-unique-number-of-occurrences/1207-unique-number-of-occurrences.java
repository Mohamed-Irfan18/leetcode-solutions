class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        int len = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int key : map.values())
        {
            if(set.contains(key))
            {
                return false;
            }
            set.add(key);
        }

        return true;
    }
}