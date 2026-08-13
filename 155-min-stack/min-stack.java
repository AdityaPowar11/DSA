class MinStack {

    Stack<Long> st = new Stack<>();
    long min = Long.MAX_VALUE;

    public MinStack() {
    }

    public void push(int value) {
        long x = (long)value;
        if (st.isEmpty()) {
            st.push(x);
            min =x;
            return;
        } else if (x >= min) {
            st.push(x);
        } else {
            st.push(2 * x - min);
            min = x;

        }

    }

    public void pop() {

        if (st.isEmpty())
            return;
        if (st.peek() >= min) {
            st.pop();
        } else {
            min = 2 * min - st.peek();
            st.pop();
        }

    }

    public int top() {

        if (st.isEmpty())
            return -1;

        long q = st.peek();
        if (q >= min)
            return (int) q;
        else {
            return (int)min;
        }
    }

    public int getMin() {
        return (int) min;
    }
}

