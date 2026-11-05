 class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
    
}

public class Node1 {

    public static void main(String[] args ) {
        Node n1= new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;

        Node temp = n1;

        while (temp!= null){
    
        System.out.print(temp.data + "->");
        
        temp = temp.next; 
        }
        System.out.println("null"); 
              
        }
    }
