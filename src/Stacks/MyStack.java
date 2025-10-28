package Stacks;

public class MyStack {

    private Node top;
    private int size;

    public MyStack() {
        top=null;
        size=0;
    }

    //push the elements
    public void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
        size++;

    }

    public boolean isEmpty()
    {
        return top==null;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}
