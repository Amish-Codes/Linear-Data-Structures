import java.util.Scanner;
public class SecHighestStack {
    int[] arr;
    int top;

    SecHighestStack() {
        arr = new int[100];
        top=1;
    }

    void push() {
        if (top==4) {
            System.out.println("Stack is full");
        }
        else {
            System.out.println("Enter any data...");
            Scanner sc2 = new Scanner(System.in);
            int element = sc2.nextInt();
            top+=1;
            arr[top]=element;
            System.out.println("Data inserted...");
        }
    }
    void showSecHigh() {
//        for (int i=top;i>=0;i++) {
//            System.out.println(arr[i]);
//            System.out.println("In the above stack, the second highest element is : \n ");
//
//        }
        System.out.println("Second highest value is ...");
        for (int i=top;i>=0;i++) {
            int temp;
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        SecHighestStack obj = new SecHighestStack();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if (ch==1) obj.push();
            else if (ch==2) obj.showSecHigh();
            else System.exit(0);
        }
    }
}
