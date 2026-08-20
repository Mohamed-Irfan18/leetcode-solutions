class Solution 
{
    public int[] maxKDistinct(int[] nums, int k) 
    {
        mergeSort(nums,0, nums.length-1);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i=nums.length-1; i>=0; i--)
        {
            if(set.size() < k)
            {
                set.add(nums[i]);
            }
        }

        int[] res = new int[set.size()];
        int index = 0;

        for(int t : set)
        {
            res[index++] = t;
        }

        return res;
    }

    public static void mergeSort(int[] nums, int left, int right)
    {
         if(left >= right)
        {
            return;
        }

        int mid = left + (right-left)/2;

        mergeSort(nums,left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right)
    {
        int[] temp = new int[right-left+1];
        int ind = 0;

        int i =left;
        int j =mid+1;

        while(i<=mid && j<=right)
        {
            if(nums[i] <= nums[j])
            {
                temp[ind++] = nums[i++];
            }
            else
            {
                temp[ind++] = nums[j++];
            }
        }

        while(i<=mid)
        {
            temp[ind++] = nums[i++];
        }

        while(j<=right)
        {
            temp[ind++] = nums[j++];
        }

        for(int x=0; x<temp.length; x++)
        {
            nums[left+x] = temp[x];
        }
    }
}