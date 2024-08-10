public class Deleting_Elements_From_End_Of_Linked_List {

    public static Node head ;
    public static Node tail ;
    public static class Node{
        int data ;
        Node next ;

        Node(int d ){
            data = d ;
            next = null ;
        }
    }

    static int size ;

    public void add_Elements(int e){
        Node newNode = new Node(e);
     // size = 0;

        if(head==null){
            head = newNode ;
            tail=newNode ;
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }
        size++ ;

    }


    public void display_Linked_List(){
        Node current = head ;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else{
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next ;

            }
        }

    }


    public void deleting_Elements_From_End(){
        Node current = head ;
        Node previous = null;
        if(head == null){
            System.out.println("Linked List be empty");
        }
        while(head != null) {


            if (head == tail) {
                head = null;
                tail = null;

            } else if (head.next == tail) {
                head.next = null;
                tail = head;
            }
            else {
                int mid = 0;

                while (mid < size / 2) {
                    previous = current;
                    current = current.next;
                    mid++;

                }

                previous.next = current.next;
                current = null;
               // size-- ;


            }


            System.out.println("Linked List after deletion from end  ");


            display_Linked_List();
            previous = null;
            current = head;
            size-- ;
        }
            //System.out.println();




    }
    public static void main(String [] args){

        Deleting_Elements_From_End_Of_Linked_List list = new Deleting_Elements_From_End_Of_Linked_List();

          list.add_Elements(1);
          list.add_Elements(2);
          list.add_Elements(3);
         list.add_Elements(4);
         list.add_Elements(5);

        System.out.println("Linked List be ");
        list.display_Linked_List();
        list.deleting_Elements_From_End();

    }
}
