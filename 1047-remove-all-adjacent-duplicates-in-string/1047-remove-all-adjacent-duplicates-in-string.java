class Solution 
{
    public String removeDuplicates(String s) 
    {
        int len = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty())
            {
                if(st.peek() == ch)
                {
                    st.pop();
                }
                else
                {
                    st.push(ch);
                }
            }
            else
            {
                st.push(ch);
            }
        }

        StringBuilder str = new StringBuilder("");

        for(char c : st)
        {
            str.append(c);
        }

        return str.toString();
    }
}