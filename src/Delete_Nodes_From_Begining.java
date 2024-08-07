public class Delete_Nodes_From_Begining {

    public static Node head ;
    public static Node tail ;

    public static class Node{
        int data ;
        Node next ;
        Node(int d){
            data = d ;
            next = null ;

        }
    }
    public void add_Elements(int e){
        Node newNode = new Node(e) ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
        }

        else{
            tail.next = newNode ;
            tail = newNode;
        }

    }

    public void display_Elements(){
        Node current = head ;

        if(head == null){
            System.out.println("Linked List is empty.") ;
        }

        else{
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }
        System.out.println();
    }

    public void delete_Elements_From_Begining(){
        Node current = head ;
        if(head == null){
            System.out.println("Linked List is empty.");
        }
        else{
            while(current != null) {
                display_Elements();
                current = head.next;
                head = current ;
            }
        }
    }

    public static void main(String [] args){
        Delete_Nodes_From_Begining list = new Delete_Nodes_From_Begining();
        list.add_Elements(10);
        list.add_Elements(20);
        list.add_Elements(30);
        list.add_Elements(40);
        System.out.println();

        System.out.println("Linked List while elements deleting from begining");

        list.delete_Elements_From_Begining();


    }

}
