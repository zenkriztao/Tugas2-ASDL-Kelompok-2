package Tugas;
import java.util.LinkedList;
import java.util.Scanner;

public class tambahDataLinkedList {             // pakai pustaka
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    int pilihanPenambahanData;

    LinkedList link = new LinkedList();
    link.add(30);
    link.add(20);
    link.add(10);

    System.out.println("*** DOUBLE LINKED LIST ***");
    System.out.println("1. Manual");
    System.out.println("2. Pustaka");
    System.out.println("3. Keluar");

    System.out.print("Silahkan pilih [1/2/3] : ");
    pilihanPenambahanData = input.nextInt();

    System.out.println("\n*** OPERASI TAMBAH DATA DOUBLE LINKED LIST ***");
    System.out.println("1. Tambah Data Awal");
    System.out.println("2. Tambah Data Tengah");
    System.out.println("3. Tambah Data Akhir");
    System.out.println("4. Cetak Data");
    System.out.println("5. Kembali");

    System.out.print("Silahkan pilih [1/2/3/4/5] : ");

    pilihanPenambahanData = input.nextInt();

    switch(pilihanPenambahanData){
        case 1:
        System.out.println(link);
        System.out.print("Tambah data awal : ");
        int awal = input.nextInt();
        link.addFirst(awal);
        System.out.println(link);
        break;

        case 2:
        System.out.println("*** OPERASI TAMBAH DATA TENGAH DOUBLE LINKED LIST ***");
        System.out.println(link);
        System.out.print("Tambah data tengah : ");
        int tengah = input.nextInt();
        link.add(2, tengah);
        System.out.println(link);
        break;

        case 3:
        System.out.println(link);
        System.out.print("Tambah data akhir : ");
        int akhir = input.nextInt();
        link.addLast(akhir);
        System.out.println(link);
        break;

        case 4:
        System.out.println("*** DATA LINKED LIST***");
        System.out.println(link);
        break;

        case 5:
        System.out.println("    " + link);
        System.out.println("\n    INFO: - Masukan 5 untuk kembali ke menu sebelumnya");
        System.out.print("    ");
        input.nextInt(); input.nextLine();
    }


        }



     /*list.addFirst(35);
    System.out.println("\nMenambah data awal");
    System.out.println(list);
    */

    /*list.addLast(5);
    System.out.println("\nMenambah data awal");
    System.out.println(list);

    list.add(2, 25);
    System.out.println("\nMenambah data tengah");
    System.out.println(list);
    */
   

    
  }
