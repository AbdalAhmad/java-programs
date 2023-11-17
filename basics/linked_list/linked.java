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
    public static int size;

    public void addFirst(int data){
     // step 1 = create new node
     Node newNode = new Node(data);
     size++; // count
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
    size++; // count
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
   }


   public void print(){ // O(n)
    if(head == null){
        System.out.println("ll is an empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+ "->");
        temp = temp.next; // head ke next
    }
    System.out.println("null");
   }

   public void add(int index, int data){
    if(index ==0){// add value at head
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);

    size++; // count
    Node temp = head;
    int i = 0;  // i = 2

     while(i<index-1){ // prev find
        tem= temp p.next; // increase
        i++;

     }
     // when temp equal to i
     // i = index-1 ; temp->prev  temp mein previous value add hogai
     newNode.next = temp.next;
     temp.next = newNode;
     
   }


    public static void main(String args[]){
     linked ll = new linked();
    //   ll.head = new Node(1);
    //   ll.head.next = new Node(2);
  ll.print();
      ll.addFirst(2);
        ll.print();
      ll.addFirst(1);
  ll.print();
   ll.addLast(3);
     ll.print();
   ll.addLast(4);
  ll.add(2,9);

     ll.print();
     System.out.println(ll.size);
    }
}