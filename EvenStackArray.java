import java.util.Scanner;
public class EvenStackArray {
    int[] array;
    int top;
    EvenStackArray() {
        Scanner sc =  new Scanner(System.in);
        int num=sc.nextInt();
        array = new int [num];
        top=-1;
    }
    public static boolean checkEven(int n) {
        if (n%2==0){
            return true;
        }
        return false;
    }
    void push() {
        if (top<array.length) {
            System.out.println("Enter the data...");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            {
                if (checkEven(data)) {
                    top += 1;
                    array[top] = data;
                    System.out.println("Data inserted..");
                } else {
                    System.out.println(data + "is not a valid entry!!!");
                }
            }

            //throw new ArrayIndexOutOfBoundsException();
            //System.out.println("Stack is full!!!");
        }
        else {
            /*System.out.println("Enter the data...");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            {
                if (checkEven(data)) {
                    top += 1;
                    array[top] = data;
                    System.out.println("Data inserted..");
                } else {
                    System.out.println(data + "is not a valid entry!!!");
                }
            }

             */
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void main(String[] args) {
        EvenStackArray obj = new EvenStackArray();
        while (true) {
            obj.push();
        }
    }
}