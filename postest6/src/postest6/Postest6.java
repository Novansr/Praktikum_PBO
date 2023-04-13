package postest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public final class Postest6 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<gitar> datagitar = new ArrayList<>();
        ArrayList<piano> datapiano = new ArrayList<>();
        int menu = 0;
        
        while(menu != 5){
            System.out.println("____________________");
            System.out.println("  Toko Alat Musik   ");
            System.out.println("____________________");
            System.out.println("        Menu        ");
            System.out.println("____________________");
            System.out.println("1 Tambah Barang     ");
            System.out.println("2 Lihat Barang      ");
            System.out.println("3 Update Barang     ");
            System.out.println("4 Hapus Barang      ");
            System.out.println("5 Exit              ");
            System.out.println("____________________");
            System.out.print("Pilihan :");
            
           menu = Integer.parseInt(br.readLine());
           
           switch (menu) {
               case 1 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
                   System.out.println("Mau Tambah Data Apa ? :");
                   int pilihan1 = Integer.parseInt(br.readLine());
                   switch (pilihan1) {
                       case 1 -> {
                           System.out.print("Nama : ");
                           String name = br.readLine();
                           System.out.print("Merk : ");
                           String merk = br.readLine();
                           System.out.print("Harga : ");
                           String harga = br.readLine();
                           System.out.print("jenis : ");
                           String jenis = br.readLine();
                           System.out.print("scale : ");
                           double scale = Double.parseDouble(br.readLine());
                           gitar newmusik = new gitar(name, merk, harga, jenis, scale);
                           datagitar.add(newmusik);
                           System.out.print("");
                       }
                       case 2 -> {
                           System.out.print("Nama : ");
                           String name = br.readLine();
                           System.out.print("Merk : ");
                           String merk = br.readLine();
                           System.out.print("Harga : ");
                           String harga = br.readLine();
                           System.out.print("jumlah_tuch : ");
                           int jumlah_tuch = Integer.parseInt(br.readLine());
                           System.out.print("tipe_pedal : ");
                           String tipe_pedal= br.readLine();
                           piano newmusik = new piano(name, merk, harga, jumlah_tuch, tipe_pedal);
                           datapiano.add(newmusik);
                           System.out.print("");
                       }
                   }
                }
          
               case 2 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
                   System.out.println("3. Semua Data");
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
                            int nomor = 1;
                            System.out.println("-----------------------");
                            for (int i = 0; i < datapiano.size(); i++){
                                System.out.println("Data barang Ke : " + nomor);
                                datapiano.get(i).display();
                                nomor++;
                                System.out.println("-----------------------");
                            }
                            for (int j = 0; j < datagitar.size(); j++){
                                System.out.println("Data barang Ke : " + nomor);
                                datagitar.get(j).display();
                                nomor++;
                                System.out.println("-----------------------");
                            }
                        }
                    }
                }
               
                 
               case 3 -> {
                   System.out.println("1. Data Gitar");
                   System.out.println("2. Data Piano");
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
                            System.out.println("======================================");
                            System.out.println("|              UBAH DATA             |");
                            System.out.println("======================================");
                            System.out.println("Nama        : ");    
                            datagitar.get(target).setNama_barang(br.readLine());
                            System.out.println("Merk      :");
                            datagitar.get(target).setMerk_barang(br.readLine());
                            System.out.println("Harga    :");
                            datagitar.get(target).setHarga_barang(br.readLine());
                            System.out.println("Jenis       :");
                            datagitar.get(target).setJenis(br.readLine());
                            System.out.println("Scale        :");
                            datagitar.get(target).setScale(Double.parseDouble(br.readLine()));
                            
                            System.out.println("======================================");
                            System.out.println("");
                        }
                        case 2 -> {
                            for (int i = 0; i < datagitar.size(); i++){
                                datapiano.get(i).display();
                            }
                            System.out.print("Data Ke Berapa Yang Mau Di Ubah ? :");
                            int target = Integer.parseInt(br.readLine());
                            target -= 1;
                            
                            System.out.println("");
                            System.out.println("======================================");
                            System.out.println("|              UBAH DATA             |");
                            System.out.println("======================================");
                            System.out.println("Nama        : ");    
                            datapiano.get(target).setNama_barang(br.readLine());
                            System.out.println("Merk      :");
                            datapiano.get(target).setMerk_barang(br.readLine());
                            System.out.println("Harga    :");
                            datapiano.get(target).setHarga_barang(br.readLine());
                            System.out.println("Jumlah Tuch :");
                            datapiano.get(target).setJumlah_tuch(Integer.parseInt(br.readLine()));
                            System.out.println("Tipe Pedal :");
                            datapiano.get(target).setTipe_pedal(br.readLine());
                            
                            System.out.println("======================================");
                            System.out.println("");
                        }
                    }
               }
               
                
               case 4 -> {
                    System.out.println("1. Data Gitar");
                    System.out.println("2. Data Piano");
                    System.out.println("Mau Hapus Data Apa ? :");
                    
                    int pilihan1 = Integer.parseInt(br.readLine());
                    switch (pilihan1) {
                        case 1 -> {
                            
                            System.out.println("==== Hapus Data Gitar =====");
                            for (int i = 0; i < datagitar.size(); i++){
                                datagitar.get(i).display();
                            }
                            
                            System.out.println("=============================");
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
                            System.out.println("==============================");                            
                            System.out.print("Data Ke Berapa Yang Mau Di Hapus ? :");
                            int targethapus = Integer.parseInt(br.readLine());
                            targethapus -=1;
                            
                            datapiano.remove(targethapus);
                            System.out.println("Data berhasil dihapus");
                        }
                     }
               }
               case 5 -> {
                   break;
                }
               
               default -> {
                   System.out.println("Pilihan Invalid");
               }
                   
           }
        }
    }
}