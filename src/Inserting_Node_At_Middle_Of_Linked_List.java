public class Inserting_Node_At_Middle_Of_Linked_List {

    public static Node head ;
    public static Node tail ;
    public static int size ;
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
       // Node newNode = e ;
        if(head == null){
//            System.out.println("Linked List be empty");
            head = newNode ;
            tail = newNode ;
        }
        else if(head == tail){
            tail.next = newNode ;
            tail = newNode ;

        }
        else{
            int mid = (size%2 == 0)?(size/2):((size+1)/2) ;
            Node middle = head;
            Node middleNext ;
            for(int i = 1; i<mid ; i++){
                middle = middle.next ;
            }
            middleNext = middle.next ;
            middle.next = newNode ;
            newNode.next = middleNext ;
//            System.out.println("Middle element be " + middle.data);
//            System.out.print("mid be " + mid);


        }
        System.out.println();
        System.out.println("Linked List after inserting " + e + " at the middle be");
        display_Elements();
        size++ ;
//        System.out.println("size be " + size);

    }
    public void display_Elements(){
        Node current = head ;
        if(head == null){
            System.out.println("Linked List be empty");
        }
        else{
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }
    }

    public static void main(String [] args){
        Inserting_Node_At_Middle_Of_Linked_List list = new Inserting_Node_At_Middle_Of_Linked_List();
        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);
        list.add_Elements(4);
        list.add_Elements(5);

        //System.out.println("Linked List be ");
       // list.display_Elements();

    }
}
