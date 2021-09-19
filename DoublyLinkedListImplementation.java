import  java.util.*;
class Nodee
{
    int data;
    Nodee previous;
    Nodee next;
}
public class DoublyLinkedListImplementation
{
    Nodee head;
    DoublyLinkedListImplementation()
    {
        head=null;
    }
    void addNode()
    {
        System.out.println("Enter data...");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();

        Nodee newnode = new Nodee();
        newnode.data=item;
        newnode.previous=null;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Nodee current = head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        System.out.println("data inserted!!!");

    }
    void deleteNode()
    {
        if (head==null)
        {
            System.out.println("doubly linked list empty");
        }
        else
        {
            System.out.println("deleted: "+head.data);
            head=head.next;
            head.previous=null;
        }
    }
    void traverseNode()
    {
        if (head==null)
        {
            System.out.println("doubly LinkedList is empty!!!");
        }
        else
        {
            //forward
            System.out.println("------ forward ------");
            Nodee current;
            for (current=head;current.next!=null;current=current.next)
            {
                System.out.println(" "+current.data);
            }
            System.out.println(" "+current.data);

            //reverse
            System.out.println("\n------ reverse ------");
            Nodee last;
            for (last=current;last!=null;last=last.previous)
            {
                System.out.println(" "+last.data);
            }
        }
    }
    void  searchNode()
    {
        if (head==null)
        {
            System.out.println("List is empty!!!");
        }
        else
        {
            System.out.println("Enter searching element..");
            Scanner sc3 = new Scanner(System.in);
            int sea = sc3.nextInt();
            int count=0;
            for (Nodee current = head;current!=null;current=current.next)
            {
                if (current.data==sea)
                {
                    count++;
                    break;
                }
            }
            if (count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }

    public static void main(String[] args)
    {
        DoublyLinkedListImplementation obj = new DoublyLinkedListImplementation();

        while (true){
            System.out.println("Press 1 to insert...");
            System.out.println("Press 2 to delete...");
            System.out.println("Press 3 to traverse...");
            System.out.println("Press 4 to search...");
            System.out.println("Press 5 for exit...");

            System.out.println("Enter your choice...");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            if (ch == 1) {
                obj.addNode();
            } else if (ch == 2) {
                obj.deleteNode();
            } else if (ch == 3) {
                obj.traverseNode();
            } else if (ch == 4) {
                obj.searchNode();
            } else if (ch == 5) {
                System.exit(0);
            } else {
                System.out.println("Wrong choice!!!");
            }
        }
    }
}
