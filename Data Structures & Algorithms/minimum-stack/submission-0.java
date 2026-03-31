class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            this.min = val;
        } else {
            stack.push (val - this.min);
            if (val < this.min) this.min = val;
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        long pop = stack.pop();

        if (pop < 0) this.min = this.min - pop;
    }
    
    public int top() {
        long top = stack.peek();
        if (top > 0){
            return (int) (top + this.min);
        } else {
            return (int) this.min;
        }
    }
    
    public int getMin() {
        return (int) this.min;
    }
}
