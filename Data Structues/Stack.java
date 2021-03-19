class Stack<T> {
    private T[] stack;
    private T[] newstack;
    private int capacity;
    private int length = 0;

    public Stack() {
        this(16);
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[this.capacity];
    }

    public boolean push(T item) {
        if (length < capacity) {
            stack[length] = item;
            length += 1;
            return true;
        }
        if (this.length == capacity) {
            System.out.println(capacity);
            this.newstack = (T[]) new Object[capacity * 2];
            capacity *= 2;
            for (int i = 0; i < stack.length; i++) {
                newstack[i] = stack[i];
            }
            stack = newstack;
            stack[length] = item;
            length += 1;
            return true;
        }
        return false;
    }

    public T pop() {
        T value = stack[length];
        newstack = (T[]) new Object[capacity];
        for (int i = 0; i < length - 1; i++) {
            newstack[i] = stack[i];
        }
        stack = newstack;
        length -= 1;
        return value;

    }

    public void show() {
        for (int i = 0; i < length; i++)
            System.out.print(stack[i] + "  ");
        System.out.println("");
    }
}