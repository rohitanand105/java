package dsa.Linked_list;

class ll {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

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

    public void delete() {

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

    }
}
