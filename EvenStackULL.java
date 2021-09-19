import java.util.Scanner;
class EvenNode {
    int data;
    EvenNode next;
}
public class EvenStackULL {
    EvenNode top;
    EvenStackULL() {
        top=null;
    }
    public static boolean checkEven(int n) {
        if (n%2==0) {
            return  true;
        }
        return false;
    }
    void push() {
        System.out.println("Enter Data");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (checkEven(number)==true) {
            EvenNode node = new EvenNode();
            node.data=number;
            node.next=top;
            top=node;
            System.out.println("Data Inserted...");
        }
        else {
            System.out.println(number + "is not a valid entry!!!");
        }
    }

    public static void main(String[] args) {
        EvenStackULL obj = new EvenStackULL();
        while (true) {
            obj.push();
        }
    }
}
