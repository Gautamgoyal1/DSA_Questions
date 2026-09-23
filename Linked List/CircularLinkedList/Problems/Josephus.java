public class Josephus {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node head = null;
    static void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    static Node createList(int n){
        Node head = null;
        Node tail = null;
        for(int i=1 ; i<=n ; i++){
            Node newNode = new Node(i);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        tail.next = head;
        return head;
    }
        static int josephus(int n , int k){
            Node head = createList(n);
            Node prev = head;
            Node curr = head;
            while(prev.next != head){
                prev = prev.next;
            }
            while(curr.next != curr){
                for(int i=1 ; i<k ; i++){
                    prev = curr;
                    curr = curr.next;
                }
                System.out.println("Eliminates: " + curr.data);
                prev.next = curr.next;
                curr = curr.next;
            }
            return curr.data;
        }
        public static void main(String[] args) {
            System.out.println("Winner is : " + josephus(5,2));
        }
    }