class Solution 
{
    public String toGoatLatin(String sentence) 
    {
        int len = sentence.length();

        String[] arr = sentence.split(" ");

        String vowels = "aeiouAEIOU";

        for(int i=0; i<arr.length; i++)
        {
            int first = arr[i].charAt(0);

            if(vowels.indexOf(first) != -1)
            {
                arr[i] += "ma";
            }
            else
            {
                String rem = arr[i].substring(1);
                char fit = arr[i].charAt(0);

                arr[i] = rem + fit + "ma";
            }

            for(int j=0; j<i+1; j++)
            {
                arr[i] += "a";
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String c : arr)
        {
            sb.append(c + " ");
        }

        return sb.toString().trim();
    }
}