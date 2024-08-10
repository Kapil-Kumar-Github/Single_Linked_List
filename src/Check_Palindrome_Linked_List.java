public class Check_Palindrome_Linked_List {

    public static Node head ;
    public static Node tail ;

    public static class Node{
        int data ;
        Node next ;
        Node(int d){
            data = d ;
            next = null;
        }
    }
    static int size ;
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
        size++ ;

    }
    public void display_Elements(){
        Node current = head ;
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            while(current!= null){
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }
    }
    public Node reverse(Node t){
        Node next,prev = null ;
        Node curr = t ;

        while(curr != null){
            next = curr.next ;
            curr.next = null ;
            prev = curr ;
            curr = next ;
        }
        return prev ;

    }
    public void check_Palindrome(){
        int mid= (size%2 == 0) ? size/2 :((size+1)/2) ;
//        System.out.println("size be " + size);
//        System.out.println("mid be " + mid);
        Node middle = head ;
        boolean m = true ;
        Node first = head ;

        for(int i = 1 ; i<mid; i++){
            middle = middle.next ;

        }
        Node revhead = reverse(middle.next);

        while(first != null && revhead!=null){
            if(head.data != revhead.data){
                m = false ;
                break ;
            }
            first = first.next ;
            revhead = revhead.next ;
        }
        System.out.println();
        if(m== false){
            System.out.println("Not Palindrome Linkled List");
        }
        else{
            System.out.println("Palindrome Linked List");
        }
       // System.out.println("Middle node be " + middle.data);

    }
    public static void main(String [] args){
        Check_Palindrome_Linked_List list = new Check_Palindrome_Linked_List();

        list.add_Elements(1);
        list.add_Elements(2);
        list.add_Elements(3);
        list.add_Elements(2);
        list.add_Elements(1);
        list.add_Elements(9);

        System.out.println("Linked List be ");
        list.display_Elements();

        list.check_Palindrome();

        System.out.println("Linked List after checking for palindrome be ");
        list.display_Elements();


    }


}
