class Solution 
{
    public int numberOfSpecialChars(String word)
    {
        HashSet<Character> small_set  = new HashSet<>();
        HashSet<Character> capital = new HashSet<>();

        for(char ch : word.toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
            {
                small_set.add(ch);
            }
            else 
            {
                capital.add(ch);
            }
        }

        int cnt = 0;
        for(char ch : small_set)
        {
            if(capital.contains(Character.toUpperCase(ch)))
            {
                cnt++;
            }
        }
        return cnt;
    }
}