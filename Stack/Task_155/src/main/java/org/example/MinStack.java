package org.example;

public class MinStack {
    Root root;
    Root last;
    int size;
    int min;

    public MinStack() {
        size = 0;
        min = Integer.MAX_VALUE;
    }
    public static class Root {
        int elem;
        Root prev;
        Root next;
        int minBeforeThis;
        Root(int elem) {
            this.elem = elem;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }
    public void push(int val) {
        if (size == 0) {
            root = new Root(val);
            last = root;
        } else {
            last.next = new Root(val);
            last.next.prev = last;
            last = last.next;
        }
        last.minBeforeThis = min;
        this.min = Math.min(this.min, val);
        size++;
    }

    public void pop() {
        int elem = last.elem;
        this.min = last.minBeforeThis;
        last = last.prev;
        size--;
    }

    public int top() {
        return last.elem;
    }

    public int getMin() {
        return min;
    }
}
