import java.util.*;
public class QueueImplementation
{
    int ar[];
    int Front,Rear;
    QueueImplementation()
    {
        ar = new int[5];
        Front = Rear = -1;
    }

    void  insert()
    {
        if (Rear==4)
        {
            System.out.println("Queue is full");
        }
        else
        {
            System.out.println("Enter data!!!");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();

            if (Front==-1)
            {
                Front=0;
            }
            Rear=Rear+1;
            ar[Rear]=data;
            System.out.println("Data Inserted...");
        }
    }

    void  delete()
    {
        if (Front==-1 && Rear==-1)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            if (Front==Rear)
            {
                System.out.println("Deleted: " + ar[Front]);
                Front=Rear=-1;
            }
            else
            {
                System.out.println("Deleted: " + ar[Front]);
                Front+=1;
            }
        }
    }

    void  traverse()
    {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            for (int i = Front; i<=Rear;i++)
            {
                System.out.print(" "+ ar[i]);
            }
        }
    }

    void  peek()
    {
        if (Front==-1 || Rear==-1)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            System.out.println("Last element.. " + ar[Rear]);
        }
    }
    void poll()
    {
        if (Front==-1 || Rear==-1)
        {
            System.out.println("Queue is Empty!");
        }
        else
        {
            System.out.println("Front element. "+ar[Front]);
        }
    }

    public static void main(String[] args)
    {
        QueueImplementation obj = new QueueImplementation();
        while (true)
        {
            System.out.println("Press 1 for insert!");
            System.out.println("Press 2 for delete!");
            System.out.println("Press 3 for traverse!");
            System.out.println("Press 4 for exit!");
            System.out.println("Press 5 for peek!");
            System.out.println("Press 6 for poll!");

            System.out.println("Enter your choice....");
            Scanner sc2 = new Scanner(System.in);
            int ch = sc2.nextInt();

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
