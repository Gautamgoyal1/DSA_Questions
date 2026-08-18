public class Implementation {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add node at the beginning
    public void addFirst(int val) {
        Node nn = new Node(val);

        // If linked list is empty
        if (head == null) {
            head = nn;
            tail = nn;
            return;
        }

        // Connect new node to current head
        nn.next = head;

        // Make new node the head
        head = nn;
    }

    // Print linked list
    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
    public int countNode() {
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Implementation list = new Implementation();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        list.printList();
        System.out.println("Number of Nodes : " + list.countNode());
    }
}