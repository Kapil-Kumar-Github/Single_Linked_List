public class Delete_A_Node_From_Middle {
    public static Node head;
    public static Node tail;

    public static class Node {


        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null ;

        }
    }
    static int size = 0;

    public void add_Elements(int e){
        Node newNode = new Node( e) ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }
        size++ ;


    }


    public void display_Elements(){
        Node current = head ;
        if(head ==null){
            System.out.println("Linked List is empty");
        }
        else{
            while(current != null){
                System.out.print(current.data + " ");
                current= current.next ;
            }

        }
    }

    public void delete_Elements_From_Middle(){

        while(size>0) {
            int mid = size / 2;
            Node temp = head;
            Node previous = null;
            int i = 0;
            if (head == tail) {
                head = null;
                tail = null;
            } else if (head.next == tail) {
                head.next = null ;
                head = tail;
                //System.out.println("Working") ;

            } else {
                while (i < mid) {
                    previous = temp;

                    temp = temp.next;
                    i++;

                }
                previous.next = temp.next;
            }

            System.out.println();
            System.out.println("Linked List After deletion");

            display_Elements();
            size-- ;

        }


    }

    public static void main(String[] args){

        Delete_A_Node_From_Middle list = new Delete_A_Node_From_Middle() ;

        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);
       list.add_Elements(4);
       list.add_Elements(5);
        System.out.println("Elements of Linked List be ");
        list.display_Elements() ;

        list.delete_Elements_From_Middle();

    }
}
