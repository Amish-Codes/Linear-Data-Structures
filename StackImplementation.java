import java.util.*;
public class StackImplementation
{
    int[] arr;
    int top;
    StackImplementation()
    {
        arr = new int[5];
        top=-1;
    }
    void push() //insert
    {
        if (top==4)
        {
            System.out.println("Stack is full!");
        }
        else
        {
            System.out.println("Enter any data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("Data inserted!!!");
        }
    }
    void pop() //delete
    {
        if (top==-1)
        {
            System.out.println("Stack is empty!!!");
        }
        else
        {
            System.out.println("Deleted element...");
            top=top-1;
        }
    }
    void traverse() //view
    {
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for (int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
    void peek()
    {
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }
    public static void main(String[] args)
    {
        StackImplementation obj =new StackImplementation();
        while (true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for viewing the top element");
            System.out.println("Press 5 for exit");
            System.out.println();
            System.out.println("Enter your choice...");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
