class SpecialStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public SpecialStack() {
        // Define Stack
    }

    public void push(int x) {
        // Add an element to the top of Stack
        st.push(x);
        if(min.isEmpty() || x<=min.peek())
        min.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.isEmpty())
            return ;
        if(st.peek().equals(min.peek()))
        min.pop();
        st.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty())
               return -1;
        return st.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if (min.isEmpty())
                return -1;
        return min.peek();
    }
}