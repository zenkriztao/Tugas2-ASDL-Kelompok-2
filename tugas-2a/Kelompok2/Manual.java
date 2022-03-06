package Kelompok2;

    /////////// CLASS MANUAL DOUBLE LINKED LIST ////////////

class DLL {

    static class Node {
        Node prev = null;
        Node next = null;
        int data = 0;

        Node(int d) { 
            data = d; 
        }
    }
    
    /////////////////// KELOMPOK 2 ASDL ////////////////////
    
    Node head = null;
    Node tail = null;
    Node linkNode = null;

    public void tambahDataAwal(int new_data){
        Node new_Node = new Node(new_data);
 
        if (head == null)  // msh kosong
            tail = new_Node;
        else { // head sdh menunjuk sesuatu
            new_Node.next = head;
            head.prev = new_Node;
        }
        head = new_Node;
    }
   
    public void insertBefore(Node next_node, int new_data){
        if(next_node == null){
            System.out.println("    Anda harus menambahkan data dulu untuk mengakses fitur ini.");
            return;
        }

        if(new_data == 000){
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
 
    public void insertAfter(Node prev_Node, int new_data){
        if(prev_Node == null){
            System.out.println("    Anda harus menambahkan data dulu untuk mengakses fitur ini.");
            return;
        }

        if(new_data == 000){
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
 
    public void tambahDataAkhir(int new_data){
        Node new_Node = new Node(new_data);

        if (tail == null)  // msh kosong
            head = new_Node;
        else { // tail sdh menunjuk sesuatu
            new_Node.prev = tail;
            tail.next = new_Node;
        }
        tail = new_Node;
    }

    public boolean hapusAwal() {
        if (! isData()) {
            if (head == tail) { // hanya 1 elemen
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return true;
        }
        return false;
    }

    public boolean hapusAkhir() {
        if (! isData()) {
            if (head == tail) { // hny 1 elemen
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return true;
        }
        return false;
    }

    public void hapusTengah(Node trash) {
        Node remover = head;
        try {
            while (remover.next != null) {
                if (remover.next == trash) {
                    remover.next = trash.next;
                    trash.next.prev = remover;
                    break;
                }
                remover = remover.next;
            }
        } catch (NullPointerException e) {
            System.out.println("Data yang dipilih merupakan data awal/data akhir.");
            System.exit(0);
        }
    }
    
    public boolean isData() {
        return head == null;
    }
    
    public boolean isExist(int data) {
        linkNode = head;
        while (linkNode != null) {
            if (linkNode.data == data) {
                return true;
            }
            linkNode = linkNode.next;
        }
        return false;
    }
    
    public Node nodeOf(int data) {
        isExist(data);
        return linkNode;
    }
    
    public boolean cariData(int dataLama, int dataBaru) {
        if (isExist(dataLama)) {
            linkNode.data = dataBaru;
            return true;
        }
        return false;
    }

    public boolean updateDataAwal(int dataBaru) {
        if (! isData()) {
            head.data = dataBaru;
            return true;
        }
        return false;
    }

    public boolean updateDataAkhir(int dataBaru) {
        if (! isData()) {
            tail.data = dataBaru;
            return true;
        }
        return false;
    }

    public void printlist() {
        Node last = head;
        System.out.println("    Urutan data dari depan");
        System.out.print("    ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        
        last = tail;
        System.out.println();
        System.out.println("    Urutan data kebalikan");
        System.out.print("    ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }
}