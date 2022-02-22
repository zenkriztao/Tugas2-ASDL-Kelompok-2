public class DLL {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d){ 
            data = d; 
        }
    }
 
    // TAMBAH DATA AWAL
    public void push(int new_data){
        Node new_Node = new Node(new_data);
 
        new_Node.next = head;
        new_Node.prev = null;

        if(new_data == 0){
            return;
        }
 
        if(head != null){
            head.prev = new_Node;
        }
 
        head = new_Node;
    }
   
    // TAMBAH DATA TENGAH;
    public void InsertBefore(Node next_node, int new_data){
        if(next_node == null){
            System.out.println("The given next node can not be NULL");
            return;
        }

        if(new_data == 0){
            return;
        }
         
        Node new_node = new Node(new_data);         
        new_node.prev = next_node.prev;
        next_node.prev = new_node;        
        new_node.next = next_node;
         
        if(new_node.prev != null){
            new_node.prev.next = new_node;
        }else{
            head = new_node;
        }
    }
 
    // TAMBAH DATA TENGAH;
    public void InsertAfter(Node prev_Node, int new_data){
        if(prev_Node == null){
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        if(new_data == 0){
            return;
        }
 
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next; 
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
 
        if(new_node.next != null){
            new_node.next.prev = new_node;
        }
    }
 
    // TAMBAH DATA AKHIR
    public void append(int new_data){
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
 
        if(head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }

        if(new_data == 0){
            return;
        }
 
        while(last.next != null){
            last = last.next;
        }
 
        last.next = new_node; 
        new_node.prev = last;
    }

    //PRINT DOUBLE LINKED LIST
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("    Forward Direction");
        System.out.print("    ");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("    Reverse Direction");
        System.out.print("    ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
}
