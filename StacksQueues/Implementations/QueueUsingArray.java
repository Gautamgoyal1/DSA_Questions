public class QueueUsingArray {

    class Queue {

        int[] queue;
        int front;
        int rear;
        int size;

        Queue(int size) {
            queue = new int[size];
            front = 0;
            rear = -1;
            this.size = 0;
        }

        void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }

            rear = (rear + 1) % queue.length;
            queue[rear] = data;
            size++;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int data = queue[front];
            front = (front + 1) % queue.length;
            size--;

            return data;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return queue[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == queue.length;
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        QueueUsingArray obj = new QueueUsingArray();
        Queue q = obj.new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Front element: " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Current size: " + q.size());
        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println("Is queue full? " + q.isFull());
    }
}