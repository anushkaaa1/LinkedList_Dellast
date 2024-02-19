public class linkeddellast {
    Node head,tail;

    public linkeddellast(){
        head = tail= null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public void create(int num){
        Node n = new Node(num);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void dellast(){
        if(head == null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node prev = head;
            Node temp = null;
            while(prev.next!=null){
                temp = prev;
                prev = prev.next;
            }
            temp.next = prev.next;
        }
    }
    public static void main(String args[]){
        linkeddellast l = new linkeddellast();
        l.create(3);
        l.create(5);
        l.print(l.head);
        System.out.println();
        l.dellast();
        l.print(l.head);
    }
}
