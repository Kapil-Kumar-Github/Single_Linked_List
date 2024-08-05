public class Create_Linked_List {
    public Node head = null ;
    public Node tail = null ;



    static class Node{
        Node next ;
        int data ;
        Node(int d){
            data = d ;
            next = null ;
        }

    }
    public void add_Elements(int n){
        Node newNode = new Node(n);

        if(head == null){
            head = newNode ;
            tail = newNode ;
            //tail.next = newNode ;
            // tail
        }
        else{
            tail.next = newNode ;
            tail = newNode ;
        }


    }
    public void display_Elements(){
        Node current = head ;
        if(head==null){
            System.out.println("Linked List is empty.") ;
        }


        else{
            while(current !=null){
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }
    }

    public int Count_Elements(){
        Node current = head ;
        int count = 0;
        if(head == null){
            return count ;
        }
        else{
            while(current!= null){
                count++ ;

                current = current.next ;

            }
           // return count ;
        }
        return count ;
    }
    public static void main(String [] args){
        Create_Linked_List list = new Create_Linked_List();
        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);
        list.add_Elements(4);
        list.add_Elements(5);

        System.out.println("Elements of Linked List be ") ;
        list.display_Elements() ;
        System.out.println(); 

        System.out.println("Number of elements in Single Linked List be " + list.Count_Elements());


    }
}
