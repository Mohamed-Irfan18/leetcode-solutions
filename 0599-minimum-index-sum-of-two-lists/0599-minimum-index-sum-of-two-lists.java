class Solution 
{
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        int len1 = list1.length;
        int len2 = list2.length;

        int minSum = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<len1; i++)
        {
            map.put(list1[i], i);
        }        
        List<String> list = new ArrayList<>();
        for(int j=0; j<len2; j++)
        { 
            String str = list2[j];
            if(map.containsKey(str))
            {
                int i = map.get(str);
            int sum = i+j;
            if(sum < minSum)
            {
                minSum = sum;
                list.clear();
                list.add(str);
            }
            else if(sum == minSum)
            {
                list.add(str);
            }
            }
        }

        return list.toArray(new String[0]);



    }
}