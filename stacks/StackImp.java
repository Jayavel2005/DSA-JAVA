// package stacks;

class arrStack {
    int st[];
    int size;
    int top;

    arrStack(int size) {
        this.size = size; // ✅ Assign size properly
        st = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        st[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1; // ✅ Return a meaningful value
        }
        return st[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1; // ✅ Return a meaningful value
        }
        return st[top];
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}

public class StackImp {

    public static void main(String[] args) {
        arrStack st = new arrStack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek()); // 30
        System.out.println("Popped: " + st.pop()); // 30
        st.isEmpty(); // not empty

        System.out.println("Top element: " + st.peek()); // 20
    }
}
