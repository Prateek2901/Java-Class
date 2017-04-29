package heap;

import java.util.Scanner;

/**
 *
 * @author prateek
 */
public class Heap {

    /**
     * @param args the command line arguments
     */
    private static int HEAP[];
    private int SIZE;
    private int start = 1;

    public Heap(int size) {
        this.SIZE = size;
        HEAP = new int[SIZE];
    }

    public void insert(int i) {
        if (start == HEAP.length) {
            System.out.println("OverFlow");//throws Error_Overflow;
        }
        HEAP[start++] = i;  // O(1) complexity
        swim(start - 1);   // O(log n) complexity
    }

    public int getMax() {
        return HEAP[1]; // O(1) complexity
    }

    public void delMax() {
        swap(1, start);
        HEAP[start--] = 0;
        sink(1);
    }

    private void swap(int i, int j) {
        int temp = HEAP[i];
        HEAP[i] = HEAP[j];
        HEAP[j] = temp;
    }

    private void swim(int i) {
        if (i <= 1) {
            return;
        }

        if (HEAP[i] > HEAP[i / 2]) // O(1) complexity
        {
            swap(i, i / 2);       // O(1) complexity
            swim(i / 2);
        }
    }

    private void sink(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;

        if (left <= start && HEAP[left] > HEAP[max]) {
            max = left;
        }
        if (right <= start && HEAP[right] > HEAP[max]) {
            max = right;
        }
        if (max != i) {
            swap(i, max);
            sink(max);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        Heap h = new Heap(size);
        int ch = 1;
        System.out.println("1\tInsert\n 2\tDelete Max\n 3\tGet Max\nPress 0 to Quit\nEnter your choice");
        do {

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the element to be inserted->");
                    int in = sc.nextInt();
                    h.insert(in);
                    break;
                case 2:
                    h.delMax();
                    break;
                case 3:
                    System.out.println(h.getMax());
                    break;
                default:
                    System.out.println("Invalid Input");

            }

        } while (ch != 0);

    }

}
