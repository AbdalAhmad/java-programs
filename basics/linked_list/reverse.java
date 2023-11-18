import java.util.*;

public class reverse {
  public static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
  size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  

  public void print() {
    if (head == null) {
      System.out.println("ll is an empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }


  public void deleteNthfromEnd(int n ){
   // calculate size
   int sz = 0;
   Node temp = head;
   while(temp!= null){
      temp = temp.next;
      sz++;
   }
   if(n== sz){
      head = head.next; // remove first
      return;
   }
   // sz
   int i = 1;
   int iTofind = sz-n;
   Node prev  = head;
   while(i<iTofind){
    prev = prev.next;
    i++;
   }
   prev.next = prev.next.next;
   return;
  }


  public static void main(String args[]) {
    reverse ll = new reverse();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);

    ll.print();
    // ll.reverse();
    ll.deleteNthfromEnd(3);
    ll.print();
  }
}
