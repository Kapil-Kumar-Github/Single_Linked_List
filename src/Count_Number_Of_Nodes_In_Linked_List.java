public class Count_Number_Of_Nodes_In_Linked_List {
    public static Node head =  null ;
    public static Node tail = null ;

    public static class Node{
        int data ;
        Node next ;
        Node(int d){
            data = d ;
            next = null ;
        }

    }
    public void add_Elements(int d){
        Node newNode = new Node(d);

        if(head == null){
            head= newNode ;
            tail = newNode ;
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }

    }
    public static void display_Elements(){
        Node current = head ;

        if(head == null){
            System.out.println("Linked List is empty");

        }
        else{
            if(current != null){
                System.out.print(current.data);
                current = current.next ;
            }
        }
    }
    public int Count_Elements(){
        int count = 0 ;
        Node current = head ;
        if(head == null){
            return 0 ;
        }
        else{
            while(current != null) {
                count++;
                current = current.next ;
            }
            return count ;

        }

    }

    public static void main(String [] args){
        Create_Linked_List list = new Create_Linked_List();
        list.add_Elements(1);
        list.add_Elements(2);
        list.display_Elements();

        list.Count_Elements();

    }
}
