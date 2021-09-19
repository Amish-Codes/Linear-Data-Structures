import java.util.Scanner;
public class HighestCircularQueue {
    int arr[];
    int front,rear;
    HighestCircularQueue() {
        arr = new int[5];
        front=rear=-1;
    }
    void insert() {
        if (front==0 && rear==4 || rear==front-1)
        {
            System.out.println("Stack is full!!!");
        }
        else
            {
            System.out.println("Enter the value...");
            Scanner sc2 = new Scanner(System.in);
            int value = sc2.nextInt();

            if (front==-1)
            {
                front=0;
            }
            if (rear<4) {
                rear+=1;
            }
            //else if (rear==4 && front!=0) {
            //    rear=0;
            //}
            arr[rear]=value;
            System.out.println("Value inserted...");
        }
    }
    void traverse() {
        if (front == -1 || rear == -1) {
            System.out.println("Can't traverse, Queue is Empty...");
        }
        else
            {
            if (front<=rear)
            {
                for (int i = front;i<=rear;i++)
                {
                    System.out.print(" " + arr[i]);
                }
            }
            else
                {
                for (int i = front;i<=4;i++) {
                    System.out.print(" " + arr[i]);
                }
                for (int i = 0;i<=rear;i++) {
                    System.out.print(" " + arr[i]);
                }
            }
        }
    }

    void checkHighest() {
        int max=0;
        if (front<=rear)
        {
            for (int i = front;i<=rear;i++)
            {
                if(max<arr[i])
                {
                   max=arr[i];

                }
            }
            System.out.print(max);
        }
        else {
            for (int i = front;i<=4;i++) {
                if(max<arr[i]) {
                    max=arr[i];
                }
            }
            System.out.println(max);
            for (int i = 0;i<=rear;i++) {
                if(max<arr[i]) {
                    max=arr[i];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        HighestCircularQueue obj = new HighestCircularQueue();
        while (true) {
            System.out.println("\nPress 1 for insert!");
            System.out.println("Press 2 for traverse!");
            System.out.println("Press 3 to chech highest element!");
            System.out.println("Press 4 for exit!");

            System.out.println("Enter your choice....");
            Scanner sc2 = new Scanner(System.in);
            int ch = sc2.nextInt();

            switch (ch) {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    obj.checkHighest();
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
