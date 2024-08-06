public class Single_Linked_List_In_Reverse_Order {
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

    public void element_Insertion(int e){
        Node newNode = new Node(e) ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }

    }


    public  void  display_Element_In_Reverse_Order(Node current ){
      // Node current = head ;
        if(head == null){
            //System.out.println("Linked List is empty") ;
        }
        if(current.next == null){
            System.out.println(current.data ) ;
            return ;
        }

        display_Element_In_Reverse_Order(current.next);
        System.out.println(current.data) ;

    }


    public static void main(String [] args){
        Single_Linked_List_In_Reverse_Order list = new Single_Linked_List_In_Reverse_Order();
        list.element_Insertion(100);
        list.element_Insertion(200);
        list.element_Insertion(300);
        System.out.println("Elements of Linked List in reverse order be ") ;
        list.display_Element_In_Reverse_Order(head);

    }
}
