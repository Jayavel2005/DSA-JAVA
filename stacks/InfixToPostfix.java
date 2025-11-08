class Node {
    char ch;
    Node next;

    Node(char ch) {
        this.ch = ch;
        this.next = null;
    }
}

class llStack {
    Node top;

    public void push(char ch) {
        Node newNode = new Node(ch);
        newNode.next = top;
        top = newNode;
    }

    public char peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return top.ch;
    }

    public char pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return ' ';
        }
        char ch = top.ch;
        top = top.next;
        return ch;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostFix(String exp) {
        StringBuilder result = new StringBuilder();

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch); // ✅ Fix: Append operands to result (not push)
            }

            else if (ch == '(') {
                this.push(ch);
            }

            else if (ch == ')') {
                while (!this.isEmpty() && this.peek() != '(') {
                    result.append(this.pop());
                }
                this.pop(); // Pop '('
            }

            else {
                while (!this.isEmpty() && this.precedence(ch) <= this.precedence(this.peek())) {
                    result.append(this.pop());
                }
                this.push(ch);
            }
        }

        while (!this.isEmpty()) {
            result.append(this.pop());
        }

        return result.toString();
    }

    public String infixToPrefix(String exp) {
        StringBuilder revStr = new StringBuilder(exp).reverse();
        revStr.toString().replace('(', ')');
        revStr.toString().replace(')', '(');

        String result = this.infixToPostFix(revStr.toString());
        return new StringBuilder(result).reverse().toString();
    }
}

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*c";
        llStack st = new llStack();
        System.out.println("Postfix: " + st.infixToPostFix(exp));
        System.out.println("Prefix: " + st.infixToPrefix(exp));
    }
}
