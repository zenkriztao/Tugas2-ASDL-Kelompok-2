package Kelompok2;

import java.util.LinkedList;
import java.util.Scanner;

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
                    do {
                        try{
                            for (int i = 1; i <= 100000000; i++) {
                                System.out.print("    Data ke-" + i + ": ");
                                int d = input.nextInt(); input.nextLine();
                                if (d == 0) {
                                    sign = false;
                                    break;
                                }
                                llist.insertAfter(llist.head.next, d);
                            }
                        }catch (NullPointerException e){
                            System.out.println("    Anda harus menambahkan data dulu untuk mengakses fitur ini.\n");
                            break;
                        }
                        System.out.println();
                    } while (sign == true);
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
                        penghapusanAwal = input.nextLine();
                        if (penghapusanAwal.equalsIgnoreCase("k")) {
                            if (llist.hapusAkhir()) {
                                System.out.println("    Penghapusan Data Akhir berhasil.");
                            } else
                                System.out.println("    Tidak ada data yang bisa dihapus");
                        } else if (penghapusanAwal.equalsIgnoreCase("z")) {
                            System.out.println();
                        } else 
                            System.out.println(pesanError);
                        
                    } while (!penghapusanAwal.equalsIgnoreCase("z"));
                    break;
                    
                case 2:
                    System.out.println("___ Penghapusan Data Tengah Linked List ___"); //Masih kacau, dakpaham cakmano caro ngambek urutan node nyo
                    System.out.println("    INFO: - data ke-n akan dihapus.\n" +
                        "\t  - Tekan tombol 999 untuk kembali ke menu.");
                    int penghapusanTengah;
                    do {
                        System.out.print("    n = ");
                        penghapusanTengah = input.nextInt(); input.nextLine();
                        DLL.Node trash = new DLL.Node(penghapusanTengah); //dak berhasil
                        llist.hapusTengah(trash);
                        if (penghapusanTengah != 999 )
                            System.out.println("    Data ke " + penghapusanTengah + " berhasil dihapus.");
                    } while (penghapusanTengah != 999);
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
        System.out.println();
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

        /* //data (sementara)
        link.add(30);
        link.add(20);
        link.add(10);
        link.add(99);
        link.add(200);
        System.out.println("\nDATA : " + link); */

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
                                        link.add(2, tengah);
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
                                            System.out.print("    Data Awal sekarang : "  + link.getFirst() + "\n    Masukan data pengubah : " );
                                                dataPengganti = input.nextInt();
                 
                                            link.set(link.indexOf(link.getFirst()), dataPengganti );
                                            //System.out.println("[" + llist.getFirst() + "]");
                                        break;
                                        case 2 :
                                            System.out.print("    Data Tengah sekarang : "  + link.get(link.size() / 2) + "\n    Masukan data pengubah : ");
                                                dataPengganti = input.nextInt();
                                        
                                            link.set(link.size() / 2, dataPengganti);
                                            //System.out.println("[" + llist.get(llist.size() / 2) + "]");
                                        break;    
                                        case 3 :
                                            System.out.print("    Data Akhir sekarang : "  + link.getLast() + "\n    Masukan data pengubah : ");
                                                dataPengganti = input.nextInt();
                                        
                                            link.set(link.size() - 1, dataPengganti);
                                            //System.out.println("[" + llist.getLast() + "]");
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
