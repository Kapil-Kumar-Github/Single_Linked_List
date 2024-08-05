public class Single_Linked_List_Example {
    static Node head ;

    static class Node{
        int data ;
        Node next ;

        Node(int d){
            data = d ;
            next = null ;
        }
    }
    public void display_Elements(Node n){
        //System.out.println(n.data + " ") ;
        System.out.print(n.data + " ");

        while(n.next != null){

            n = n.next ;
            System.out.print(n.data + " ") ;

        }
    }

    public static void main(String[] args){
        Single_Linked_List_Example list = new Single_Linked_List_Example() ;
        list.head = new Node(1) ;
        Node second = new Node(2);
        Node third = new Node(3) ;
        Node fourth = new Node(4);

        list.head.next = second ;
        second.next = third ;
        third.next = fourth ;

        list.display_Elements(head) ;


    }
}
