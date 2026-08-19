public class ReverseDll {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }    
    static void printForward(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static Node reverseDLL(Node head){
        if(head == null || head.next == null) return head;
        Node curr = head;
        Node newHead = null;
        while(curr != null){
            Node temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            newHead = curr;
            curr = curr.prev;
        }
        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        head = reverseDLL(head);
        printForward(head);
    }
}
