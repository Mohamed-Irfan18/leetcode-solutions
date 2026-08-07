class Solution 
{
    public String makeGood(String s) 
    {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty())
            {
                if(Character.toLowerCase(st.peek()) == Character.toLowerCase(ch) && (st.peek() != ch))
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

        StringBuilder sb = new StringBuilder();
        for(char t : st)
        {
            sb.append(t);
        }
        return sb.toString();
    }
}