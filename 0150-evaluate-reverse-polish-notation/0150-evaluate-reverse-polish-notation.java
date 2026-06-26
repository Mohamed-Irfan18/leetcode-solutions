class Solution 
{
    public int evalRPN(String[] tokens)
    {
        int len = tokens.length;

         Stack<Integer> st = new Stack<>();
        int total = 0;

        for(String num : tokens)
        {
            if((num.equals("+")) || (num.equals("-")) || (num.equals("*")) || (num.equals("/")))
            {
                int a = st.pop();
                int b = st.pop();

                int ans = 0;

                switch(num)
                {
                    case "+" :
                    ans = a + b;
                    break;

                    case "-" : 
                    ans = b - a;
                    break;

                    case "*" : 
                    ans = a * b;
                    break;

                    case "/" : 
                    ans = b / a;
                    break;
                }
                st.push(ans);
            }
            else
            {
                 st.push(Integer.parseInt(num));
            }
        }

        return st.pop();
        
    }
}