import java.util.*;
class Nod
{

    int rollno;
    Nod next;
}
public class SinglyLinkedList
{
    Nod head;
    SinglyLinkedList()
    {
        head = null;
    }
    void addNode()
    {
        System.out.println("Enter your roll no.");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        // creating a new node
        Nod newNode = new Nod();
        newNode.rollno=rn;
        newNode.next=null;
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Nod current = head;
            while (current.next!=null)
            {
                current=current.next;
            } current.next=newNode;
        }
        System.out.println("Data inserted...");
    }
    void deleteNodebegin()
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("deleted"+head.rollno);
            head=head.next;
        }
    }
    void deleteLastNode()
        {
            if (head == null)
            {
                System.out.println("list empty");
            }
            Nod second_last = head;
            while (second_last.next.next != null)
            {
                second_last = second_last.next;
            }
            second_last.next = null;

        }
    void traverseNode()
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Nod current;
            for (current=head;current!=null;current=current.next)
            {
                System.out.print(" " + current.rollno);
            }
        }
    }
    void searchNode()
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Enter searching element...");
            Scanner sc3 = new Scanner(System.in);
            int search = sc3.nextInt();
            int count=0;
            Nod current=head;
            for (current=head;current!=null;current=current.next )
            {
                if(current.rollno==search)
                {
                    count++;
                    break;
                }
            }
            if (count>0)
            {
                System.out.println("Element found");
            }
            else
            {
                System.out.println("Element not found");
            }
       }
    }

    public static void main(String[] args)
    {
        SinglyLinkedList obj = new SinglyLinkedList();

        while (true)
        {
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to delete from begining");
            System.out.println("Press 3 to traverse");
            System.out.println("Press 4 to search");
            System.out.println("Press 6 to exit");
            System.out.println("Press 5 to delete node from last");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    obj.addNode();
                    break;
                case 2:
                    obj.deleteNodebegin();
                    break;
                case 3:
                    obj.traverseNode();
                    break;
                case 4:
                    obj.searchNode();
                    break;
                case 5:
                    obj.deleteLastNode();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}
