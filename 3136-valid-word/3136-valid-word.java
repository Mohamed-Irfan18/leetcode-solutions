class Solution 
{
    public boolean isValid(String word) 
    {
        int len = word.length();

        if(len < 3)
        {
            return false;
        }

        String vowels = "aeiouAEIOU";
        int vow =0;
        int cons =0;

        for(char ch : word.toCharArray())
        {
            if(Character.isLetter(ch))
            { 
               if(vowels.indexOf(ch) != -1)
               {
                  vow++;
               }
               else
               {
                  cons++;
                }
            }
            else if(!Character.isDigit(ch))
            {
                return false;
            }
        }

            if(vow >=1 && cons >=1)
            {
                return true;
            }
        return false;
    }
}