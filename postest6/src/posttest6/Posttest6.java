package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public final class Posttest6 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<gitar> datagitar = new ArrayList<>();
        ArrayList<piano> datapiano = new ArrayList<>();
        ArrayList<drum> datadrum = new ArrayList<>();
        int menu = 0;
        
        while(menu != 5){
            System.out.println("*---------- Musik Shop ---------*");
         System.out.println("* [1] Tambah Data                *");
         System.out.println("* [2] Lihat Data                 *");
         System.out.println("* [3] Update Data                *");
         System.out.println("* [4] Hapus Data                 *");
         System.out.println("* [5] Keluar                     *");
         System.out.println("*-------------------------------*");
         System.out.print("Pilih Menu : ");
         menu = Integer.parseInt(br.readLine());
           
           switch (menu) {
               case 1 -> {
                   System.out.println("{1}. Data Gitar");
                   System.out.println("{2}. Data Piano");
                   System.out.println("{3}. Data Drum");
                   System.out.println("Mau Tambah Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> {
                           System.out.print("id Barang : ");
                           String Id = br.readLine();
                           System.out.print("Jumlah Barang : ");
                           String Jumlah = br.readLine();
                           System.out.print("Jenis : ");
                           String Jenis = br.readLine();
                           System.out.print("Nama Barang : ");
                           String Barang = br.readLine();
                           System.out.print("Harga : ");
                           String Harga = br.readLine();
                           System.out.print("Merk : ");
                           String Merk = br.readLine();
                           System.out.print("Scale : ");
                           double scale = Double.parseDouble(br.readLine());
                           gitar newdata = new gitar(Id, Jumlah, Jenis, Barang, Harga, Merk, scale);
                           datagitar.add(newdata);
                           System.out.print("");
                       }
                       case 2 -> {
                           System.out.print("id Barang : ");
                           String Id = br.readLine();
                           System.out.print("Jumlah Barang : ");
                           String Jumlah = br.readLine();
                           System.out.print("Jenis : ");
                           String Jenis = br.readLine();
                           System.out.print("Nama Barang : ");
                           String Barang = br.readLine();
                           System.out.print("Harga : ");
                           String Harga = br.readLine();
                           System.out.print("Merk : ");
                           String Merk = br.readLine();
                           System.out.print("Scale : ");
                           double scale = Double.parseDouble(br.readLine());
                           piano newdata = new piano(Id, Jumlah, Jenis, Barang, Harga, Merk, scale);
                           datapiano.add(newdata);
                           System.out.print("");
                       }
                       case 3 -> {
                           System.out.print("id Barang : ");
                           String Id = br.readLine();
                           System.out.print("Jumlah Barang : ");
                           String Jumlah = br.readLine();
                           System.out.print("Jenis : ");
                           String Jenis = br.readLine();
                           System.out.print("Nama Barang : ");
                           String Barang = br.readLine();
                           System.out.print("Harga : ");
                           String Harga = br.readLine();
                           System.out.print("Merk : ");
                           String Merk = br.readLine();
                           System.out.print("Scale : ");
                           double scale = Double.parseDouble(br.readLine());
                           drum newdata = new drum(Id, Jumlah, Jenis, Barang, Harga, Merk, scale);
                           datadrum.add(newdata);
                           System.out.print("");
                       }
                    }
                }
               case 2 -> {
                   System.out.println("{1}. Data Gitar");
                   System.out.println("{2}. Data Piano");
                   System.out.println("{3}. Data Drum");
                   System.out.println("{4}. Semua Data");
                   System.out.println("Mau Liat Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> { 
                            for (int i = 0; i < datagitar.size(); i++){
                                System.out.println("Data barang Ke : " + (i+1));
                                datagitar.get(i).display();
                            }
                        }
                       case 2 -> { 
                            for (int i = 0; i < datapiano.size(); i++){
                                System.out.println("Data barang Ke : " + (i+1));
                                datapiano.get(i).display();
                            }
                        }
                       case 3 -> { 
                            for (int i = 0; i < datadrum.size(); i++){
                                System.out.println("Data barang Ke : " + (i+1));
                                datadrum.get(i).display();
                            }
                        }
                       case 4 -> {
                            int nomor = 1;
                            System.out.println("");
                            for (int i = 0; i < datapiano.size(); i++){
                                System.out.println("Data barang Ke : " + nomor);
                                datapiano.get(i).display();
                                nomor++;
                                System.out.println("");
                            }
                            for (int j = 0; j < datagitar.size(); j++){
                                System.out.println("Data barang Ke : " + nomor);
                                datagitar.get(j).display();
                                nomor++;
                                System.out.println("");
                            }
                            for (int k = 0; k < datadrum.size(); k++){
                                System.out.println("Data barang Ke : " + nomor);
                                datadrum.get(k).display();
                                nomor++;
                                System.out.println("");
                            }
                        }
                    }
                }
               case 3 -> {
                   System.out.println("{1}. Data Gitar");
                   System.out.println("{2}. Data Piano");
                   System.out.println("{3}. Data Drum");
                   System.out.println("Mau Ubah Data Apa ?:");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> {
                       for (int i = 0; i < datagitar.size(); i++){
                                datagitar.get(i).display();
                            }
                            
                            System.out.print("Data Ke Berapa Yang Mau Di Ubah ? :");
                            int target = Integer.parseInt(br.readLine());
                            target -= 1;
                            
                            System.out.println("");
                            System.out.println("|           ubah data gitar           |");
                            System.out.println("");
                            System.out.println("Id :");    
                            datagitar.get(target).setId(br.readLine());
                            System.out.println("Nama Barang :");
                            datagitar.get(target).setBarang(br.readLine());
                            System.out.println("Jenis :");
                            datagitar.get(target).setJenis(br.readLine());
                            System.out.println("Jumlah :");
                            datagitar.get(target).setJumlah(br.readLine());
                            System.out.println("Harga :");
                            datagitar.get(target).setHarga(br.readLine());
                            System.out.println("Merk :");
                            datagitar.get(target).setMerk(br.readLine());
                            System.out.println("Scale        :");
                            datagitar.get(target).setScale(Double.parseDouble(br.readLine()));
                            System.out.println("");
                        }
                       case 2 -> {
                       for (int i = 0; i < datapiano.size(); i++){
                                datapiano.get(i).display();
                            }
                            
                            System.out.print("Data Ke Berapa Yang Mau Di Ubah ? :");
                            int target = Integer.parseInt(br.readLine());
                            target -= 1;
                            
                            System.out.println("");
                            System.out.println("|           ubah data piano           |");
                            System.out.println("");
                            System.out.println("Id :");    
                            datapiano.get(target).setId(br.readLine());
                            System.out.println("Nama Barang :");
                            datapiano.get(target).setBarang(br.readLine());
                            System.out.println("Jenis :");
                            datapiano.get(target).setJenis(br.readLine());
                            System.out.println("Jumlah :");
                            datapiano.get(target).setJumlah(br.readLine());
                            System.out.println("Harga :");
                            datapiano.get(target).setHarga(br.readLine());
                            System.out.println("Merk :");
                            datapiano.get(target).setMerk(br.readLine());
                            System.out.println("Scale        :");
                            datapiano.get(target).setScale(Double.parseDouble(br.readLine()));
                            System.out.println("");
                        }
                       case 3 -> {
                       for (int i = 0; i < datadrum.size(); i++){
                                datadrum.get(i).display();
                            }
                            
                            System.out.print("Data Ke Berapa Yang Mau Di Ubah ? :");
                            int target = Integer.parseInt(br.readLine());
                            target -= 1;
                            
                            System.out.println("");
                            System.out.println("|           ubah data drum           |");
                            System.out.println("");
                            System.out.println("Id :");    
                            datadrum.get(target).setId(br.readLine());
                            System.out.println("Nama Barang :");
                            datadrum.get(target).setBarang(br.readLine());
                            System.out.println("Jenis :");
                            datadrum.get(target).setJenis(br.readLine());
                            System.out.println("Jumlah :");
                            datadrum.get(target).setJumlah(br.readLine());
                            System.out.println("Harga :");
                            datadrum.get(target).setHarga(br.readLine());
                            System.out.println("Merk :");
                            datadrum.get(target).setMerk(br.readLine());
                            System.out.println("Scale        :");
                            datadrum.get(target).setScale(Double.parseDouble(br.readLine()));
                            System.out.println("");
                        }
                   }
               }
               case 4 -> {
                    System.out.println("{1}. Data Gitar");
                    System.out.println("{2}. Data Piano");
                    System.out.println("{3}. Data Drum");
                    System.out.println("Mau Hapus Data Apa ? :");
                    
                    int pilihan1 = Integer.parseInt(br.readLine());
                    switch (pilihan1) {
                        case 1 -> {
                            
                            System.out.println("==== Hapus Data Gitar =====");
                            for (int i = 0; i < datagitar.size(); i++){
                                datagitar.get(i).display();
                            }
                            
                            System.out.println("");
                            System.out.print("Data Ke Berapa Yang Mau Di Hapus ? :");
                            int targethapus = Integer.parseInt(br.readLine());
                            targethapus -=1;
                            
                            datagitar.remove(targethapus);
                            System.out.println("Data berhasil dihapus");
                        }
                        case 2 -> {
                            System.out.println("==== Hapus Data Piano =====");
                            for (int i = 0; i < datapiano.size(); i++){
                                datapiano.get(i).display();
                            }
                            System.out.println("");                            
                            System.out.print("Data Ke Berapa Yang Mau Di Hapus ? :");
                            int targethapus = Integer.parseInt(br.readLine());
                            targethapus -=1;
                            
                            datapiano.remove(targethapus);
                            System.out.println("Data berhasil dihapus");
                        }
                        case 3 -> {
                            
                            System.out.println("==== Hapus Data Drum =====");
                            for (int i = 0; i < datadrum.size(); i++){
                                datadrum.get(i).display();
                            }
                            
                            System.out.println("");
                            System.out.print("Data Ke Berapa Yang Mau Di Hapus ? :");
                            int targethapus = Integer.parseInt(br.readLine());
                            targethapus -=1;
                            
                            datadrum.remove(targethapus);
                            System.out.println("Data berhasil dihapus");
                        }
                     }
               }
               case 5 -> {
                   exitProgram();
                   break;
                   //System.exit(menu);
                }
               default -> {
                   System.out.println("Pilihan Invalid");
               }
           }
        }
    }
    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anda yakin ingin keluar dari program? (y/n): ");
        String confirmation = scanner.nextLine();
        
        if (confirmation.equalsIgnoreCase("y")) {
            System.out.println("Terima kasih telah menggunakan program kami. Sampai jumpa!");
            System.exit(0);
        } else if (confirmation.equalsIgnoreCase("n")) {
            // tidak melakukan apa-apa, kembali ke menu
        } else {
            System.out.println("Pilihan yang Anda masukkan salah. Silakan coba lagi.");
        }
    }
}