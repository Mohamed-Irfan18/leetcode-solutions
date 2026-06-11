class Solution 
{
    public int calPoints(String[] operations) 
    {
        int len = operations.length;
        Stack<Integer> st = new Stack<>();

        int sum = 0;

        for(String i : operations)
        {
            switch(i)
            {
                case "+":
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
                break;
                case "D":
                st.push(st.peek() * 2);
                break;

                case "C":
                st.pop();
                break;

                default:
                st.push(Integer.parseInt(i));
            }
        }
        
        for(int i : st)
        {
            sum += i;
        }

        return sum;
    }
}