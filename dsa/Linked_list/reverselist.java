package dsa.Linked_list;

class ll{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head  = newNode;

        }

        newNode.next = head;
        head = newNode;
        
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;

        }
        Node currNode = head;
        
        while(currNode.next != null){
            currNode = currNode.next;
            
        }

        currNode.next = newNode;
        

    }

}

public class reverselist {
    public static void main(String args[]){

    }
}
