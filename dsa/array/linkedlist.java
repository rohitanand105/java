package dsa.array;



public class linkedlist {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;

        }
    }

    //method to insert a new node
    public static linkedlist insert(linkedlist list, int data){
        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;

        }
        else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;

            }
            last.next = new_node; 
        }
        return list;

    }

    public static void printList(linkedlist list) 
    { 
        Node currNode = list.head; 
    
        System.out.print("LinkedList: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
    
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 

    public int prod(){
        if(head == null) return 0;
        int product = 1;
        Node current = head;
        while (current != null) {
            product *= current.data;
            current = current.next;
        }

        return product;


    }
    
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        linkedlist list = new linkedlist(); 
   
        // 
        // ******INSERTION****** 
        // 
   
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
   
        // Print the LinkedList 
        printList(list); 

        

        
    } 
}
    


