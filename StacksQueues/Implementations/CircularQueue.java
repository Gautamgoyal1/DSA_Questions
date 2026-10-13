class CircularQueue {
    int[] arr = new int[4];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int x) {
        if (size == arr.length) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = x;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }

        front = (front + 1) % arr.length;
        size--;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(5);
        q.enqueue(6);
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.display();
    }
}