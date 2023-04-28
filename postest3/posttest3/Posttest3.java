package posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Posttest3 {
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
                   System.out.println("Mau Liat Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> { 
                            for (int i = 0; i < datagitar.size(); i++){
                            System.out.println("Data pelanggan Ke : " + (i+1));
                            System.out.println("Id  : " + datagitar.get(i).getId());
                            System.out.println("Jumlah BArang  : " + datagitar.get(i).getJumlah());
                            System.out.println("Nama Barang : " + datagitar.get(i).getBarang());
                            System.out.println("Merk : " + datagitar.get(i).getMerk());
                            System.out.println("jenis : " + datagitar.get(i).getJenis());
                            System.out.println("Harga : " + datagitar.get(i).getHarga());
                            System.out.println("scale : " + datagitar.get(i).getscale());
                            }
                        }
                       case 2 -> { 
                            for (int i = 0; i < datapiano.size(); i++){
                            System.out.println("Data pelanggan Ke : " + (i+1));
                            System.out.println("Id  : " + datapiano.get(i).getId());
                            System.out.println("Jumlah BArang  : " + datapiano.get(i).getJumlah());
                            System.out.println("Nama Barang : " + datapiano.get(i).getBarang());
                            System.out.println("Merk : " + datapiano.get(i).getMerk());
                            System.out.println("Jenis : " + datapiano.get(i).getJenis());
                            System.out.println("Harga : " + datapiano.get(i).getHarga());
                            System.out.println("scale : " + datapiano.get(i).getscale());
                            }
                        }
                       case 3 -> { 
                            for (int i = 0; i < datadrum.size(); i++){
                            System.out.println("Data pelanggan Ke : " + (i+1));
                            System.out.println("Id  : " + datadrum.get(i).getId());
                            System.out.println("Jumlah BArang  : " + datadrum.get(i).getJumlah());
                            System.out.println("Nama Barang : " + datadrum.get(i).getBarang());
                            System.out.println("Merk : " + datadrum.get(i).getMerk());
                            System.out.println("Jenis : " + datadrum.get(i).getJenis());
                            System.out.println("Harga : " + datadrum.get(i).getHarga());
                            System.out.println("scale : " + datadrum.get(i).getscale());
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
                            System.out.println("Masukkan Id Barang :");
                            String Id = br.readLine();
                            for (gitar setpelanggan : datagitar){
                                if (setpelanggan.getId().equals(Id)){
                                        System.out.println("Ganti Jumlah Barang : ");
                                        setpelanggan.setJumlah(br.readLine());
                           
                                        System.out.println("Ganti Nama Barang : ");
                                        setpelanggan.setBarang(br.readLine());
                           
                                        System.out.println("Ganti Jenis Barang : ");
                                        setpelanggan.setJenis(br.readLine());
                           
                                        System.out.println("Ganti Harga Barang : ");
                                        setpelanggan.setHarga(br.readLine());
                                        
                                        System.out.println("Ganti merk Barang : ");
                                        setpelanggan.setMerk(br.readLine());
                                        
                                        System.out.println("Ganti scale : ");
                                        setpelanggan.setscale(Double.parseDouble(br.readLine()));
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Masukkan Id Barang :");
                            String Id = br.readLine();
                            for (piano setpelanggan : datapiano){
                                if (setpelanggan.getId().equals(Id)){
                                    System.out.println("Ganti Jumlah Barang : ");
                                        setpelanggan.setJumlah(br.readLine());
                           
                                        System.out.println("Ganti Nama Barang : ");
                                        setpelanggan.setBarang(br.readLine());
                           
                                        System.out.println("Ganti Jenis Barang : ");
                                        setpelanggan.setJenis(br.readLine());
                           
                                        System.out.println("Ganti Harga Barang : ");
                                        setpelanggan.setHarga(br.readLine());
                                        
                                        System.out.println("Ganti merk Barang : ");
                                        setpelanggan.setMerk(br.readLine());
                                        
                                        System.out.println("Ganti scale : ");
                                        setpelanggan.setscale(Double.parseDouble(br.readLine()));
                                }
                            }
                        }
                        case 3 -> {
                            System.out.println("Masukkan Id Barang :");
                            String Id = br.readLine();
                            for (drum setpelanggan : datadrum){
                                if (setpelanggan.getId().equals(Id)){
                                    System.out.println("Ganti Jumlah Barang : ");
                                        setpelanggan.setJumlah(br.readLine());
                           
                                        System.out.println("Ganti Nama Barang : ");
                                        setpelanggan.setBarang(br.readLine());
                           
                                        System.out.println("Ganti Jenis Barang : ");
                                        setpelanggan.setJenis(br.readLine());
                           
                                        System.out.println("Ganti Harga Barang : ");
                                        setpelanggan.setHarga(br.readLine());
                                        
                                        System.out.println("Ganti merk Barang : ");
                                        setpelanggan.setMerk(br.readLine());
                                        
                                        System.out.println("Ganti scale : ");
                                        setpelanggan.setscale(Double.parseDouble(br.readLine()));
                                }
                            }
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
                            System.out.println("Hapus Id Barang");
                            String hapus_data = br.readLine();
                            for(int i = 0; i < datagitar.size(); i++){
                                if(datagitar.get(i).getId().equals(hapus_data)){
                                    datagitar.remove(i);
                                    System.out.println("data berhasil dihapus");
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Hapus Id Barang");
                            String hapus_data = br.readLine();
                            for(int i = 0; i < datapiano.size(); i++){
                                if(datapiano.get(i).getId().equals(hapus_data)){
                                    datapiano.remove(i);
                                    System.out.println("data berhasil dihapus");
                                }
                            }
                      }
                        case 3 -> {
                            System.out.println("Hapus Id Barang");
                            String hapus_data = br.readLine();
                            for(int i = 0; i < datadrum.size(); i++){
                                if(datadrum.get(i).getId().equals(hapus_data)){
                                    datadrum.remove(i);
                                    System.out.println("data berhasil dihapus");
                                }
                            }
                        }
                   }
                }
               case 5 -> {
                   exitProgram();
                   break;
                   //System.exit(menu);
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