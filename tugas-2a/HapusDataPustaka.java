/* import java.util.LinkedList;
import java.util.Scanner;

public class HapusDataPustaka {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList link = new LinkedList();
        int pilihan;
        String sign;
  
        // data (sementara)
        link.add(30);
        link.add(20);
        link.add(10);
        link.add(99);
        link.add(200);

        System.out.println("\nDATA : " + link);

        do{
            System.out.println();
            System.out.println("*** OPERASI HAPUS DATA DOUBLE LINKED LIST ***");
            System.out.println("    1. Hapus Data Awal" + 
                            "\n    2. Hapus Data Tengah" + 
                            "\n    3. Hapus Data Akhir" + 
                            "\n    4. Cetak Data" + 
                            "\n    5. Kembali");
            System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
            pilihan = input.nextInt();


            switch(pilihan){
                
                case 1:
                System.out.println("\n*** OPERASI HAPUS DATA AWAL DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                System.out.println("Yakin ingin menghapus data di awal ? Y ");
                System.out.println("Yakin ingin menghapus data di awal ? Y ");
                System.out.println("( Masukan T )");

                sign = input.next();
                   switch(sign){
                   case "Y":
                   link.removeFirst();
                   }
                break;
              
                case 2:
                System.out.println("\n*** OPERASI HAPUS DATA TENGAH DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                System.out.println("Yakin ingin menghapus data di tengah ? Y ");
                System.out.println("Yakin ingin menghapus data di tengah ? Y ");
                System.out.println("( Masukan T )");

                sign = input.next();
                   switch(sign){
                   case "Y":
                   link.remove(link.size() / 2);
                   }
                break;

                case 3:
                System.out.println("\n*** OPERASI HAPUS DATA AKHIR DOUBLE LINKED LIST ***");
                System.out.println("\n    INFO: - Masukan Y (ENTER) untuk menghapus data \n\t  - Masukan T untuk kembali ke menu sebelumnya\n");
                System.out.println("Yakin ingin menghapus data di akhir ? Y ");
                System.out.println("Yakin ingin menghapus data di akhir ? Y ");
                System.out.println("( Masukan T )"); 
              
                sign = input.next();
                   switch(sign){
                   case "Y":
                   link.removeLast();
                   }
                 break;
              
                case 4:
                System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                System.out.println(link);
                System.out.println("\n    INFO: - Masukan 5 untuk kembali ke menu sebelumnya\n");
                input.nextInt();
                break;

            }
        }while(pilihan !=0);
        input.close();
    }
}

 */