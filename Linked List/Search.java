public class Search {
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
    public void addFirst(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            tail = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public  boolean searchInList(int target){
        Node curr = head;
        while(curr!=null){
            if(curr.val == target){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {

        
        Search list = new Search();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst((5));
        if(list.searchInList(20)){
            System.out.println("Element is Present");
        }
        else {
            System.out.println("Element is not Present");
        }
    }
}
