package dsa.Linked_list;


//create a linked list.
class ll{
    Node head;
    private int size;
    Node first = head;
    Node last = null;


    ll(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            size++;

        }

        
    }
//create a class to add the value from front of linked list. 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = null;
        head = newNode;
        size++;

    }

    public void deletemi(){
        while(first == last){
            Node middle = (first = last);
            (if)


        }
    }
    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");

            currNode = currNode.next;

        }
        System.out.println("NULL");

    }
    public int getSize()
        {
            return size;
    }
}

public class dmn {
    public static void main(String args[]){
        ll list = new ll();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);


        list.printlist();
        while(head.next != list.getSize()){

        }



    }
    
}
