import java.util.Scanner;

public class MainDraft {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DLL llist = new DLL();
        int pilihan;

        do{
            System.out.println("*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
            System.out.println("    1. Tambah Data Awal" + 
                            "\n    2. Tambah Data Tengah" + 
                            "\n    3. Tambah Data Akhir" + 
                            "\n    4. Cetak Data" + 
                            "\n    5. Kembali");
            System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
            pilihan = input.nextInt();
            boolean sign = true;

            switch(pilihan){
                case 1:
                System.out.println("\n*** OPERASI TAMBAH DATA AWAL DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.tambahDataAwal(d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 2:
                System.out.println("\n*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.InsertAfter(llist.head.next, d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 3:
                System.out.println("\n*** OPERASI TAMBAH DATA AKHIR DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 0 untuk kembali ke menu sebelumnya\n");
                do{
                    for(int i = 1; i <= 100000000; i++){
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt();
                            llist.tambahDataAkhir(d);
                        if(d == 0){ 
                            sign = false; 
                            break;
                        }
                    }
                    System.out.println();
                }while(sign == true);
                break;

                case 4:
                System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                llist.printlist(llist.head);
                System.out.println("\n    INFO: - Input 0 untuk kembali ke menu sebelumnya");
                    input.nextInt();
                break;
            }
        }while(pilihan != 0);
        input.close();
    }
    
}

class DLL {
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
    public void tambahDataAwal(int new_data){
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
    public void tambahDataAkhir(int new_data){
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
        System.out.println("    Urutan data dari depan");
        System.out.print("    ");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
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
