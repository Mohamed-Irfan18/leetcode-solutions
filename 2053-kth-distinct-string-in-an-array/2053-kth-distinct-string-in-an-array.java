class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        int len = arr.length;

        HashMap<String,Integer> map = new HashMap<>();

        for(String num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        String ans = "";
        for(String num : arr)
        {
            if(map.get(num) == 1 && k!=0)
            {
                k--;
                ans = num;
            }
        }    

        if(k == 0)
        {
            return ans;
        }    
        else
        {
            return "";
        }
    }
}