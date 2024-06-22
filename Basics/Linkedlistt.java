class NodeOne{

    int data;
    NodeOne next;

    NodeOne(int data){
        
        this.data = data;
        this.next = null;
    }
    
}

public class Linkedlistt{
    NodeOne head;

    Linkedlistt() {
        this.head = null;
    }


     void add(int data)
    {
        NodeOne newNode  = new NodeOne(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            
            NodeOne currentNode = head;
            while(currentNode.next!=null)
            {
                currentNode = currentNode.next;
            }

            currentNode.next  = newNode;
        }
    }

void printlist()
{
    NodeOne currenNode = head;
    while(currenNode!=null)
    {
        System.out.println(currenNode.data);
        currenNode = currenNode.next;
    }
    System.out.println("null");

}

    public static void main(String[] args) {
        Linkedlistt list2 = new Linkedlistt();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.printlist();
    }
}