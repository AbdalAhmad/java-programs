import java.util.*;

public class linked{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
     // step 1 = create new node
     Node newNode = new Node(data);
     if(head == null){
    head = tail = newNode;
    return;
     }
     // step2 -  newNode next = head
     newNode.next = head; // link
     // step 3
     head = newNode;
    }


    // for last value
   public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
   }

    public static void main(String args[]){
     Linked ll = new LinkedList();
      ll.head = new Node(1);
      ll.head.next = new Node(2);
      ll.addFirst(1);
      ll.addFirst(2);
   ll.addLast(1);
   ll.addLast(2);
    }
}