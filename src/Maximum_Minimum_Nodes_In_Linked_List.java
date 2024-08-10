public class Maximum_Minimum_Nodes_In_Linked_List {
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
            System.out.println("Linked List is empty");
        }
        else{
            while(current != null){
                System.out.print(current.data + " ");
                current= current.next ;}

        }
    }
    public void  Max_Min_Nodes(){
        Node curr = head ;

        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        while(curr != null){
            max = Math.max(max,curr.data) ;
            min = Math.min(min,curr.data);
            curr = curr.next ;
        }
        System.out.println();
        System.out.println("Maximum element of linked list be "+ max);
        System.out.println("Minimum element of linked list be " + min);

    }


    public static void main(String [] args){
        Maximum_Minimum_Nodes_In_Linked_List list = new Maximum_Minimum_Nodes_In_Linked_List();

        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);
        list.add_Elements(4);
        System.out.println("Linked List be ") ;
        list.display_Elements();

        list.Max_Min_Nodes();
    }
}
