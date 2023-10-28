interface S{
    void push(int s);
    void pop();
    void peek();

}


public class MyStack implements S
{
    private int capacity;
    private int top;
    private int StackArray[];
    private int size;

    public MyStack(int s)
    {
        capacity=s;
        top=-1;
        StackArray= new int[capacity];
        size=0;
    }

    public void push(int e)
    {
        if(top+1==capacity)
              {
                System.out.println("Overflow");
                return;
              }
        
        top++;
        size++;
        StackArray[top]=e;
         System.out.println(e + " is pushed into the stack");
    }

    public void pop()
    {
        if(top==-1)
        {
             System.out.println("Underflow");
             return;
        }
        int p= StackArray[top];
        top--;
        System.out.println(p + " is popped out of the stack");
    }

    public void peek()
    {
         if(top==-1)
        {
             System.out.println("Underflow");
             return;
        }
         System.out.println("Element at top is " + StackArray[top]);
    }
    
    public static void main(String args[])
    {
        MyStack sv= new MyStack(7);
        sv.push(1);
        sv.push(2);
        sv.push(3);
        sv.push(4);
        sv.push(5);
        sv.push(6);
        sv.push(7);
        sv.push(8);
        sv.peek();
        while(sv.top!=-1)
        {
            sv.pop();
        }

    }
}
