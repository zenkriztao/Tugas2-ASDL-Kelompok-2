package tugas2;

import java.util.LinkedList;
import java.util.Scanner;


public class PencarianPengubahanData {
    public static void main(String[] args) {

        LinkedList llist = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        int sign;

        llist.add(10);
        llist.add(20);
        llist.add(30);

        do{
                System.out.println();
                System.out.println("*** OPERASI Pencarian/Pengubahan DATA DOUBLE LINKED LIST ***");
                System.out.println("    1. Pencarian/Pengubahan Data Awal" + 
                                "\n    2. Pencarian/Pengubahan Data Tengah" + 
                                "\n    3. Pencarian/Pengubahan Data Akhir" + 
                                "\n    4. Cetak Data" + 
                                "\n    5. Kembali");
                System.out.print("    Silahkan Pilih (1/2/3/4/5): ");
                    pilihan = input.nextInt();

                switch(pilihan){

                    case 1 : 
                        System.out.print("Data Awal sekarang : "  + llist.getFirst() + "\nMasukan data pengubah : " );
                            sign = input.nextInt();

                            llist.set(llist.indexOf(llist.getFirst()),sign );
//                      System.out.println("[" + llist.getFirst() + "]");
                    break;

                    case 2 :
                        System.out.print("Data Tengah sekarang : "  + llist.get(llist.size() / 2) + "\nMasukan data pengubah : ");
                            sign = input.nextInt();
                        
                            llist.set(llist.size() / 2, sign);
//                      System.out.println("[" + llist.get(llist.size() / 2) + "]");
                    break;    

                    case 3 :
                    	System.out.print("Data Akhir sekarang : "  + llist.getLast() + "\nMasukan data pengubah : ");
                            sign = input.nextInt();
                        
                            llist.set(llist.size() - 1, sign);
//                      System.out.println("[" + llist.getLast() + "]");
                    break;

                    case 4:
                        System.out.println("\n*** CETAK DATA DOUBLE LINKED LIST ***\n");
                        System.out.println(llist);
                        System.out.println("\n    INFO: - Masukan 5 untuk kembali ke menu sebelumnya\n");
                            input.nextInt();
                    break;      
            }

        }while(pilihan !=0);
        input.close();
    }
}
