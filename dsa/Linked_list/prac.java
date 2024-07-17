package dsa.Linked_list;

class ll {
    Node head;
    private int size;

    ll(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;

        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");

            currNode = currNode.next;

        }
        System.out.println("NULL");

    }

    public void deleteFirst() {
        if(head == null){
            System.out.print("the list is empty");
            return;
        }
        size--;
        head = head.next;


    }
    public void deletelast(){
        if(head == null){
            System.out.print("the list is empty");
            return;
        }
        if (head.next == null ){
            head = null;
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;

    }
    public int getSize() {
        return size;

    }

}

public class prac {
    public static void main(String args[]) {
        ll list = new ll();
        list.addFirst("a");
        list.addFirst("name");
        list.addFirst("Mummy");
        list.addLast("how");
        list.addLast("there");

        list.printlist();

        System.out.println(list.getSize());


    }
}
