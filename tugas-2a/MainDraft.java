import java.util.LinkedList;
import java.util.Scanner;

class DLL {

    static class Node {
        Node prev = null;
        Node next = null;
        int data = 0;

        Node(int d) { 
            data = d; 
        }
    }
    
    /////////// KELOMPOK 2 ASDL ////////////
    
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
    public void hapusTengah(int nilaiData) {
        Node nodeSekarang = head;
        Node pembantu = null;
        while (nodeSekarang != null && nodeSekarang.data != nilaiData) {
            pembantu = nodeSekarang;
            nodeSekarang = nodeSekarang.next;
        }
        if (nodeSekarang != null) {
            pembantu.next = nodeSekarang.next;
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
        System.out.print("    ");
        System.out.print("[ ");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.print("]");
    }
}

////////////////// KELOMPOK 2 ASDL  //////////////////////////////////////////

public class MainDraft {
    static Scanner input = new Scanner(System.in);
    static String pesanError = "Input tidak valid!";
    
    static void llManualTambah(DLL llist, String argJudul) {
        String judul = argJudul + " > TAMBAH DATA";
        int pilihan;
        
        do {
            System.out.print(
                "\n\n" + judul + "\n\n" +
                "1. Tambah Data Awal\n" +
                "2. Tambah Data Tengah\n" +
                "3. Tambah Data Akhir\n" +
                "4. Cetak Data\n" +
                "5. Kembali\n" +
                "Silahkan Pilih [1/2/3/4/5]:  "
            );
            pilihan = "012345".indexOf((input.nextLine() + "5").charAt(0));
            System.out.println();
            
            boolean sign = true;

            switch (pilihan) {
                case 1:
                    System.out.println(
                        "*** OPERASI TAMBAH DATA AWAL DOUBLE LINKED LIST ***\n\n" +
                        "    INFO: - Masukkan data angka (integer)\n" + 
                        "\t  - Input 0 untuk kembali ke menu\n"
                    );
                    do {
                        for (int i = 1; i <= 100000000; i++) {
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt(); input.nextLine();
                            if (d == 0) {
                                sign = false;
                                break;
                            }
                            llist.tambahDataAwal(d);
                        }
                        System.out.println();
                    } while (sign == true);
                    break;

                case 2:
                    System.out.println(
                        "*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***\n\n" +
                        "    INFO: - Masukkan data angka (integer) \n" +
                        "\t  - Input 0 untuk kembali ke menu\n");
                    while(true){
                        int dataDicari;
                        llist.printlist();
                        System.out.println("\n    Input 0 untuk kembali ke menu");
                        System.out.print("    Masukkan data tengah yang ingin diinput setelahnya: ");
                        dataDicari = input.nextInt(); input.nextLine();

                        if(dataDicari == 0) break;

                        if(llist.isExist(dataDicari)){
                            try{
                                System.out.print("    Input data tengah: ");
                                int d = input.nextInt(); input.nextLine();
                                llist.insertAfter(llist.nodeOf(dataDicari), d);
                                System.out.println("    Data tengah berhasil diinput.\n");
                            }catch(Exception e){
                                System.out.println("    Error terjadi, mohon dicek kembali\n");
                                break;
                            }
                        }else {
                            System.out.println("    Data yang dicari tidak ditemukan.\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println(
                        "*** OPERASI TAMBAH DATA AKHIR DOUBLE LINKED LIST ***\n\n" +
                        "    INFO: - Masukkan data angka (Integer) \n" +
                        "\t  - Input 0 untuk kembali ke menu\n"
                    );
                    do {
                        for (int i = 1; i <= 100000000; i++) {
                            System.out.print("    Data ke-" + i + ": ");
                            int d = input.nextInt(); input.nextLine();
                            if (d == 0) {
                                sign = false;
                                break;
                            }
                            llist.tambahDataAkhir(d);
                        }
                        System.out.println();
                    } while (sign == true);
                    break;

                case 4:
                    llManualCetak(llist);
                    break;
            
                case 5:
                    return;

                default:
                    System.out.println(pesanError + "\n");
            }
        } while (pilihan != 5);
    }
    
    static void llManualHapus(DLL llist, String argJudul) {
        String judul = argJudul + " > HAPUS DATA";
        
        do {
            int pilihan;
            
            System.out.print(
                "\n\n" + judul + "\n\n" +
                "1. Hapus Data Awal\n" +
                "2. Hapus Data Tengah\n" +
                "3. Hapus Data Akhir\n" +
                "4. Cetak Data\n" +
                "5. Kembali\n" +
                "Silahkan Pilih [1/2/3/4/5]: "
            );
            pilihan = "012345".indexOf((input.nextLine() + "5").charAt(0));
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    System.out.println(
                        "*** Penghapusan Data Awal Linked List ***\n" +
                        "    INFO: - Silahkan tekan tombol K untuk menghapus data.\n" +
                        "    \t  - Tekan tombol Z untuk kembali ke menu."
                    );
                    String penghapusanAwal;
                    do {
                        System.out.print("    Input user : ");
                        penghapusanAwal = input.nextLine();
                        if (penghapusanAwal.equalsIgnoreCase("k")) {
                            if (llist.hapusAwal()) {
                                System.out.println("    Penghapusan Data Awal berhasil.");
                            } else
                                System.out.println("    Tidak ada data yang bisa dihapus");
                        } else if (penghapusanAwal.equalsIgnoreCase("z")) {
                            System.out.println();
                        } else 
                            System.out.println(pesanError);
                        
                    } while (!penghapusanAwal.equalsIgnoreCase("z"));
                    break;
                    
                case 3:
                    System.out.println(
                        "*** Penghapusan Data Akhir Linked List ***\n" +
                        "    INFO: - Silahkan tekan tombol K untuk menghapus data.\n" +
                        "\t  - Tekan tombol Z untuk kembali ke menu.");
                    String penghapusanAkhir;
                    do {
                        System.out.print("    Input user : ");
                        penghapusanAkhir = input.nextLine();
                        if (penghapusanAkhir.equalsIgnoreCase("k")) {
                            if (llist.hapusAkhir()) {
                                System.out.println("    Penghapusan Data Akhir berhasil.");
                            } else
                                System.out.println("    Tidak ada data yang bisa dihapus");
                        } else if (penghapusanAkhir.equalsIgnoreCase("z")) {
                            System.out.println();
                        } else 
                            System.out.println(pesanError);
                        
                    } while (!penghapusanAkhir.equalsIgnoreCase("z"));
                    break;
                    
                case 2:
                    System.out.println(
                            "*** Penghapusan Data Tertentu Linked List ***\n\n" +
                                    "    Masukkan nilai data yang akan dihapus.\n" +
                                    "    Note : input \"0\" untuk keluar.\n" +
                                    "    Hanya berfungsi untuk nilai data yang berada di tengah list.\n");
                    while (true) {
                        int dataDicari;
                        llist.printlist();
                        System.out.println("\n\n    Input 0 untuk keluar");
                        System.out.print("    Nilai data yang akan dihapus : ");
                        dataDicari = input.nextInt(); input.nextLine();

                        if (dataDicari == 0) break;

                        if (llist.isExist(dataDicari)) {
                            try {
                                llist.hapusTengah(dataDicari);
                            } catch (NullPointerException e) {
                                System.out.println("    Data berada di awal list.");
                                break;
                            }
                            System.out.println("    Nilai " + dataDicari + " ditemukan!");
                            System.out.println("    Data bernilai " + dataDicari + " telah dihapus.\n");
                        } else
                            System.out.println("\n    Data yg dicari tidak ditemukan!\n");
                    }
                    break;

                case 4:
                    llManualCetak(llist);
                    break;

                case 5:
                    return;

                default:
                    System.out.println(pesanError + "\n");
            }
        } while (true);
    }
    
    static void llManualCari(DLL llist, String argJudul) {
        String judul = argJudul + " > CARI/UBAH DATA";
        
        do { // Membuat loop menu pilihan opsi 3
            int pilihan;
            System.out.println("\n*** OPERASI PENCARIAN/PENGUBAHAN DATA DOUBLE LINKED LIST ***");
            System.out.print(
                "1. Pencarian Data/Pengubahan Data Tertentu\n" +
                "2. Pengubahan Data Awal\n" +
                "3. Pengubahan Data Akhir\n" +
                "4. Cetak Data\n" +
                "5. Kembali\n" +
                "Silakan pilih [1/2/3/4/5] : "
            );
            pilihan = "012345".indexOf((input.nextLine() + "5").charAt(0));
            System.out.println();
            
            switch (pilihan) {
                case 1: 
                    if (llist.isData()) { // jika data node head masih kosong, tampilkan pesan kembali user
                        System.out.println("List data masih kosong.");
                        tungguEnter();
                    } else {
                        System.out.println(
                            "*** PENCARIAN/PENGUBAHAN DATA TERTENTU ***\n\n" +
                            "    INFO: - Isi 'dicari' dgn 0 untuk kembali ke menu.\n" +
                            "          - Isi 'Mengubah Data menjadi : ' dgn 0 untuk tidak mengubah."
                        );
                    while (true) {
                        int dataLama;
                        int dataBaru;
                                            
                        System.out.print("\n    Data yg dicari : ");
                        dataLama = input.nextInt(); input.nextLine();
                                            
                        if (dataLama == 0) break;
                                            
                        if (llist.isExist(dataLama)) {
                            System.out.print("    -> Mengubah Data menjadi   : "); // membuat statement tanyakan user jika ingin mengubah data atau tidak
                            dataBaru = input.nextInt(); input.nextLine();
                        if (dataBaru != 0) { // membuat perkondisian data
                            // data diperbarui
                            boolean isUpdDone = llist.cariData(dataLama, dataBaru);
                            System.out.println("\n    Data berhasil diubah : " + dataLama + " -> " + dataBaru);
                        } else
                            System.out.println("\n    Data tidak bisa diubah");
                        } else 
                            System.out.println("\n    Data yg dicari tidak ditemukan!");
                        }
                    }
                    System.out.println();
                break;
                    
                case 2:
                    if (llist.isData()) {
                        System.out.println("List data masih kosong.");
                    } else {
                        int dataLama = llist.head.data;
                        int dataBaru;
                                        
                        System.out.print(
                            "*** PENGUBAHAN DATA DOUBLE LINKED LIST MANUAL AWAL ***\n\n" +
                            "    INFO: - Isi 'Akan diubah menjadi' dgn 0 untuk tidak mengubah.\n\n" +
                            "    Data awal      : " + dataLama + "\n" +
                            "    -> Akan diubah menjadi     : "
                        );
                        dataBaru = input.nextInt(); input.nextLine();
                        if (dataBaru != 0) { // cek kondisi data lama dari node
                            // data berhasil diperbarui
                            llist.head.data = dataBaru;
                            System.out.println("\n    Data berhasil diubah : " + dataLama + " -> " + dataBaru);
                        } else
                            System.out.println("\n    Data tidak diubah");
                    }
                    System.out.println();
                    tungguEnter();
                break;

                case 3: 
                    if (llist.isData()) {
                        System.out.println("List data masih kosong.");
                    } else {
                        int dataLama = llist.tail.data;
                        int dataBaru;
                                            
                        System.out.print(
                            "*** PENGUBAHAN DATA DOUBLE LINKED LIST MANUAL AKHIR ***\n\n" +
                            "    INFO: - Isi 'Akan diubah menjadi' dgn 0 untuk tidak mengubah.\n\n" +
                            "    Data akhir     : " + dataLama + "\n" +
                            "    -> Akan diubah menjadi     : "
                        );
                        dataBaru = input.nextInt(); input.nextLine();
                        if (dataBaru != 0) {
                            // data berhasil diperbarui 
                            llist.tail.data = dataBaru;
                            System.out.println("\n    Data berhasil diubah : " + dataLama + " -> " + dataBaru);
                        } else
                            System.out.println("\n    Data tidak diubah");
                    }
                    System.out.println();
                    tungguEnter();
                break;
                    
                case 4:
                    llManualCetak(llist);
                    break;
                    
                case 5:
                    return;
                    
                default:
                    System.out.println(pesanError + "\n");
            }
        } while(true);
    }
    
    static void llManualCetak(DLL llist) {
        System.out.println("*** CETAK DATA DOUBLE LINKED LIST ***\n");
        llist.printlist();
        System.out.println("\n");
        tungguEnter();
    }
    
    static void llManual(DLL llist, String argJudul) {
        String judul = argJudul + " > MANUAL - OPERASI";
        
        do {
            int pilihan;
            
                System.out.println("*** OPERASI DOUBLE LINKED LIST ***");
                System.out.print("Silahkan pilih operasi yang akan di lakukan :\n" +
                "1. Penambahan Data.  \u00BB\n" +
                "2. Penghapusan Data  \u00BB\n" +
                "3. Pencarian/pengubahan Data  \u00BB\n" +
                "4. Cetak Data\n" +
                "5. Kembali\n" +
                "Silahkan Pilih [1/2/3/4/5] : "
            );
            pilihan = "012345".indexOf((input.nextLine() + "5").charAt(0));
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    llManualTambah(llist, judul);
                    break;
                    
                case 2: 
                    if (llist.isData()) {
                        System.out.println("    List kosong.\n");
                        tungguEnter();
                    } else
                        llManualHapus(llist, judul);
                    break;
                    
                case 3:
                    if (llist.isData()) {
                        System.out.println("    List kosong.\n");
                        tungguEnter();
                    } else
                        llManualCari(llist, judul);
                    break;
                    
                case 4:
                    if (llist.isData()) {
                        System.out.println("    List kosong.\n");
                        tungguEnter();
                    } else
                        llManualCetak(llist);
                    break;
                    
                case 5:
                    return;
                    
                default:
                    System.out.println(pesanError + "\n");
            }
        } while (true);
    }
    
    static void tungguEnter() {
        System.out.print("    INFO: - Tekan Enter untuk kembali ke menu...");
        input.nextLine();
        System.out.println();
    }
    
    ////
    
    public static void main(String[] args){
        DLL llist = new DLL();
        LinkedList link = new LinkedList();
        int pilihan;
        int pilihanOperasi;

        do {
            String judul = "*** DOUBLE LINKED LIST ***";
            System.out.print(
                "\n\n" + judul + "\n\n" +
                "1. Manual  \u00BB\n" +
                "2. Pustaka  \u00BB\n" +
                "3. Keluar\n" +
                "Silahkan Pilih [1/2/3] : "
            );
            // pilihanLinkedList = input.nextInt(); input.nextLine();
            pilihan = "0123".indexOf((input.nextLine() + "3").charAt(0));
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    llManual(llist, judul);
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
                        pilihanOperasi = input.nextInt(); input.nextLine();
                        System.out.println( );
                        switch(pilihanOperasi){
                            case 1:
                            int pilihanPenambahanData;
                            do{
                                System.out.println("\n*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
                                System.out.println("    1. Tambah Data Awal");
                                System.out.println("    2. Tambah Data Tengah");
                                System.out.println("    3. Tambah Data Akhir");
                                System.out.println("    4. Cetak Data");
                                System.out.println("    5. Kembali");
                                System.out.print("    Silahkan pilih [1/2/3/4/5] : ");
                                pilihanPenambahanData = input.nextInt();

                                switch(pilihanPenambahanData){
                                    case 1:
                                        System.out.println("    " + link);
                                        System.out.print("    Tambah data awal : ");
                                        int awal = input.nextInt();
                                        link.addFirst(awal);
                                        System.out.println("    " + link);
                                    break;
                                    case 2: 
                                        System.out.println("*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
                                        System.out.println("    " + link);
                                        System.out.print("    Tambah data tengah : ");
                                        int tengah = input.nextInt();
                                        link.add(link.size() / 2, tengah);
                                        System.out.println("    " + link);
                                    break;
                                    case 3:
                                        System.out.println("    " + link);
                                        System.out.print("    Tambah data akhir : ");
                                        int akhir = input.nextInt();
                                        link.addLast(akhir);
                                        System.out.println("    " + link);
                                    break;
                                    case 4:
                                        System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST***\n");
                                        System.out.println("    " + link);
                                        System.out.println();
                                    break;
                                    case 5:
                                        System.out.println();
                                    break;
                                    default:
                                        System.out.println("    Data tidak valid.");
                                    break;
                                }
                            }while(pilihanPenambahanData != 5);
                        break;  
                            case 2:
                                int pilihanPustakaPenghapusan;
                                String sign;
                                do{
                                    System.out.println("\n*** OPERASI HAPUS DATA DOUBLE LINKED LIST ***");
                                    System.out.println(
                                        "    1. Hapus Data Awal\n" + 
                                        "    2. Hapus Data Tengah\n" + 
                                        "    3. Hapus Data Akhir\n" + 
                                        "    4. Cetak Data\n" + 
                                        "    5. Kembali"
                                    );
                                    System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
                                    pilihanPustakaPenghapusan = input.nextInt(); input.nextLine();
                                    switch(pilihanPustakaPenghapusan){
                                        case 1:
                                            System.out.println("\n*** OPERASI HAPUS DATA AWAL DOUBLE LINKED LIST ***");
                                            System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                                            System.out.println("    Yakin ingin menghapus data di awal ? Y ");
                                            System.out.print("    (Masukan Pilihan): ");
                                            sign = input.next();
                                            switch(sign){
                                                case "Y": case "y":
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
                                                case "Y": case "y":
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
                                                case "Y": case "y":
                                                    link.removeLast();
                                                    System.out.println("    Data akhir berhasil dihapus.");
                                                break;
                                            }
                                        break;
                                        case 4:
                                            System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                                            System.out.println("    " + link);
                                            System.out.println();
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
                                int pilihanPustakaPencarian;
                                int dataPengganti;
                                String opsiUbah;
                                do{
                                    System.out.println();
                                    System.out.println("*** OPERASI Pencarian/Pengubahan DATA DOUBLE LINKED LIST ***");
                                    System.out.println("    1. Pencarian/Pengubahan Data Awal" + 
                                                "\n    2. Pencarian/Pengubahan Data Tengah" + 
                                                "\n    3. Pencarian/Pengubahan Data Akhir" + 
                                                "\n    4. Cetak Data" + 
                                                "\n    5. Kembali");
                                    System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
                                    pilihanPustakaPencarian = input.nextInt();
                                    switch(pilihanPustakaPencarian){
                                        case 1 : 
                                        System.out.print("    Data Awal sekarang : "  + link.getFirst() + "\n");
                                        System.out.println("    INFO: - Input Y untuk mengubah data awal." +
                                                            "\n\t  - Input N jika tidak mengubah data awal.");
                                        System.out.print("    Pilihan anda: ");
                                        opsiUbah = input.next(); input.nextLine();
                                        switch(opsiUbah){
                                            case "y", "Y":
                                                System.out.print("    Masukkan data pengubah: ");
                                                dataPengganti = input.nextInt(); input.nextLine();
                                                link.set(link.indexOf(link.getFirst()), dataPengganti );
                                            break;
                                            case "n", "N":
                                                System.out.println("    Anda tidak menginput data");
                                            break;
                                            default:
                                                System.out.println("    Input anda salah");
                                            break;
                                        }
                                        break;
                                        case 2 :
                                            System.out.print("    Data Tengah sekarang : "  + link.get(link.size() / 2) + "\n");
                                            System.out.println("    INFO: - Input Y untuk mengubah data tengah." +
                                                                "\n\t  - Input N jika tidak mengubah data tengah.");
                                            System.out.print("    Pilihan anda: ");
                                            opsiUbah = input.next(); input.nextLine();
                                            switch(opsiUbah){
                                                case "y", "Y":
                                                    System.out.print("    Masukkan data pengubah: ");
                                                    dataPengganti = input.nextInt(); input.nextLine();
                                                    link.set(link.size() / 2, dataPengganti);
                                                break;
                                                case "n", "N":
                                                    System.out.println("    Anda tidak menginput data");
                                                break;
                                                default:
                                                    System.out.println("    Input anda salah");
                                                break;
                                            }
                                        break;    
                                        case 3 :
                                            System.out.print("    Data Akhir sekarang : "  + link.getLast() + "\n");
                                            System.out.println("    INFO: - Input Y untuk mengubah data akhir." +
                                                                "\n\t  - Input N jika tidak mengubah data akhir.");
                                            System.out.print("    Pilihan anda: ");
                                            opsiUbah = input.next(); input.nextLine();
                                            switch(opsiUbah){
                                                case "y", "Y":
                                                    System.out.print("    Masukkan data pengubah: ");
                                                    dataPengganti = input.nextInt(); input.nextLine();
                                                    link.set(link.size() - 1, dataPengganti);
                                                break;
                                                case "n", "N":
                                                    System.out.println("    Anda tidak menginput data");
                                                break;
                                                default:
                                                    System.out.println("    Input anda salah");
                                                break;
                                            }
                                        break;
                                        case 4:
                                            System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                                            System.out.println("    " + link);
                                            System.out.println();
                                        break;      
                                        case 5:
                                            System.out.println();
                                        break;
                                        default:
                                            System.out.println("    Data tidak valid.");
                                        break;
                                    }
                                }while(pilihanPustakaPencarian !=5);
                            break;

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
                    System.out.println(pesanError + "\n");
            }
        } while (pilihan != 3);
        
        input.close();
    }
}
