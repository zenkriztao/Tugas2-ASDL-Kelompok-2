/* import java.util.LinkedList;
import java.util.Scanner;

public class Pustaka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList link = new LinkedList();
        int pilihanOperasi;
        String sign;
  
        //data (sementara)
        link.add(30);
        link.add(20);
        link.add(10);
        link.add(99);
        link.add(200);

        System.out.println("\nDATA : " + link);

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
                case 2:
                    int pilihanPustakaPenghapusan;
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
            }
        }while(pilihanOperasi != 4);
        input.close();
    }
}
 */