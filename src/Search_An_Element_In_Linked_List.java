public class Search_An_Element_In_Linked_List {
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

    public void add_Elements(int e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode ;
            tail = newNode ;

        }
    }
    public void search_Elements(int s){
        Node key = new Node(s);

        Node current = head ;
        int index = 1;
        if(head == null){
            System.out.println("Linked List is empty.");

        }
        else{
            while(current != null){
                if(current.data == s){
                    System.out.println();
                    System.out.println("Element "+ s + " present at index "+ index);
                    break ;
                }
                else {
                    current = current.next;
                    index++;
                }

            }


        }

         if(current == null){
             System.out.println();
            System.out.println("Element " + s + " does not present in linked list. ");
        }
    }
    public void display_Elements(){
        Node curr = head ;
        if(head == null){
//            System.out.println();
            System.out.println("Linked list is empty");
        }
        else{
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next ;
            }
        }
    }

            public static void main(String [] args){
        Search_An_Element_In_Linked_List list = new Search_An_Element_In_Linked_List();
        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);

        System.out.println("Linked List be ");
        list.display_Elements();

        list.search_Elements(7);

        //list.display_Elements();

    }
}
