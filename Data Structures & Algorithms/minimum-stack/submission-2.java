class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minValueStack;

    public MinStack(){
        stack = new ArrayDeque<>();
        minValueStack = new ArrayDeque<>();
    }

    public void push(int val){
        stack.push(val);
        if(minValueStack.isEmpty() || val <= minValueStack.peek()){
            minValueStack.push(val);
        }
    }

    public void pop(){
        int poppedValue = stack.pop();

        if(poppedValue == minValueStack.peek()){
            minValueStack.pop();
        }

    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minValueStack.peek();
    }
}
