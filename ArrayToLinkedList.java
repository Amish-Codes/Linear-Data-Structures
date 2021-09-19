class Nde {
    int Rollno;
    Nde next;
}
public class ArrayToLinkedList {
    static Nde insert(Nde head, int item) {
        Nde temp = new Nde();
        Nde current;
        temp.Rollno = item;
        temp.next = null;
        if (head == null)
            head = temp;
        else {
            current = head;
            while (current.next != null)
                current = current.next;
            current.next = temp;
        }
        return head;
    }
    static void display(Nde head) {
        while (head != null) {
            System.out.print( head.Rollno + " ");
            head = head.next;
        }
    }
    static Nde arrayToList(int arr[], int n) {
        Nde head = null;
        for (int i = 0; i < n; i++)
            head = insert(head, arr[i]);
        return head;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Nde head = arrayToList(arr, n);
        display(head);
    }
}