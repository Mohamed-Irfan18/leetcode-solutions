class Solution
 {
    public String mergeAlternately(String word1, String word2) 
    {
        int len1 = word1.length();
        int len2 = word2.length();

        StringBuilder res = new StringBuilder();
        
        int i=0,j = 0;
        while(i<len1 || j<len2)
        {
          if(i<len1)
          {
            res.append(word1.charAt(i));
            i++;
          }
          if(j<len2)
          {
            res.append(word2.charAt(j));
            j++;
          }
        }

        return res.toString();
    }
}