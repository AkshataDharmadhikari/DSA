


class Node {
    // Linkedlist

    int data;
    Node next;

    Node(int data) 
    { 
        // Constructor
        this.data = data;
        this.next = null;

    }

}
public class LinkedList {

    Node head;

     LinkedList() {
        this.head = null;
    }


    void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
   
        }
    }

    void printList()
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data+"->");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();

        
    }
}
