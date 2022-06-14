public class ReverseLinkedList {
    static Node head;
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node reverse(Node head){
         if (head==null || head.next==null)
             return head;
         Node rest=reverse(head.next);
         head.next.next=head;
         head.next=null;
         return rest;
    }
    static void print(){
         Node temp=head;
         while (temp!=null){
             System.out.println(temp.data+" ");
             temp=temp.next;
         }
        System.out.println();
    }
    static void push(int data){
         Node temp=new Node(data);
         temp.next=head;
         head=temp;
    }

    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(85);
        System.out.println("before reversing");
        print();
        System.out.println("after reversing");
        head=reverse(head);
        print();
    }
}
