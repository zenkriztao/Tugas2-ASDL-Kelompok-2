import java.util.LinkedList;
import java.util.Scanner;

public class MainDraft {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DLL llist = new DLL();
        LinkedList link = new LinkedList();
        int pilihanLinkedList;
        int pilihanOperasi;

        /* //data (sementara)
        link.add(30);
        link.add(20);
        link.add(10);
        link.add(99);
        link.add(200);
        System.out.println("\nDATA : " + link); */

        do {
            System.out.println("-_- DOUBLE LINKED LIST -_-");
            System.out.print("Silahkan pilih jenis Double Linked List :\n" +
                            "1. Manual.\n" +
                            "2. Pustaka.\n" +
                            "3. Keluar.\n" +
                            "Input pilihan : ");
            pilihanLinkedList = input.nextInt();
            System.out.println();
            switch (pilihanLinkedList) {
                case 1:
                    do {
                        System.out.println("_-_ MANUAL DOUBLE LINKED LIST _-_");
                        System.out.print("Silahkan pilih operasi yang akan di lakukan :\n" +
                            "1. Penambahan Data.\n" +
                            "2. Penghapusan Data.\n" +
                            "3. Pencarian/pengubahan Data.\n" +
                            "4. Kembali.\n" +
                            "Input pilihan : ");
                        pilihanOperasi = input.nextInt();
                        System.out.println( );
                        switch (pilihanOperasi) {
                            case 1:
                                int pilihanPenambahan;
                                do {
                                    System.out.println("*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
                                    System.out.println("    1. Tambah Data Awal" +
                                        "\n    2. Tambah Data Tengah" +
                                        "\n    3. Tambah Data Akhir" +
                                        "\n    4. Cetak Data" +
                                        "\n    5. Kembali");
                                    System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
                                    pilihanPenambahan = input.nextInt();
                                    System.out.println();
                                    boolean sign = true;

                                    switch (pilihanPenambahan) {
                                        case 1:
                                            System.out.println("*** OPERASI TAMBAH DATA AWAL DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 000 untuk kembali ke menu sebelumnya\n");
                                            do {
                                                for (int i = 1; i <= 100000000; i++) {
                                                    System.out.print("    Data ke-" + i + ": ");
                                                    int d = input.nextInt();
                                                    llist.tambahDataAwal(d);
                                                    if (d == 000) {
                                                        sign = false;
                                                        break;
                                                    }
                                                }
                                                System.out.println();
                                            } while (sign == true);
                                        break;

                                        case 2:
                                            System.out.println("*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 000 untuk kembali ke menu sebelumnya\n");
                                            do {
                                                try{
                                                    for (int i = 1; i <= 100000000; i++) {
                                                        System.out.print("    Data ke-" + i + ": ");
                                                        int d = input.nextInt();
                                                        llist.InsertAfter(llist.head.next, d);
                                                        if (d == 000) {
                                                            sign = false;
                                                            break;
                                                        }
                                                    }
                                                }catch (NullPointerException e){
                                                    System.out.println("    Anda harus menambahkan data dulu untuk mengakses fitur ini.\n");
                                                    break;
                                                }
                                                System.out.println();
                                            } while (sign == true);
                                        break;

                                        case 3:
                                            System.out.println("*** OPERASI TAMBAH DATA AKHIR DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukkan data angka (Integer) \n\t  - Input 000 untuk kembali ke menu sebelumnya\n");
                                            do {
                                                for (int i = 1; i <= 100000000; i++) {
                                                    System.out.print("    Data ke-" + i + ": ");
                                                    int d = input.nextInt();
                                                    llist.tambahDataAkhir(d);
                                                    if (d == 000) {
                                                        sign = false;
                                                        break;
                                                    }
                                                }
                                                System.out.println();
                                            } while (sign == true);
                                        break;

                                        case 4:
                                            System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***\n");
                                            llist.printlist(llist.head);
                                            System.out.println("\n    INFO: - Input 0 untuk kembali ke menu sebelumnya");
                                            System.out.print("\n    Input user: ");
                                            input.nextInt();
                                            System.out.println();
                                            break;
                                    
                                        case 5:
                                        break;

                                        default:
                                        System.out.println("    Pilihan tidak valid.\n");
                                    }
                                } while (pilihanPenambahan != 5);
                            break;

                            case 2:
                                int pilihanPenghapusan;
                                do {
                                    System.out.println("--- PENGHAPUSAN DATA DOUBLE LINKED LIST ---");
                                    System.out.print("    Silahkan pilih letak data yang akan di hapus :\n" +
                                        "    1. Penghapusan Data Awal.\n" +
                                        "    2. Penghapusan Data Tengah.\n" +
                                        "    3. Penghapusan Data Akhir.\n" +
                                        "    4. Cetak Data.\n" +
                                        "    5. Kembali.\n" +
                                        "    Masukkan Pilihan : ");
                                    pilihanPenghapusan = input.nextInt();
                                    System.out.println();
                                    switch (pilihanPenghapusan) {
                                        case 1:
                                            System.out.println("--- Penghapusan Data Awal Linked List ___"); //Sudah pacak digabung samo yang faruk
                                            System.out.println("    INFO: - Silahkan tekan tombol K untuk menghapus data.\n" +
                                                "    \t  - Tekan tombol Z untuk kembali ke menu sebelumnya.");
                                            String penghapusanAwal = input.nextLine();
                                            do {
                                                System.out.print("    Input user : ");
                                                penghapusanAwal = input.nextLine();
                                                try {
                                                    if (penghapusanAwal.equalsIgnoreCase("k")) {
                                                        llist.hapusAwal();
                                                        System.out.println("    Penghapusan Data Awal berhasil.");
                                                    } else if (penghapusanAwal.equalsIgnoreCase("z")) {
                                                        System.out.println();
                                                    } else System.out.println("    Input tidak valid.");
                                                } catch (NullPointerException w) {
                                                    System.out.println("    Tidak ada data yang bisa dihapus");
                                                }
                                            } while (!penghapusanAwal.equalsIgnoreCase("z"));
                                        break;
                                        case 3:
                                            System.out.println("\n___ Penghapusan Data Akhir Linked List ---"); //Masih dakbiso, tail nyo daktau yang mano dari penambahan
                                            System.out.println("    INFO: - Silahkan tekan tombol K untuk menghapus data.\n" +
                                                "\t  - Tekan tombol Z untuk kembali ke menu sebelumnya.");
                                            String penghapusanAkhir = input.nextLine();
                                            do {
                                                System.out.print("    Input user : ");
                                                penghapusanAkhir = input.nextLine();
                                                try {
                                                    if (penghapusanAkhir.equalsIgnoreCase("k")) {
                                                        llist.hapusAkhir();
                                                        System.out.println("    Penghapusan Data Akhir berhasil.");
                                                    }
                                                    else if (penghapusanAkhir.equalsIgnoreCase("z")){
                                                        System.out.println();
                                                    } else System.out.println("    Input tidak valid.");
                                                } catch (NullPointerException w) {
                                                    System.out.println("    Tidak ada data yang bisa dihapus");
                                                }
                                            } while (!penghapusanAkhir.equalsIgnoreCase("z"));
                                        break;
                                        case 2:
                                            System.out.println("___ Penghapusan Data Tengah Linked List ___"); //Masih kacau, dakpaham cakmano caro ngambek urutan node nyo
                                            System.out.println("    INFO: - data ke-n akan dihapus.\n" +
                                                "\t  - Tekan tombol 999 untuk kembali ke menu sebelumnya.");
                                            int penghapusanTengah = input.nextInt();
                                            do {
                                                System.out.print("    n = ");
                                                penghapusanTengah = input.nextInt();
                                                DLL.Node trash = new DLL.Node(penghapusanTengah); //dak berhasil
                                                llist.hapusTengah(trash);
                                                if (penghapusanTengah != 999 )
                                                    System.out.println("    Data ke " + penghapusanTengah + " berhasil dihapus.");
                                            } while (penghapusanTengah != 999);
                                        break;
                                        case 4:
                                            System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***\n");
                                            llist.printlist(llist.head);
                                            System.out.println("\n    INFO: - Input 0 untuk kembali ke menu sebelumnya");
                                            System.out.print("\n    Input user: ");
                                            input.nextInt();
                                            System.out.println();                 
                                        break;

                                        case 5:
                                        break;

                                        default:
                                            System.out.println("    Pilihan tidak valid.\n");
                                        break;
                                    }
                                } while (pilihanPenghapusan != 5);
                            break;

                            case 3:
                            //Pencarian / pengubahan data manual
                            //Muhammad Rizki


                            break;
                            case 4:
                                System.out.println();
                            break;
                            default:
                                System.out.println("Input tidak valid.\n");
                        }
                    }while (pilihanOperasi != 4);
                break;

                case 2:
                    do{
                        System.out.println("_-_ PUSTAKA DOUBLE LINKED LIST _-_");
                        System.out.print("Silahkan pilih operasi yang akan di lakukan :\n" +
                            "1. Penambahan Data.\n" +
                            "2. Penghapusan Data.\n" +
                            "3. Pencarian/pengubahan Data.\n" +
                            "4. Kembali.\n" +
                            "Input pilihan : ");
                        pilihanOperasi = input.nextInt();
                        System.out.println( );
                        switch(pilihanOperasi){
                            case 1:
                                //PENAMBAHAN DATA PUSTAKA

                            break;    
                            case 2:
                                int pilihanPustakaPenghapusan;
                                String sign;
                                do{
                                    System.out.println();
                                    System.out.println("*** OPERASI HAPUS DATA DOUBLE LINKED LIST ***");
                                    System.out.println("    1. Hapus Data Awal" + 
                                            "\n    2. Hapus Data Tengah" + 
                                            "\n    3. Hapus Data Akhir" + 
                                            "\n    4. Cetak Data" + 
                                            "\n    5. Kembali");
                                    System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
                                    pilihanPustakaPenghapusan = input.nextInt();
                                    switch(pilihanPustakaPenghapusan){
                                        case 1:
                                            System.out.println("\n*** OPERASI HAPUS DATA AWAL DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                                            System.out.println("    Yakin ingin menghapus data di awal ? Y ");
                                            System.out.print("    (Masukan Pilihan): ");
                                            sign = input.next();
                                            switch(sign){
                                                case "Y", "y":
                                                    link.removeFirst();
                                                    System.out.println("    Data awal berhasil dihapus.");
                                                break;
                                            }
                                        break;
                                        case 2:
                                            System.out.println("\n*** OPERASI HAPUS DATA TENGAH DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                                            System.out.println("    Yakin ingin menghapus data di tengah ? Y ");
                                            System.out.print("    (Masukan Pilihan): ");
                                            sign = input.next();
                                            switch(sign){
                                                case "Y", "y":
                                                    link.remove(link.size() / 2);
                                                    System.out.println("    Data tengah berhasil dihapus.");
                                                break;
                                            }
                                        break;
                                        case 3:
                                            System.out.println("\n*** OPERASI HAPUS DATA AKHIR DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                                            System.out.println("    Yakin ingin menghapus data di akhir ? Y ");
                                            System.out.print("    (Masukan Pilihan): "); 
                                            sign = input.next();
                                            switch(sign){
                                                case "Y", "y":
                                                    link.removeLast();
                                                    System.out.println("    Data akhir berhasil dihapus.");
                                                break;
                                            }
                                        break;
                                        case 4:
                                            System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                                            System.out.println("    " + link);
                                            System.out.println("\n    INFO: - Masukan 5 untuk kembali ke menu sebelumnya");
                                            System.out.print("    ");
                                            input.nextInt();
                                        break;
                                        case 5:
                                            System.out.println();
                                        break;
                                        default:
                                            System.out.println("    Pilihan tidak valid."); 
                                    }
                                }while(pilihanPustakaPenghapusan != 5);
                            break;
                            case 3:
                            //PENCARIAN/PENGUBAHAN DATA

                            case 4:
                            break;
                            default:
                                    System.out.println("    Pilihan tidak valid.");
                        }       
                    }while(pilihanOperasi != 4);
                break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan Double Linked List Kel.2");
                break;
                default:
                    System.out.println("Input tidak valid.\n");
            }
        }while (pilihanLinkedList!=3);
        input.close();
    }
}

class DLL {
    Node head;
    Node tail;

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

        if(new_data == 000){
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
 
    // TAMBAH DATA TENGAH;
    public void InsertAfter(Node prev_Node, int new_data){
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
 
    // TAMBAH DATA AKHIR
    public void tambahDataAkhir(int new_data){
        Node new_node = new Node(new_data);
        tail = head;
        new_node.next = null;
 
        if(head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }

        if(new_data == 000){
            return;
        }
 
        while(tail.next != null){
            tail = tail.next;
        }
 
        tail.next = new_node;
        new_node.prev = tail;
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

    //Penghapusan Data Awal
    public void hapusAwal() {
        Node newHead = head.next;
        newHead.prev = null;
        head = newHead;
    }

    //Penghapusan Data Akhir
    public void hapusAkhir() {
        Node newTail = tail.prev;
        newTail.next = null;
        tail = newTail;
    }

    //Penghapusan Data Tengah
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
}
