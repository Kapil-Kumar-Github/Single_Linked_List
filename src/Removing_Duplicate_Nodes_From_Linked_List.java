public class Removing_Duplicate_Nodes_From_Linked_List {
    public static Node head ;
    public static Node tail ;

    public static class Node{
        int data ;
        Node next ;
        Node(int d){
            data = d;
            next = null ;
        }
    }
    public void add_Elements(int e){
        Node newNode = new Node(e);

        if(head == null){
            head = newNode ;
            tail = newNode ;
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }
    }

    public void display_Elements(){
        Node current = head ;
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }
    }

    public void removing_Duplicate_Elements(){
        Node curr = head ;

        while(curr != null){
            Node prev = curr ;
            Node temp = curr.next ;

            while(temp != null){


                if(curr.data == temp.data){
                    prev.next = temp.next ;
                    temp = temp.next ;
                }
                else {
                    prev = temp;
                    temp = temp.next;
                }
            }
            curr = curr.next ;


        }
        System.out.println();
        System.out.println("Linked list after removing duplicate elements from it.");
        display_Elements();
    }

    public static void main(String [] args){
        Removing_Duplicate_Nodes_From_Linked_List list = new Removing_Duplicate_Nodes_From_Linked_List();

        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(1);
        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(4);
        list.add_Elements(1);
        System.out.println("Linked List be ");
        list.display_Elements();
        System.out.println();

        list.removing_Duplicate_Elements();

    }
}
