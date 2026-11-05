import java.util.*;

public class MinHeap {
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void insert(int key) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        int i = size;
        heap[size++] = key;

        while (i != 0 && heap[parent(i)] > heap[i]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    int deleteRoot() {
        if (size <= 0) {
            System.out.println("Heap Underflow");
            return -1;
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);

        return root;
    }

    void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest]) {
            smallest = l;
        }

        if (r < size && heap[r] < heap[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;

            heapify(smallest);
        }
    }

    void printHeap() {
        if (size == 0) {
            System.out.println("Heap is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Heap Capacity: ");
        int capacity = sc.nextInt();

        MinHeap h = new MinHeap(capacity);

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            h.insert(sc.nextInt());
        }

        System.out.print("Heap: ");
        h.printHeap();

        int deleted = h.deleteRoot();
        if (deleted != -1) {
            System.out.println("Deleted Root: " + deleted);
        }

        System.out.print("Heap after Deletion: ");
        h.printHeap();

        // Demonstrate Heap Underflow
        while (h.size > 0) {
            System.out.println("Deleted Root: " + h.deleteRoot());
        }

        h.deleteRoot(); // Heap Underflow

        sc.close();
    }
}