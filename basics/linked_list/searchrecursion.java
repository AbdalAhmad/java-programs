import java.util.*;

public class searchrecursion {
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

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
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

  public void add(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < index - 1) { // prev find
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is  empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("LL is an empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    // prev : i = size -2
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key) { // key found
        return i;
      }
      temp = temp.next;
      i++;
    }
    // key not found
    return -1;
  }

public int helper(Node head , int key){
    if(head == null){
        return -1;

    }
    if(head.data == key){
        return 0;
    }
    int index = helper(head.next , key);
        if(index == -1){
          return -1;
        }
        return index+1;
    
}
public int recSearch(int key){
    return helper(head , key);
}
  public static void main(String args[]) {
    searchrecursion ll = new searchrecursion();

    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 9);

    System.out.println(ll.size);
    System.out.println(ll.recSearch(3));
    // System.out.print(ll.itrSearch(10));
    System.out.print(ll.recSearch(10));

  }
}
