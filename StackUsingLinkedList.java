import java.util.*;
class Node
{
    int data;
    Node next;
}
public class StackUsingLinkedList
{
    Node top;

    StackUsingLinkedList()
    {
        top = null;
    }

    void push()
    {
        System.out.println("Insert data...");
        Scanner sc2  = new Scanner(System.in);
        int item= sc2.nextInt();

        Node newnode = new Node();
        newnode.data =item;
        newnode.next=top;

        top=newnode;
        System.out.println("data inserted...");
    }

    void pop()
    {
        if (top==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("deleted element : " + top.data);
            top=top.next;
        }
    }

    void traverse()
    {
        if(top==null)
        {
            System.out.println("Stack is empty!");
        }
        else
        {
            for (Node current = top; current!=null; current=current.next)
            {
                System.out.println(current.data);
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        while (true) {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for viewing the top element");
            System.out.println("Press 5 for exit");
            System.out.println();
            System.out.println("Enter your choice...");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
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
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
