class Solution 
{
    public String reverseWords(String s) 
    {
        String[] res = s.split("\\s+");
        int len = res.length;


        int left = 0;
        int right = len -1;

        while(left < right)
        {
            String temp = res[left];
            res[left] = res[right];
            res[right] = temp;

            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();

        for(String num : res)
        {
            sb.append(num + " ");
        }

        return sb.toString().trim();

    }
}