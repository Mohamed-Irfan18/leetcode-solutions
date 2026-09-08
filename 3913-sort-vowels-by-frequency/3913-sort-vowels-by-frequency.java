class Solution 
{
    public String sortVowels(String s)
    {
        int len = s.length();

        String vowels = "aeiou";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> first = new HashMap<>();

        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1)
            {
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(!first.containsKey(ch))
                {
                    first.put(ch,i);
                }
            }
        }

        StringBuilder vow = new StringBuilder();
        boolean[] used = new boolean[5];
        for(int cnt=0; cnt<5; cnt++)
        {
            int max =0;
            int index=-1;
            for(int i=0; i<5; i++)
            {
                char ch = vowels.charAt(i);
                if(!used[i] && map.containsKey(ch))
                {
                    if(index == -1 || map.get(ch) > max || (map.get(ch) == max && first.get(ch) < first.get(vowels.charAt(index))))
                    {
                        max = map.get(ch);
                        index =i;
                    }
                }
            }

            if(index != -1)
            {
                char ch = vowels.charAt(index);

                for(int i=0; i<max; i++)
                {
                    vow.append(ch);
                }
                used[index] = true;
            }
        }

        StringBuilder sb = new StringBuilder(s);
        int j=0;

        for(int i=0; i<len; i++)
        {
            if(vowels.indexOf(s.charAt(i)) != -1)
            {
                sb.setCharAt(i,vow.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}