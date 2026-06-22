class Solution 
{
    public int minLength(String s) 
    {
        int len = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<len; i++)
        {
            char ch = s.charAt(i);

            if(!st.isEmpty())
            {
                if(st.peek() == 'A' && ch == 'B')
                {
                    st.pop();
                }
                else if(st.peek() == 'C' && ch == 'D')
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
        return st.size();
    }
}