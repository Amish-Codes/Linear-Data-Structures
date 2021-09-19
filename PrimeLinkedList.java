import java.util.*;
class PrimeNode {
    int primeNumber;
    PrimeNode next;
}
public class PrimeLinkedList {
    PrimeNode head;
    PrimeLinkedList() {
        head=null;
    }
    public static int checkPrimeNumber(int number) {
        int counter=0;
        for (int i=2;i<=number/2;i++) {
            if (number%i==0) {
                counter=1;
                break;
            }
        }
        if (counter==0) {
            return number;
        }
        return number/2;
    }
    void addPrimeNode() {
        System.out.println("Enter a prime number...");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        if (checkPrimeNumber(n)==n){
            PrimeNode newnode = new PrimeNode();
            newnode.primeNumber = n;
            newnode.next = null;
            if (head==null){
                head=newnode;
            }
            else {
                PrimeNode current = head;
                while (current.next!=null){
                    current=current.next;
                } current.next=newnode;
            }
            System.out.println("A prime number inserted...");
        }
        else {
            System.out.println("Try Again!!!");
        }

    }
    void traverseLL() {
        if (head==null) {
            System.out.println("LinkedList is empty...");
        }
        else {
            PrimeNode current;
            for (current=head;current!=null;current=current.next) {
                System.out.println(" " + current.primeNumber);
            }
        }
    }
    public static void main(String[] args) {
        PrimeLinkedList obj = new PrimeLinkedList();
        while (true) {
            System.out.println("Press 1 to insert a prime number!");
            System.out.println("Press 2 to traverse the Linkedlist!");
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
            if (choice==1) obj.addPrimeNode();
            else if (choice==2) obj.traverseLL();
            else System.exit(0);
        }
    }
}