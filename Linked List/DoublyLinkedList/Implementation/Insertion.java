public class Insertion {
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
    static Node insertAtBegining(Node head , int value){
        Node newNode = new Node(value);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }
    static Node insertAtLast(Node head , int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return head;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;

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
        head = insertAtBegining(head, 5);
        head = insertAtLast(head, 50);
        printForward(head);
    }
}
