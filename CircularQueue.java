import java.util.*;
public class CircularQueue {
    int ar[];
    int front,rear;
    CircularQueue() {
        ar = new int [5];
        front=rear=-1;
    }

    void insert() {
        if ((front==0 && rear==4) || (rear==front-1)){
            System.out.println("Circular Queue is full!!!");
        }
        else{
            System.out.println("Enter data...");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            if (front==-1) { front=0; }
            if (rear<4) { rear+=1; }
            else if (rear==4 && front!=0) { rear=0; }
            ar[rear]=data;
            System.out.println("data inserted...");
        }
    }

    void delete() {
        if (front==-1 || rear==-1)
            System.out.println("Circular Queue is empty!!!");
        else {
            if (front==rear){
                System.out.println(" deleted : " + ar[front]);
                front=rear=-1;
            }
            else if (front<rear){
                System.out.println("deleted : " + ar[front]);
                front+=1;
            }
            else if(front==4){
                System.out.println("deleted : " + ar[front]);
                front=0;
            }
            else if (rear<front){
                System.out.println("deleted : " + ar[front] );
                front+=1;
            }
        }
    }

    void traverse() {
        if (front==-1 || rear==-1){
            System.out.println("Circular Queue is empty!!!");
        }
        else {
            if (front<=rear){
                for (int i = front; i<=rear; i++){
                    System.out.print(" "+ar[i]);
                }
            }
            else {
                for (int i=front;i<=4;i++)
                {
                    System.out.print(" "+ar[i]);
                }
                for (int i=0;i<=rear;i++){
                    System.out.print(" "+ar[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        while (true) {
            System.out.println("Press 1 for insert!");
            System.out.println("Press 2 for delete!");
            System.out.println("Press 3 for traverse!");
            System.out.println("Press 4 for exit!");
            System.out.println("Press 5 for peek!");
            System.out.println("Press 6 for poll!");

            System.out.println("Enter your choice....");
            Scanner sc2 = new Scanner(System.in);
            int ch = sc2.nextInt();

            switch (ch) {
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
                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }
}