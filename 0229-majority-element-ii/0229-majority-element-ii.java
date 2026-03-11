class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int len = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<len; i++)
        {
            if(list.size() == 0 || list.get(0) != nums[i])
            {
                int count =0;
                for(int j=i; j<len; j++)
                {
                    if(nums[i] == nums[j])
                    {
                        count++;
                    }
                }

                if(count > (len/3))
                {
                    list.add(nums[i]);
                }
            }
            if(list.size() == 2) 
            {
                break;
            }
        }

        return list;
        
    }
}