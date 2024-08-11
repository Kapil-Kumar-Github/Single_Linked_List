public class Inserting_Node_At_The_Beginning_Of_Linked_List {
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
    public void add_Elements_At_The_Beginning_Of_Linked_List(int e){
        Node newNode = new Node(e);

        if(head == null){
            head = newNode ;
            tail = newNode ;
        }
        else{
            Node temp = head ;
            head = newNode;
            newNode.next = temp ;

        }
        System.out.println();
        System.out.println("Linked List after inserting  "+e + " at the beginning ");
        display_Elements();


    }

    public void display_Elements(){
        Node current= head ;
        if(head == null){
            System.out.println("Linked List be empty.");
        }
        else{
            while(current != null){
                System.out.print(current.data+ " ");
                current = current.next ;
            }
        }
    }

    public static void main(String [] args){
        Inserting_Node_At_The_Beginning_Of_Linked_List list = new Inserting_Node_At_The_Beginning_Of_Linked_List();
        list.add_Elements_At_The_Beginning_Of_Linked_List(1);
      list.add_Elements_At_The_Beginning_Of_Linked_List(2);
      list.add_Elements_At_The_Beginning_Of_Linked_List(3);
      list.add_Elements_At_The_Beginning_Of_Linked_List(4);
    }

}
