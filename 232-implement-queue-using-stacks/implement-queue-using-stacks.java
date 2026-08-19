class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> rt = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {

        st.push(x);
        
    }
    
    public int pop() {

        while(st.size()>0){
            rt.push(st.pop());
        }
        int val = rt.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }  
    
        return val;
    }
    
    public int peek() {

        while(st.size()>0){
            rt.push(st.pop());
        }
        
        int top = rt.peek();
         while(rt.size()>0){
            st.push(rt.pop());
        }       

        return top;
    }
    
    public boolean empty() {

        if(st.size()==0) return true ;
        else return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */