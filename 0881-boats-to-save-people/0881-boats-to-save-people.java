class Solution 
{
    public static void mergeSort(int[] people, int left, int right)
    {
        if(left >= right)
        {
            return;
        }

        int mid = left + (right-left)/2;

        mergeSort(people, left, mid);
        mergeSort(people, mid+1, right);
        merge(people,left, mid, right);

    }

    public static void merge(int[] people, int left, int mid, int right)
    {
        int[] temp = new int[right-left+1];

        int i=left;
        int j=mid+1;
        int ind =0;

        while(i<=mid && j<=right)
        {
            if(people[i] <= people[j])
            {
                temp[ind++] = people[i++];
            }
            else
            {
                temp[ind++] = people[j++];
            }
        }

        while(i<=mid)
        {
            temp[ind++] = people[i++];
        }

        while(j<=right)
        {
            temp[ind++] = people[j++];
        }

        for(int x=0; x<temp.length; x++)
        {
            people[left+x] = temp[x];
        }

    }
    public int numRescueBoats(int[] people, int limit) 
    {
        int len = people.length;

        mergeSort(people,0,len-1);
        
        int left=0;
        int right=len-1;
        int count =0;

        while(left <= right)
        {
            if(people[left] + people[right] <= limit)
            {
                left++;
            }
             count++;
            right--;
        }

        return count;
    }
}