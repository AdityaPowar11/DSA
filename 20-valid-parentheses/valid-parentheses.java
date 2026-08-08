class Solution {
    public boolean isValid(String s) {

        int n = s.length();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[')
                st.push(ch);

            else {
                if (st.isEmpty()) return false;

                if (ch == ']' || ch == '}' || ch == ')') {

                    char top = st.peek();

                    if (top == '[' && ch == ']' ||
                            top == '(' && ch == ')' ||
                            top == '{' && ch == '}') {
                        st.pop();
                    }
                    else return false;

                }
            }
        }
        return st.isEmpty();
    }

}
