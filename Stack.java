package stack;

public class Stack {

    /**
     * ջ��ָ��
     */
    private Node top;

    /**
     * ��ջ
     * @param value
     */
    public void push(int value) {
        Node newNode = new Node(value, null);
        
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    /**
     * ��ջ
     * @return
     */
    public int pop() {
        if (top == null) {
            System.err.println("empty stack, peek invalid value: -9999");
            return -9999;
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    /**
     * ��ӡ����ջ��Ԫ��
     * �мǣ�����ֱ��ʹ��topָ��
     */
    public void printAll() {
        Node p = top;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void printAllReverse() {
        Stack s1 = new Stack();

        Node p = top;
        while (p != null) {
            s1.push(p.value);
            p = p.next;
        }

        s1.printAll();
    }


    public class Node {
        private int value;
        private Node next;
        

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

    }

}
