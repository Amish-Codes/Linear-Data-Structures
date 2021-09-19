import java.util.*;
interface queue
{
    abstract void insert();
    abstract void delete();
    abstract void traverse();
    abstract void peek();
    abstract void poll();
}
class Nodde
{
    int data;
    Nodde next;
}
public class SinglyQueueLinkedList implements queue
{
    Nodde front,rear;
    SinglyQueueLinkedList()
    {
        front=rear=null;
    }

    public void insert()
    {
        System.out.println("Enter data...");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        Nodde newnode = new Nodde();
        newnode.data=item;
        newnode.next=null;

        if (front==null)
        {
            front=rear=newnode;
        }
        else
        {
            Nodde current=rear;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        System.out.println("Data inserted");
    }

    public  void delete()
    {
        if (front==null || rear==null)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            System.out.println("Deleted : " + front.data);
            front=front.next;
        }
    }

    public  void traverse()
    {
        if (front==null || rear==null)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            Nodde current;
            for (current=front;current!=null;current=current.next)
            {
                System.out.print(" " + current.data );
            } System.out.println();
        }
    }
    public void peek()
    {
        if (front==null || rear==null)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            Nodde current;
            for (current=front;current!=null;current=current.next)
            {
                if (current.next==null)
                {
                    System.out.println("Last element "+current.data);
                }
            }
        }
    }
    public void poll()
    {
        if (front==null || rear==null)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            System.out.println("First element.. " + front.data);
        }
    }

    public static void main(String[] args)
    {
        SinglyQueueLinkedList obj = new SinglyQueueLinkedList();
        while (true)
        {
            System.out.println("Press 1 for insert!");
            System.out.println("Press 2 for delete!");
            System.out.println("Press 3 for traverse!");
            System.out.println("Press 4 for exit!");
            System.out.println("Press 5 for peek!");
            System.out.println("Press 6 for poll!");

            System.out.println("Enter your choice....");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.peek();
                    break;
                case 6:
                    obj.poll();
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }
}