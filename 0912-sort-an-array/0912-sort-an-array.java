class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        MergeSort(nums, 0, nums.length-1);

        return nums;
    }
    public static void MergeSort(int[] nums, int left, int right)
    {
        int len = nums.length;

        if(left >= right)
        {
            return;
        }

        int mid = (left+(right-left)/2);

        MergeSort(nums, left, mid);
        MergeSort(nums, mid+1, right);
        Merge(nums,left,mid, right);
    }

    public static void Merge(int[] nums, int left, int mid, int right)
    {
        int[] temp = new int[right-left+1];

        int i=left;
        int j=mid+1;
        int ind =0;

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